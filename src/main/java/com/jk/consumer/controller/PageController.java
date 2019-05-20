package com.jk.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {


    @RequestMapping("test")
    @ResponseBody

    public String test() {
        return "test";
    }

    @RequestMapping("tozaixian")
    public String tozaixian() {
        return "zaixian";
    }


    @RequestMapping("toxzgs")
    public String toxzgs() {
        return "xzgs";
    }

    @RequestMapping("toszwlzx")
    public String toszwlzx() {
        return "szwlzx";
    }

    @RequestMapping("towuliugs")
    public String towuliugs() {
        return "wuliugs";
    }

    @RequestMapping("toyundanxinxi")
    public String toyundanxinxi() {
        return "yundanxinxi";
    }

    @RequestMapping("towlgsxiangqing")
    public String towlgsxiangqing(Integer id, Model model) {
        System.out.println(id);
        model.addAttribute("id", id);
        return "wlgsxingqing";
    }

    @RequestMapping("xinwen")
    public String xinwen() {
        return "xinwen";
    }

    @RequestMapping("gouwu")
    public String gouwu() {
        return "gouwu";
    }


    @RequestMapping("tolmybackground")
    public String tolmybackground() {
        return "lmybackground";
    }

    @RequestMapping("tonavigationbar")
    public String tonavigationbar() {
        return "navigation";
    }

    @RequestMapping("toaddnavigationbar")
    public String toaddnavigationbar() {
        return "addnavigationbar";
    }

    @RequestMapping("show")
    public String show() {
        return "show";
    }

    @RequestMapping("luxian")
    public String luxian() {
        return "luxian";
    }

    @RequestMapping("shouye")
    public String shouye() {
        return "shouye";
    }

    @RequestMapping("queryDingdan")
    public String queryDingdan() {
        return "queryDingdan";

    }

    //财务报表
    @RequestMapping("findFinanceList")
    public String findFinanceList() {
        return "financelist";
    }

    //运费收入
    @RequestMapping("findBuyList")
    public String findBuyList() {
        return "buylist";
    }


    //余额提现
    @RequestMapping("findMoneyList")
    public String findMoneyList() {
        return "moneylist";
    }


    //线路管理
    @RequestMapping("findRoadList")
    public String findRoadList() {
        return "roadlist";
    }

    //增值服务
    @RequestMapping("findList")
    public String findList() {
        return "zengzhi";

    }
}