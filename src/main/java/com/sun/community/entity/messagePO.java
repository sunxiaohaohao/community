package com.sun.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@TableName("message")
@Data
public class messagePO {
    private Integer id;
    private Integer fromId;
    private Integer toId;
    private String conversationId;
    private String content;
    private Integer status;
    private Timestamp createTime;
}
