package com.jk.consumer.controller;


import com.jk.consumer.config.proclientt;
import com.jk.consumer.pojo.AreaBean;
import com.jk.consumer.pojo.Bids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class HttpController {

    @Autowired
    private proclientt proclientt;


    @RequestMapping("findBids")
    @ResponseBody
    public HashMap<String, Object> findBids(Integer page, Integer rows, Bids bids) {
        return proclientt.findBids(page, rows, bids);
    }

    @RequestMapping("queryArea")
    public List<AreaBean> queryArea(Integer pid) {
        return proclientt.queryArea(pid);
    }

    @RequestMapping("queryAreaShi")
    public List<AreaBean> queryAreaShi(Integer shengid) {
        return proclientt.queryAreaShi(shengid);
    }

    @RequestMapping("queryShow")
    public  List<Bids> queryShow(Integer id){
        return proclientt.queryShow(id);
    }
}
