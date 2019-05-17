package com.jk.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("tozaixian")
    public String  tozaixian(){
        return "zaixian";
    }


    @RequestMapping("toxzgs")
    public String  toxzgs(){
        return "xzgs";
    }
    @RequestMapping("toszwlzx")
    public String  toszwlzx(){
        return "szwlzx";
    }
    @RequestMapping("towuliugs")
    public String  towuliugs(){
        return "wuliugs";
    }
}
