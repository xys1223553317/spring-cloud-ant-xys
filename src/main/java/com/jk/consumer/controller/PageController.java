package com.jk.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {


    @RequestMapping("test")
    @ResponseBody
    public String  test(){
        return "test";
    }


    //财务报表
    @RequestMapping("findFinanceList")
    public String findFinanceList(){
        return "financelist";
    }

    //运费收入
    @RequestMapping("findBuyList")
    public String findBuyList(){
        return "buylist";
    }


    //余额提现
    @RequestMapping("findMoneyList")
    public String findMoneyList(){
        return "moneylist";
    }


    //线路管理
    @RequestMapping("findRoadList")
    public String findRoadList(){
        return "roadlist";
    }

    //增值服务
    @RequestMapping("findList")
    public String findList(){
        return "zengzhi";
    }

    //线路管理
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addRoad";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }


    @RequestMapping("toEdit")
    public String toEdit(){
        return "bianji";
    }
}
