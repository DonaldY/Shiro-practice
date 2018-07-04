package com.donaldy.service;

import com.donaldy.mapper.UserMapper;
import com.donaldy.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by DonaldY on 2018/7/4.
 */
@Component
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserMapper userMapper;
    
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
