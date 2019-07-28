package com.dudg.demo.service.impl;

import com.dudg.demo.dao.entity.User;
import com.dudg.demo.dao.mapper.UserMapper;
import com.dudg.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String test() {
        User user = userMapper.selectByPrimaryKey(1);
        return user.toString();
    }
}
