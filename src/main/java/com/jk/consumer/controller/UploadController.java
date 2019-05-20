package com.jk.consumer.controller;

import com.aliyun.oss.OSSClient;
import com.jk.consumer.util.AliyunOSSClientUtil;
import com.jk.consumer.util.OSSClientConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("upload")
public class UploadController {
    @RequestMapping("upImg")
    @ResponseBody
    public String upImg(MultipartFile artImg, HttpServletRequest req) throws Exception{
        //获取原文件名称
        String fileName = artImg.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String folderPath = req.getSession().getServletContext().getRealPath("/")+
                "upload/";
        File file = new File(folderPath);
        //该目录是否已经存在
        if(!file.exists()){
            //创建文件夹
            file.mkdir();
        }
        String onlyFileName = sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.'));
        FileOutputStream fos = new FileOutputStream(folderPath+onlyFileName);
        fos.write(artImg.getBytes());
        fos.flush();
        fos.close();
        System.out.println(file);

        //得到真正的路径
        File file2 = new File(file+"\\"+onlyFileName);
        System.out.println(file2+"--------------");
        //初始化OSSClient
        OSSClient ossClient = AliyunOSSClientUtil.getOSSClient();
        AliyunOSSClientUtil.uploadObject2OSS(ossClient, file2, OSSClientConstants.BACKET_NAME, OSSClientConstants.FOLDER);
        String url = "https://sgzzl.oss-cn-beijing.aliyuncs.com/zzl/"+onlyFileName;
        return url;
    }
}
