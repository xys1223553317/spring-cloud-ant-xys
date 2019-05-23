package com.jk.consumer.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.jk.consumer.pojo.*;
import com.jk.consumer.service.TreeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static com.github.jaiimageio.impl.plugins.tiff.TIFFFaxCompressor.BLACK;
import static org.apache.commons.configuration.plist.PropertyListParserConstants.WHITE;

@RestController
@RequestMapping("tree")
public class TreeController {
    @Autowired
     TreeService treeService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("queryTree")
    public List<TreeBean> queryTree(){
     return treeService.queryTree();
    }
    @RequestMapping("queryDingdan")
    public HashMap<String,Object> queryDingdan(DingdanBean dingdanBean,Integer page,Integer rows,String queryType){
        HashMap<String, Object> hashMap = treeService.queryDingdan(dingdanBean, page, rows,queryType);
        HashMap<String, Object> param = new HashMap<>();
        List<DingdanBean> rows1 = (List<DingdanBean>) hashMap.get("rows");
        Integer total = (Integer) hashMap.get("total");
        param.put("rows",rows1);
        param.put("total",total);
        return param;
    }
    @RequestMapping("queryArea")
    public List<AreaBean> queryArea(Integer pid){
     return treeService.queryArea(pid);
    }
    @RequestMapping("queryAreaShi")
    public List<AreaBean> queryAreaShi(Integer shengid){
        return treeService.queryAreaShi(shengid);
    }
    @RequestMapping("queryAreaXian")
    @ResponseBody
    public  List<AreaBean> queryAreaXian( Integer shi){
        return treeService.queryAreaXian(shi);
    }
    @RequestMapping("queryRoad")
    public  HashMap<String ,Object> queryRoad(Integer shi, Integer daodashi,String queryzl){
      //  List<GongSiiXanLu> gongSiiXanLus = ;
        //model.addAttribute("list",gongSiiXanLus);
        try {
            HashMap<String, Object> map = treeService.queryRoad(shi, daodashi);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(1);
            return null;
        }
    }
    @RequestMapping("updateSouli")
    @ResponseBody
    public void updateSouli(Integer id){
            treeService.updateSouli(id);
    }
    @RequestMapping("queryDingdanZaaitu")
    @ResponseBody
    public HashMap<String,Object> queryDingdanZaaitu(DingdanBean dingdanBean,Integer page,Integer rows){
        return treeService.queryDingdanZaaitu(dingdanBean,page,rows);
    }
    @RequestMapping("queryfukuan")
    @ResponseBody
    public HashMap<String,Object> queryfukuan(DingdanBean dingdanBean,Integer page,Integer rows) {
        return treeService.queryfukuan(dingdanBean, page, rows);
    }

    @RequestMapping("login")
    @ResponseBody
    public HashMap<String, Object> LoginUser(String qyQuancheng,String password) {
        return treeService.LoginUser(qyQuancheng,password);
    }
    @RequestMapping("queryQyName")
    @ResponseBody
    public String queryQyName(){
        String qyName = redisTemplate.opsForValue().get("qyName").toString();
        return qyName;
    }
    @RequestMapping("logout")
    @ResponseBody
    public Boolean logout(){
        try {
            redisTemplate.delete("user");
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
    @RequestMapping("erweima")

    public void grtCode(HttpServletRequest request, HttpServletResponse response, String url) throws IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        if (url == "" || url == null) {
            url = "/ant/toyundanxinxi";
        }
        String requestUrl = request.getScheme() //当前链接使用的协议
                +"://" + "192.168.1.150"//服务器地址
                + ":" + request.getServerPort() //端口号
                + url;
        System.out.println(requestUrl);
        int width = 235;
        int height = 235;
        String content= requestUrl;
        String format = "png";
        String contents=new String(content.getBytes("UTF-8"),"ISO-8859-1");
        HashMap<EncodeHintType,Comparable> map=new HashMap();
        map.put(EncodeHintType.CHARACTER_SET, "utf-8");
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height,map);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.white);
        graphics.clearRect(0, 0, width, height);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) == true ? BLACK : WHITE);
            }
        }
        response.reset();
        response.setContentType("image/png");
        ImageIO.write(image, format, response.getOutputStream());
    }
}
