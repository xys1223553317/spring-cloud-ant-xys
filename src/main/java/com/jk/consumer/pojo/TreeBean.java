package com.jk.consumer.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TreeBean implements Serializable {
    private  Integer id;
    private  String text;
    private  String href;
    private  Integer pid;
    private List<TreeBean> nodes;
    private Boolean seletetable;
}
