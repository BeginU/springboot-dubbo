package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.UserService;
import com.example.model.UserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * UserController
 *
 * @author xieming
 * @version 1.0
 * @create 2018-09-04 16:51
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/getUserList")
    @ResponseBody
    public List<UserDto> getUserList(UserDto userDto){
        List<UserDto> userDtoArrayList= new ArrayList<>();
        userDtoArrayList = userService.getUserByParams(userDto);
        return userDtoArrayList;
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public int deleteUser( String id){
        int result = 0;
        try{
            if(id !=null){
                result = userService.deleteUserById(Integer.parseInt(id));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public int addUser(@RequestBody UserDto userDto){
        int result = 0;
        try{
            if(userDto !=null){
                result = userService.addUser(userDto);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public int updateUser(UserDto userDto){
        int result = 0;
        try{
            if(userDto !=null){
                result = userService.updateUser(userDto);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
