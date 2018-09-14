package com.example.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.UserService;
import com.example.mapper.UserMapper;
import com.example.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * userServiceImpl
 *
 * @author xieming
 * @version 1.0
 * @create 2018-09-04 15:50
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> getUserByParams(UserDto userDto) {
        return userMapper.selectUserByParams(userDto);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int updateUser(UserDto userDto) {
        return userMapper.updateUser(userDto);
    }

    @Override
    public int addUser(UserDto userDto) {
        return userMapper.addUser(userDto);
    }
}
