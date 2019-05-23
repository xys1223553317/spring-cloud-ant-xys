package com.jk.consumer.controller;

import com.jk.consumer.pojo.AreaBean;
import com.jk.consumer.pojo.DingdanBean;
import com.jk.consumer.pojo.GongSiiXanLu;
import com.jk.consumer.pojo.TreeBean;
import com.jk.consumer.service.TreeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("tree")
public class TreeController {
    @Autowired
     TreeService treeService;
    @RequestMapping("queryTree")
    public List<TreeBean> queryTree(){
     return treeService.queryTree();
    }
    @RequestMapping("queryDingdan")
    public HashMap<String,Object> queryDingdan(DingdanBean dingdanBean,Integer page,Integer rows,String queryType){
        HashMap<String, Object> hashMap = treeService.queryDingdan(dingdanBean, page, rows,queryType);
        HashMap<String, Object> param = new HashMap<>();
        List<DingdanBean> rows1 = (List<DingdanBean>) hashMap.get("rows");
        Integer total = (Integer) hashMap.get("total");
        param.put("rows",rows1);
        param.put("total",total);
        return param;
    }
    @RequestMapping("queryArea")
    public List<AreaBean> queryArea(Integer pid){
     return treeService.queryArea(pid);
    }
    @RequestMapping("queryAreaShi")
    public List<AreaBean> queryAreaShi(Integer shengid){
        return treeService.queryAreaShi(shengid);
    }
    @RequestMapping("queryAreaXian")
    @ResponseBody
    public  List<AreaBean> queryAreaXian( Integer shi){
        return treeService.queryAreaXian(shi);
    }
    @RequestMapping("queryRoad")
    public  HashMap<String ,Object> queryRoad(Integer shi, Integer daodashi,String queryzl){
      //  List<GongSiiXanLu> gongSiiXanLus = ;
        //model.addAttribute("list",gongSiiXanLus);
        try {
            HashMap<String, Object> map = treeService.queryRoad(shi, daodashi);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(1);
            return null;
        }
    }
    @RequestMapping("updateSouli")
    @ResponseBody
    public void updateSouli(Integer id){
            treeService.updateSouli(id);
    }
    @RequestMapping("queryDingdanZaaitu")
    @ResponseBody
    public HashMap<String,Object> queryDingdanZaaitu(DingdanBean dingdanBean,Integer page,Integer rows){
        return treeService.queryDingdanZaaitu(dingdanBean,page,rows);
    }
    @RequestMapping("queryfukuan")
    @ResponseBody
    public HashMap<String,Object> queryfukuan(DingdanBean dingdanBean,Integer page,Integer rows) {
        return treeService.queryfukuan(dingdanBean, page, rows);
    }
}
