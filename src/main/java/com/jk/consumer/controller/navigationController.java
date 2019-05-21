package com.jk.consumer.controller;

import com.jk.consumer.pojo.navigationBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("navigation")
public class navigationController {
    @Autowired
    tuneport tuneport;
    //导航栏查询数据
    @RequestMapping("findnavigationbar")
    @ResponseBody
    public List<navigationBean> findnavigationbar(){

        return tuneport.findnavigationbar();
    }
    //管理导航栏查询数据
    @RequestMapping("findnavigationbarlist")
    @ResponseBody
    public List<navigationBean> findnavigationbarlist(){
        return tuneport.findnavigationbarlist();
    }
    //删除导航栏查询数据
    @RequestMapping("deletenavigationbar")
    @ResponseBody
    public boolean deletenavigationbar(Integer id){
        try {
            tuneport.deletenavigationbar(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //新增修改导航栏查询数据
    @RequestMapping("addnavigationlist")
    @ResponseBody
    public boolean addnavigationlist(navigationBean navigationBean){
        try {
            if(navigationBean.getId() == null){
                tuneport.addnavigationlist(navigationBean);
            }else {
                tuneport.updatenavigationbars(navigationBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
   //导航栏查询数据回显
    @RequestMapping("updatenavigationbar")
    @ResponseBody
    public navigationBean updatenavigationbar(Integer id){
        return tuneport.updatenavigationbar(id);
    }
}
