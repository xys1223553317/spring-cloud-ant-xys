package com.jk.consumer.rmi;

import com.jk.consumer.bean.*;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@FeignClient(value ="qsy")
public interface UserClient {

    //财务报表
    @RequestMapping("findFinanceList")
    public HashMap<String, Object>  findFinanceList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody Finance finance);


    //运费收入
    @RequestMapping("findBuyList")
    public HashMap<String, Object> findBuyList(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows, @RequestBody Buy buy);

    //余额提现
    @RequestMapping("findMoneyList")
    public HashMap<String, Object> findMoneyList(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows, @RequestBody Money money);


    //线路管理
    @RequestMapping("findRoadList")
    public HashMap<String, Object> findRoadList(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows, @RequestBody Road road);


   /* @RequestMapping("queryArea")

    public List<Area>queryArea(@RequestParam("id") Integer pid);


    @RequestMapping("queryAreaShi")
    public  List<Area> queryAreaShi(@RequestParam("shengid") Integer shengid);


    @RequestMapping("queryAreaXian")
    public  List<Area> queryAreaXian(@RequestParam("shi") Integer shi);
*/


    }




