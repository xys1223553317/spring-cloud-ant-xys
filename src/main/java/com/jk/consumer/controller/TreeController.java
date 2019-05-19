package com.jk.consumer.controller;

import com.jk.consumer.pojo.DingdanBean;
import com.jk.consumer.pojo.TreeBean;
import com.jk.consumer.service.TreeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
