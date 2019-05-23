package com.jk.consumer.pojo;

import lombok.Data;

@Data
public class DingdanBean {
    private Integer id;
    private String place1;//出发地
    private String place2;//到达地
    private String sendName;//联系人
    private String sendPhone;//手机
    private String goodsName;//货物名称
    private Integer goodsWeight;//货物重量
    private Integer goodsVolume;//货物立方米
    private String note;//其他说明
    private Integer goodsNumber;//其他说明

    private Integer type;

    private String startTime;

    private String endTime;

    private Integer yn;

    private String shengchengTime;

}
