package com.jk.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("test")
    @ResponseBody
    public String  test(){
        return "test";
    }
    @RequestMapping("tolmybackground")
    public String tolmybackground(){
        return "lmybackground";
    }
    @RequestMapping("tonavigationbar")
    public String tonavigationbar(){
        return "navigation";
    }
    @RequestMapping("toaddnavigationbar")
    public String toaddnavigationbar(){
        return "addnavigationbar";
    }
    //树
    @RequestMapping("tomgtree")
    public String tomgtree(){
        return "mgtree";
    }
    //图片
    @RequestMapping("topicture")
    public String topicture(){
        return "Picture";
    }
    //新增图片页面
    @RequestMapping("toaddpicture")
    public String toaddpicture(){
        return "addPicture";
    }
    //后台登录
    @RequestMapping("tohtlogin")
    public String tohtlogin(){
        return "htlogin";
    }
    //信息页面
    @RequestMapping("toviewinformation")
    public String toviewinformation(){
        return "viewinformation";
    }
    //信息新增页面
    @RequestMapping("toaddviewinformation")
    public String toaddviewinformation(){
        return "addviewinformation";
    }
}
