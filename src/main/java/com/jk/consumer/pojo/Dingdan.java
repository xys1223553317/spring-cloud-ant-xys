package com.jk.consumer.pojo;

public class Dingdan {

    private Integer id;
    private String place1;//出发地
    private String place2;//到达地
    private String sendName;//联系人
    private String sendPhone;//手机
    private String goodsName;//货物名称
    private Integer goodsWeight;//货物重量
    private Integer goodsVolume;//货物立方米
    private Integer goodsNumber;//订单号
    private String note;//其他说明
    private Integer luxianId;
    private String luxianname;//其他说明
    private String qyQuancheng;//其他说明

    private Integer yn; //是否受理
    private String shengchengTime;//生成时间

    public String getShengchengTime() {
        return shengchengTime;
    }

    public void setShengchengTime(String shengchengTime) {
        this.shengchengTime = shengchengTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getLuxianId() {
        return luxianId;
    }

    public void setLuxianId(Integer luxianId) {
        this.luxianId = luxianId;
    }

    public String getLuxianname() {
        return luxianname;
    }

    public void setLuxianname(String luxianname) {
        this.luxianname = luxianname;
    }

    public String getQyQuancheng() {
        return qyQuancheng;
    }

    public void setQyQuancheng(String qyQuancheng) {
        this.qyQuancheng = qyQuancheng;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace1() {
        return place1;
    }

    public void setPlace1(String place1) {
        this.place1 = place1;
    }

    public String getPlace2() {
        return place2;
    }

    public void setPlace2(String place2) {
        this.place2 = place2;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Integer goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Integer getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(Integer goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
