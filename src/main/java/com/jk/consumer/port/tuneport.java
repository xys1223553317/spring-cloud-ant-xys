package com.jk.consumer.port;

import com.jk.consumer.pojo.navigationBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="zzl")
public interface tuneport {

    @RequestMapping("findnavigationbar")
    List<navigationBean> findnavigationbar();
    @RequestMapping("findnavigationbarlist")
    List<navigationBean> findnavigationbarlist();
    @RequestMapping("deletenavigationbar")
    void deletenavigationbar(@RequestParam("id") Integer id);
    @RequestMapping("addnavigationlist")
    void addnavigationlist(@RequestBody navigationBean navigationBean);
    @RequestMapping("updatenavigationbar")
    navigationBean updatenavigationbar(@RequestParam("id")Integer id);
    @RequestMapping("addnavigationlist")
    void updatenavigationbars(@RequestBody navigationBean navigationBean);
}
