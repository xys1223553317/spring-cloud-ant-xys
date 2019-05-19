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
    @RequestMapping("show")
    public String  show(){
        return "show";
    }
    @RequestMapping("luxian")
    public String  luxian(){
        return "luxian";
    }
    @RequestMapping("shouye")
    public String  shouye(){
        return "shouye";
    }
    @RequestMapping("queryDingdan")
    public String  queryDingdan(){
        return "queryDingdan";
    }
}
