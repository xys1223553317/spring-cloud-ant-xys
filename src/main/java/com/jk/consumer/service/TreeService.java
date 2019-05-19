package com.jk.consumer.service;

import com.jk.consumer.pojo.AreaBean;
import com.jk.consumer.pojo.DingdanBean;
import com.jk.consumer.pojo.TreeBean;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient("SERVICECONSUMER")
public interface TreeService {
    @RequestMapping("queryTree")
    List<TreeBean> queryTree();
    @RequestMapping("queryDingdan")
    HashMap<String, Object> queryDingdan(@RequestBody DingdanBean dingdanBean, @RequestParam("page") Integer page, @RequestParam("rows")  Integer rows,@RequestParam("queryType")String queryType);
    @RequestMapping("queryArea")
    List<AreaBean> queryArea( @RequestParam("id")Integer pid);
    @RequestMapping("queryArea")
    List<AreaBean> queryAreaShi(@RequestParam("shengid") Integer shengid);
}
