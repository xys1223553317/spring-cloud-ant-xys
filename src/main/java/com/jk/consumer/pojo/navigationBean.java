package com.jk.consumer.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class navigationBean implements Serializable {
    private Integer id;
    private String text;
    private String url;
}
