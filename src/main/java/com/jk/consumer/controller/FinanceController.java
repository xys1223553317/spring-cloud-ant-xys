package com.jk.consumer.controller;

import com.jk.consumer.bean.Buy;
import com.jk.consumer.bean.Finance;
import com.jk.consumer.bean.Money;
import com.jk.consumer.bean.Road;
import com.jk.consumer.rmi.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FinanceController {

    @Autowired
    UserClient userClient;


    //财务报表
    @RequestMapping("findFinanceList")

    public HashMap<String, Object> findFinanceList(Integer page, Integer rows, Finance finance){
        return userClient.findFinanceList(page,rows,finance);
    }


    //运费收入
    @RequestMapping("findBuyList")

    public HashMap<String, Object> findBuyList(Integer page, Integer rows, Buy buy){
        return userClient.findBuyList(page,rows,buy);
    }

    //余额提现
    @RequestMapping("findMoneyList")

    public HashMap<String, Object> findMoneyList(Integer page, Integer rows, Money money){
        return userClient.findMoneyList(page,rows,money);
    }
    //线路管理
    @RequestMapping("findRoadList")

    public HashMap<String, Object> findRoadList(Integer page, Integer rows, Road road){

        return userClient.findRoadList(page, rows, road);

    }


}
