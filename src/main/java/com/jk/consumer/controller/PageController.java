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
}
