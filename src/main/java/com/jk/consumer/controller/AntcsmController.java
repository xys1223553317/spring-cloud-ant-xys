package com.jk.consumer.controller;


import com.jk.consumer.pojo.Dingdan;
import com.jk.consumer.pojo.WlgsXinxi;
import com.jk.consumer.service.AntcsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ant")
public class AntcsmController {

    @Autowired
    private AntcsmService antcsmService;

    @Autowired
    private RedisTemplate redisTemplate;

    //新增订单
    @RequestMapping("addDingdan")
    /*@ResponseBody*/
    public String addDingdan(Dingdan dingdan){
        antcsmService.addDingdan(dingdan);
        return "yundanxinxi";
    }

    @RequestMapping("selectdingdan")
    @ResponseBody
    public List<Dingdan>selectdingdan(String id){
        String sss = redisTemplate.opsForValue().get("sss").toString();
        return antcsmService.selectdingdan(sss);
    }

    @RequestMapping("selectWuliugsXinxi")
    @ResponseBody
    public List<WlgsXinxi>queryWuliugsXinxi(Integer id){
        return antcsmService.queryWuliugsXinxi(id);
    }


    @RequestMapping("selectWuliugsXinxixiangqing")
    @ResponseBody
    public List<WlgsXinxi>queryWuliugsXinxixiangqing(Integer id){
        return antcsmService.queryWuliugsXinxixiangqing(id);
    }
}
