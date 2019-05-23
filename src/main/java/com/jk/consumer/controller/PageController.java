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
    //树
    @RequestMapping("tomgtree")
    public String tomgtree(){
        return "mgtree";
    }
    //图片
    @RequestMapping("topicture")
    public String topicture(){
        return "Picture";
    }
    //新增图片页面
    @RequestMapping("toaddpicture")
    public String toaddpicture(){
        return "addPicture";
    }
    //后台登录
    @RequestMapping("tohtlogin")
    public String tohtlogin(){
        return "htlogin";
    }
    //信息页面
    @RequestMapping("toviewinformation")
    public String toviewinformation(){
        return "viewinformation";
    }
    //信息新增页面
    @RequestMapping("toaddviewinformation")
    public String toaddviewinformation(){
        return "addviewinformation";
    }
    //广告页面
    @RequestMapping("toadvertising")
    public String toadvertising(){
        return "advertising";
    }
    //新增广告页面
    @RequestMapping("toaddadvertising")
    public String toaddadvertising(){
        return "addadvertising";
    }
    //黑名单页面
    @RequestMapping("toblacklist")
    public String toblacklist(){
        return "blacklist";
    }
    //日志页面
    @RequestMapping("tologmanagement")
    public String tologmanagement(){
        return "logmanagement";
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

    //线路管理
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addRoad";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "addMoney";
    }


    @RequestMapping("toEdit")
    public String toEdit(){
        return "bianji";
    }

    //线路新增
    @RequestMapping("toAddRoad")
    public String toAddRoad(){
        return "addroad";
    }

    //导出
    @RequestMapping("findTreeList")
    public String findTreeList(){
        return "daochu";
    }

    @RequestMapping("toUpdateMoney")
    public String toUpdateMoney() {
        return "updateMoney";

    }
    //首页条件查询
    @RequestMapping("toload")
    public String toload(Integer daodashi,Integer shi,Model model) {
        model.addAttribute("shi",shi);
        model.addAttribute("daodashi",daodashi);
        //System.out.println(shi);
        return "load";
    }
    @RequestMapping("adddingdan")
    public String adddingdan(Integer daodashi,Integer shi,Model model) {
        return "adddingdan";
    }
    @RequestMapping("querydingdanzaitu")
    public String querydingdanzaitu() {
        return "querydingdanzaitu";
    }
    @RequestMapping("queryfukuan")
    public String queryfukuan() {
        return "queryfukuan";
    }
    @RequestMapping("qyLogin")
    public String qyLogin(){
        return "qyLogin";
    }
}