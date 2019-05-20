package com.jk.consumer.controller;

import com.jk.consumer.pojo.mgTreeBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("tree")
public class MgTreeController {
    @Autowired
    com.jk.consumer.port.tuneport tuneport;
    @RequestMapping("findtree")
    @ResponseBody
    public List<mgTreeBean> findtree(){
        return tuneport.findtree();
    }
}
