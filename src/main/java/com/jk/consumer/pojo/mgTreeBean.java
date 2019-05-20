package com.jk.consumer.pojo;

import lombok.Data;

import java.util.List;

@Data
public class mgTreeBean {
    private Integer id;
    private String text;
    private String href;
    private Integer pid;
    private List<mgTreeBean> nodes;
    private Boolean selectable;
}
