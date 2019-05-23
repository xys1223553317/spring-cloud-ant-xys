package com.jk.consumer.controller;

import com.jk.consumer.bean.GoodModel;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("max")
public class GoodController {
    @Autowired
    tuneport tuneport;

    //新增
    @RequestMapping("addgood")
    @ResponseBody
    public void addFood(GoodModel user) {
        tuneport.addFood(user);
    }

    @RequestMapping("toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("index")
    public String index() {

        return "addimg";
    }

    @RequestMapping("false")
    public String falsee() {

        return "false";
    }
}
