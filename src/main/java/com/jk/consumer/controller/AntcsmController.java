package com.jk.consumer.controller;


import com.jk.consumer.pojo.Dingdan;
import com.jk.consumer.pojo.WlgsXinxi;
import com.jk.consumer.pojo.Xianlu;
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

    int lxId=0;

    @RequestMapping("selectdingdanxinxi")
    @ResponseBody
    public List<Xianlu>selectdingdanxinxi(Integer leaveid, Integer arriveid){
        List<Xianlu> selectdingdanxinxi = antcsmService.selectdingdanxinxi(leaveid, arriveid);
        lxId= selectdingdanxinxi.get(0).getId();
        return selectdingdanxinxi;
    }

    //新增订单
    @RequestMapping("addDingdan")
    /*@ResponseBody*/
    public String addDingdan(Dingdan dingdan){
        dingdan.setLuxianId(lxId);
        antcsmService.addDingdan(dingdan);
        return "redirect:toyundanxinxi";
    }

    @RequestMapping("toyundanxinxi")
    public String  toyundanxinxi(){
        return "yundanxinxi";
    }

    @RequestMapping("selectdingdan")
    @ResponseBody
    public List<Dingdan>selectdingdan(String id){
        String sss = redisTemplate.opsForValue().get("sss").toString();
        System.out.println(sss);
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
    @RequestMapping("zhuanxianbyshenzhen")
    @ResponseBody
    public List<Xianlu>wuliuzhuanxian(Integer id){
        return antcsmService.wuliuzhuanxian(id);
    }
    @RequestMapping("zhuanxianbyshenzhenZuijin")
    @ResponseBody
    public List<Xianlu>zhuanxianbyshenzhenZuijin(Integer id){
        return antcsmService.zhuanxianbyshenzhenZuijin(id);
    }
    @RequestMapping("zhuanxianbyshenzhenRemen")
    @ResponseBody
    public List<Xianlu>zhuanxianbyshenzhenRemen(Integer id){
        return antcsmService.zhuanxianbyshenzhenZuijin(id);
    }


}
