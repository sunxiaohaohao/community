package com.sun.community.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sun.community.entity.UserPO;
import com.sun.community.mapper.UserMapper;
import com.sun.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserPO getAllUsers() {
        QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username","liubei");
        //
        return userMapper.selectOne(queryWrapper);
    }
}
