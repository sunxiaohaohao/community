package com.sun.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@TableName("comment")
@Data
public class CommentPO {
    private Integer id;
    private Integer userId;
    private Integer entityId;
    private Integer entityType;
    private Integer targetId;
    private String content;
    private Integer status;
    private Timestamp createTime;
}
