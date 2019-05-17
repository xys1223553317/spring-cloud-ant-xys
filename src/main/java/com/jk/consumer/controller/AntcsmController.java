package com.jk.consumer.controller;


import com.jk.consumer.pojo.Dingdan;
import com.jk.consumer.service.AntcsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ant")
public class AntcsmController {

    @Autowired
    private AntcsmService antcsmService;

    @RequestMapping("addDingdan")
    @ResponseBody
    public void addDingdan(Dingdan dingdan){
        antcsmService.addDingdan(dingdan);
    }

}
