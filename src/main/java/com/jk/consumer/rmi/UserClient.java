package com.jk.consumer.rmi;

import com.jk.consumer.bean.Buy;
import com.jk.consumer.bean.Finance;
import com.jk.consumer.bean.Money;
import com.jk.consumer.bean.Road;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

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


}
