package com.imooc.service;


import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface UserService {

    /**
     * 判断用户名是否存在
     * @param username
     */
    boolean queryUsernameIsExist(String username);

    /**
     * 创建用户
     * @param userBO
     */
    Users createUser(UserBO userBO);
}
