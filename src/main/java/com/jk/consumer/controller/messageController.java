package com.jk.consumer.controller;

import com.jk.consumer.pojo.CityBean;
import com.jk.consumer.pojo.mgTreeBean;
import com.jk.consumer.pojo.viewinformationBean;
import com.jk.consumer.port.tuneport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("message")
public class messageController {
    @Autowired
    tuneport tuneport;
    @RequestMapping("findviewinformationlist")
    @ResponseBody
    public List<viewinformationBean> findviewinformationlist(viewinformationBean viewinformationBean){
        return tuneport.findviewinformationlist(viewinformationBean);
    }
    //城市条查
    @RequestMapping("findcityslist")
    @ResponseBody
    public List<CityBean> findcityslist(){
        return tuneport.findcityslist();
    }
}
