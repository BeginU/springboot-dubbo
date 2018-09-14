package com.example.mapper;

import com.example.model.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserMapeer
 *
 * @author xieming
 * @version 1.0
 * @create 2018-09-04 16:17
 **/
public interface UserMapper {
    /**根据user查询数据**/
    List<UserDto> selectUserByParams(@Param("userDto") UserDto userDto);

    /**添加user**/
    int addUser(@Param("userDto") UserDto userDto);

    /**更新user**/
    int updateUser(@Param("userDto") UserDto userDto);

    /**删除user**/
    int deleteUserById(@Param("id") Integer id);


}
