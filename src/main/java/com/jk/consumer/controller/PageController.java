package com.jk.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("xinwen")
    public String  xinwen(){
        return "xinwen";
    }

    @RequestMapping("gouwu")
    public String  gouwu(){
        return "gouwu";
    }
}
