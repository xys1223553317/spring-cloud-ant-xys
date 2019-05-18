package com.jk.consumer.service;

import com.jk.consumer.pojo.Dingdan;
import com.jk.consumer.pojo.WlgsXinxi;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("springcloud-ant-provider")
public interface AntcsmService {

    @RequestMapping("saveDingdan")
    void addDingdan(@RequestBody Dingdan dingdan);

    @RequestMapping("queryWuliugsXinxi")
    List<WlgsXinxi> queryWuliugsXinxi(@RequestParam("id") Integer id);

    @RequestMapping("queryWuliugsXinxixiangqing")
    List<WlgsXinxi> queryWuliugsXinxixiangqing(@RequestParam("id") Integer id);
}
