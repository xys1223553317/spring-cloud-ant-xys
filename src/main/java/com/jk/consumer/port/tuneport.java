package com.jk.consumer.port;

import com.jk.consumer.pojo.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@FeignClient(value="zzl")
public interface tuneport {

    @RequestMapping("findnavigationbar")
    List<navigationBean> findnavigationbar();
    @RequestMapping("findnavigationbarlist")
    List<navigationBean> findnavigationbarlist();
    @RequestMapping("deletenavigationbar")
    void deletenavigationbar(@RequestParam("id") Integer id);
    @RequestMapping("addnavigationlist")
    void addnavigationlist(@RequestBody navigationBean navigationBean);
    @RequestMapping("updatenavigationbar")
    navigationBean updatenavigationbar(@RequestParam("id")Integer id);
    @RequestMapping("addnavigationlist")
    void updatenavigationbars(@RequestBody navigationBean navigationBean);
    @RequestMapping("findpicture")
    List<PictureBean> findpicture();
    //查询树
    @RequestMapping("findtree")
    List<mgTreeBean> findtree();
    //查询合同图片
    @RequestMapping("findpicturelist")
    List<PictureBean> findpicturelist();
    @RequestMapping("deletepicture")
    void deletepicture(@RequestParam("id")Integer id);
    @RequestMapping("addpicturelist")
    void addpicturelist(@RequestBody PictureBean pictureBean);
    @RequestMapping("updatepicture")
    PictureBean updatepicture(@RequestParam("id")Integer id);
    @RequestMapping("addpicturelist")
    void updatepictures(@RequestBody PictureBean pictureBean);
    //查询地区
    @RequestMapping("findregion")
    List<RegionBean> findregion();
    @RequestMapping("findregionpid")
    List<RegionBean> findregionpid(@RequestParam("pid")Integer pid);
    @RequestMapping("findviewinformationlist")
    List<viewinformationBean> findviewinformationlist(@RequestParam("citys") Integer citys);
    @RequestMapping("findcityslist")
    List<CityBean> findcityslist();
    @RequestMapping("findhtlogin")
    HashMap<String, Object> findhtlogin(@RequestBody htloginBean htloginBean,@RequestParam("request") HttpServletRequest request);
    @RequestMapping("findviewinformation")
    List<viewinformationBean> findviewinformation();
    @RequestMapping("viewinformationlist")
    HashMap<String, Object> viewinformationlist(@RequestParam("page")Integer page,@RequestParam("rows") Integer rows);
    @RequestMapping("deleteviewinformation")
    void deleteviewinformation(@RequestParam("id")Integer id);
    @RequestMapping("addviewinformationlist")
    void addviewinformationlist(@RequestBody viewinformationBean viewinformationBean);
    @RequestMapping("updateviewinformation")
    viewinformationBean updateviewinformation(@RequestParam("id") Integer id);
    @RequestMapping("addviewinformationlist")
    void updateviewinformations(@RequestBody viewinformationBean viewinformationBean);
}
