package com.example.api;

import com.example.model.UserDto;

import java.util.List;

/**
 * 用户service
 *
 * @author xieming
 * @version 1.0
 * @create 2018-09-04 15:45
 **/
public interface UserService {

    /**
     * 根据user查询userList
     * @author xieming
     * @date 2018/9/5
     * @param userDto
     * @return
     */
    List<UserDto> getUserByParams(UserDto userDto);

    /**
     * 根据id删除user
     * @author xieming
     * @date 2018/9/5
     * @param id
     * @return
     */
    int deleteUserById(Integer id);

    /**
     * 根据user更新user
     * @author xieming
     * @date 2018/9/5
     * @param userDto
     * @return
     */
    int updateUser(UserDto userDto);

    /**
     * 添加user
     * @author xieming
     * @date 2018/9/5
     * @param userDto
     * @return
     */
    int addUser(UserDto userDto);

}