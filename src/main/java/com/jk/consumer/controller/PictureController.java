package com.jk.consumer.controller;

import com.jk.consumer.pojo.PictureBean;
import com.jk.consumer.pojo.navigationBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("picture")
public class PictureController {
    @Autowired
    com.jk.consumer.port.tuneport tuneport;
    //查询图片
    @RequestMapping("findpicture")
    @ResponseBody
    public List<PictureBean> findpicture(){
        return tuneport.findpicture();
    }
    //后台查询图片
    @RequestMapping("findpicturelist")
    @ResponseBody
    public List<PictureBean> findpicturelist(){
        return tuneport.findpicturelist();
    }
    //删除图片
    @RequestMapping("deletepicture")
    @ResponseBody
    public boolean deletepicture(Integer id){
        try {
            tuneport.deletepicture(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //新增修改
    @RequestMapping("addpicturelist")
    @ResponseBody
    public boolean addpicturelist( PictureBean pictureBean){
        try {
            if(pictureBean.getId() == null){
                tuneport.addpicturelist(pictureBean);
            }else {
                tuneport.updatepictures(pictureBean);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //修改回显
    @RequestMapping("updatepicture")
    @ResponseBody
    public PictureBean updatepicture(Integer id){
        return tuneport.updatepicture(id);
    }
}
