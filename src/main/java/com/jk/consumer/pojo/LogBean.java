package com.jk.consumer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data

public class LogBean {
    private String id;
    private String className;
    private String methodName;
    private String params;
    private String responseBody;
    private String ip;
    private Integer userId;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;
}
