package com.imooc.service;


public interface UserService {

    /**
     * 判断用户名是否存在
     * @param username
     */
    boolean queryUsernameIsExist(String username);
}
