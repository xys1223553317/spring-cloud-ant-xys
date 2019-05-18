package com.jk.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("toyundanxinxi")
    public String  toyundanxinxi(){
        return "yundanxinxi";
    }
    @RequestMapping("towlgsxiangqing")
    public String  towlgsxiangqing(Integer id, Model model){
        System.out.println(id);
        model.addAttribute("id",id);
        return "wlgsxingqing";
    }
}
