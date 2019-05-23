package com.jk.consumer.controller;

import com.jk.consumer.pojo.LogBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("log")
public class logController {
    @Autowired
    com.jk.consumer.port.tuneport tuneport;
    //查询日志
    @RequestMapping("findlogmanagementlist")
    @ResponseBody
    public HashMap<String,Object> findlogmanagementlist(Integer page, Integer rows, LogBean logBean){
        return tuneport.findlogmanagementlist(page,rows,logBean);
    }
}
