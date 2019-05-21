package com.jk.consumer.pojo;

import lombok.Data;

import javax.annotation.security.DenyAll;

@Data
public class CityBean {
    private Integer id;
    private String name;
}
