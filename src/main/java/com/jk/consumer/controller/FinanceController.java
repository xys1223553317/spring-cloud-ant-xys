package com.jk.consumer.controller;

import com.jk.consumer.bean.*;
import com.jk.consumer.rmi.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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



    @RequestMapping("queryArea")

    public List<Area>queryArea( Integer pid){
        List<Area> areas = userClient.queryArea(pid);
        return areas;
    }
    @RequestMapping("queryAreaShi")

    public  List<Area> queryAreaShi( Integer shengid){
        return userClient.queryAreaShi(shengid);
    }
    @RequestMapping("queryAreaXian")

    public  List<Area> queryAreaXian( Integer shi){
        return userClient.queryAreaXian(shi);
    }


    //新增路线
    @RequestMapping("saveRoad")
    public Boolean saveRoad(Road road){
        try {
            userClient.saveRoad(road);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }



    //导出
    @RequestMapping("findTreeList")
    public List<Money> findTreeList(){
        return userClient.findTreeList();
    }

    @RequestMapping("exportPoi")
    public ResponseEntity<byte[]> exportExcel(String ids){
        return userClient.exportExcel(ids);
    }

    @RequestMapping("getzhexiantu")
    public List<Money> getzhexiantu(Money money){
        return userClient.getzhexiantu(money);
    }

    @RequestMapping("updateMoney")
    public void updateMoney( Integer id, Money money){
        userClient.updateMoney(id,money);
    }

    @RequestMapping("findMoneyById")
    public Money findMoneyById( Integer id){
        return userClient.findMoneyById(id);
    }
}
