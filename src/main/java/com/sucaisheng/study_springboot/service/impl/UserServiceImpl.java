package com.sucaisheng.study_springboot.service.impl;

import com.sucaisheng.study_springboot.mapper.UserMapper;
import com.sucaisheng.study_springboot.pojo.Users;
import com.sucaisheng.study_springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Users getUsersById(Integer id) {
        return userMapper.getUsersById(id);
    }
}
