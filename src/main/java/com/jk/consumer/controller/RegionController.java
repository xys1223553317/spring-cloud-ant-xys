package com.jk.consumer.controller;

import com.jk.consumer.pojo.RegionBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("region")
public class RegionController {
    @Autowired
    tuneport tuneport;
    //查询地区
    @RequestMapping("findregion")
    @ResponseBody
    public List<RegionBean> findregion(){
        return tuneport.findregion();
    }
    //查询城市
    @RequestMapping("findregionpid")
    @ResponseBody
    public List<RegionBean> findregionpid(Integer pid){
        return tuneport.findregionpid(pid);
    }
}
