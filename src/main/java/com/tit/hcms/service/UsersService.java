package com.tit.hcms.service;

import com.tit.hcms.bean.Users;

import java.util.Set;

/**
 * @author 王阳
 * @create 2020-03-19-20:39
 */

public interface UsersService {

    /**
     * 根据用户名查询用户对象是否存在。
     * @param username
     * @return Users
     */
    Users selectByUsername(String username);

    /**
     * 查询用户角色
     * @param status
     * @return
     */
    String selectRole(int status);
}
