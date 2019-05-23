package com.jk.consumer.controller;

import com.jk.consumer.pojo.htloginBean;
import com.jk.consumer.pojo.mgTreeBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("tree")
public class MgTreeController {
    @Autowired
    com.jk.consumer.port.tuneport tuneport;
    //树
    @RequestMapping("findtree")
    @ResponseBody
    public List<mgTreeBean> findtree(){
        return tuneport.findtree();
    }
    //后台登录
    @RequestMapping("findhtlogin")
    @ResponseBody
    public HashMap<String,Object> findhtlogin(htloginBean htloginBean, HttpServletRequest request){
        return tuneport.findhtlogin(htloginBean,request);
    }
}
