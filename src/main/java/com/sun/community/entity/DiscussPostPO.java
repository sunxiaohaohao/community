package com.sun.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@TableName("discuss_post")
@Data
public class DiscussPostPO {
    private Integer id;
    private String userId;
    private String title;
    private String content;
    private Integer type;
    private Integer status;
    private Timestamp createTime;
    private Integer commentCount;
    private Double score;
}
