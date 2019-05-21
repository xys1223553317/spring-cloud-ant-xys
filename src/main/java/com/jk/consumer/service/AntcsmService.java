package com.jk.consumer.service;

import com.jk.consumer.pojo.Dingdan;
import com.jk.consumer.pojo.WlgsXinxi;
import com.jk.consumer.pojo.Xianlu;
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

    @RequestMapping("selectdingdan")
    List<Dingdan> selectdingdan(@RequestParam("id")String id);

    @RequestMapping("selectdingdanxinxi")
    List<Xianlu> selectdingdanxinxi(@RequestParam("leaveid")Integer leaveid,@RequestParam("arriveid") Integer arriveid);

    @RequestMapping("zhuanxianbyshenzhen")
    List<Xianlu> wuliuzhuanxian(@RequestParam("id")Integer id);

    @RequestMapping("zhuanxianbyshenzhenZuijin")
    List<Xianlu> zhuanxianbyshenzhenZuijin(@RequestParam("id") Integer id);
}
