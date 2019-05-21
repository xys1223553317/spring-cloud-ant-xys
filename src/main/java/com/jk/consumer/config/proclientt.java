package com.jk.consumer.config;


import com.jk.consumer.pojo.AreaBean;
import com.jk.consumer.pojo.Bids;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient(value="xjb")
public interface proclientt {

    @RequestMapping("findBids")
    HashMap<String,Object> findBids(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody Bids bids);
    @RequestMapping("queryArea")
    List<AreaBean> queryArea(@RequestParam("pid") Integer pid);
    @RequestMapping("queryAreaShi")
    List<AreaBean> queryAreaShi(@RequestParam("shengid") Integer shengid);
    @RequestMapping("queryShow")
    List<Bids> queryShow(@RequestParam("id") Integer id);

}
