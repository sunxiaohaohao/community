package com.sun.community.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@TableName("login_ticket")
@Data
public class LoginTicketPO {
    private Integer id;
    private String userId;
    private String ticket;
    private Integer status;
    private Timestamp expired;
}
