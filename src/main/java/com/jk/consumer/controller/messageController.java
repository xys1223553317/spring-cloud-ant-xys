package com.jk.consumer.controller;

import com.jk.consumer.pojo.CityBean;
import com.jk.consumer.pojo.mgTreeBean;
import com.jk.consumer.pojo.navigationBean;
import com.jk.consumer.pojo.viewinformationBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("message")
public class messageController {
    @Autowired
    tuneport tuneport;
    //查询信息数据
    @RequestMapping("findviewinformation")
    @ResponseBody
    public List<viewinformationBean> findviewinformation(){
        return tuneport.findviewinformation();
    }
    //根据条查查询数据
    @RequestMapping("findviewinformationlist")
    @ResponseBody
    public List<viewinformationBean> findviewinformationlist(Integer citys){
        return tuneport.findviewinformationlist(citys);
    }
    //城市条查
    @RequestMapping("findcityslist")
    @ResponseBody
    public List<CityBean> findcityslist(){
        return tuneport.findcityslist();
    }
    //后台查询信息数据
    @RequestMapping("viewinformationlist")
    @ResponseBody
    public HashMap<String,Object> viewinformationlistviewinformationlist(Integer page,Integer rows){
        return tuneport.viewinformationlist(page,rows);
    }
    //删除后台查询信息数据
    @RequestMapping("deleteviewinformation")
    @ResponseBody
    public boolean deleteviewinformation(Integer id){
        try {
            tuneport.deleteviewinformation(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //新增后台查询信息数据
    @RequestMapping("addviewinformationlist")
    @ResponseBody
    public boolean addviewinformationlist(viewinformationBean viewinformationBean){
        try {
            if (viewinformationBean.getQyId()==null){
                tuneport.addviewinformationlist(viewinformationBean);
            }else {
                tuneport.updateviewinformations(viewinformationBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //回显后台查询信息数据
    @RequestMapping("updateviewinformation")
    @ResponseBody
    public viewinformationBean updateviewinformation(Integer id){
        return tuneport.updateviewinformation(id);
    }
    //新增信息城市下拉框
    @RequestMapping("findcityselect")
    @ResponseBody
    public List<CityBean> findcityselect(){
        return tuneport.findcityselect();
    }
    //修改状态
    @RequestMapping("updastatelist")
    @ResponseBody
    public boolean updastatelist(Integer id){
        try {
            return tuneport.updastatelist(id);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //查询黑名单
    @RequestMapping("findblacklistlist")
    @ResponseBody
    public HashMap<String,Object> findblacklistlist(Integer page,Integer rows){
        return tuneport.findblacklistlist(page,rows);
    }
    //取出名单
    @RequestMapping("updatestatelist")
    @ResponseBody
    public boolean updatestatelist(Integer id){
        try {
            return tuneport.updatestatelist(id);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
