package com.jk.consumer.bean;

import lombok.Data;

@Data
public class Buy {

    private Integer id;

    private String number;

    private String createTime;

    private Double gmoney;

    private Double fmoney;

    private Double jmoney;

    private Integer status;

    private String startTime;

    private String endTime;

}
