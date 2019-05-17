package com.jk.consumer.service;

import com.jk.consumer.pojo.Dingdan;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-ant-provider")
public interface AntcsmService {

    @RequestMapping("saveDingdan")
    void addDingdan(@RequestBody Dingdan dingdan);
}
