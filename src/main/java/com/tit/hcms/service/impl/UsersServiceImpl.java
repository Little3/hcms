package com.tit.hcms.service.impl;

import com.tit.hcms.bean.Users;
import com.tit.hcms.mapper.UsersMapper;
import com.tit.hcms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author 王阳
 * @create 2020-03-19-20:40
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    /**
     * 根据用户名查询用户对象是否存在。
     * @param username
     * @return Users
     */
    @Override
    public Users selectByUsername(String username) {
        return usersMapper.selectByUsername(username);
    }

    /**
     * 查询用户角色
     * @param status
     * @return
     */
    @Override
    public String selectRole(int status) {
        return usersMapper.selectRole(status);
    }


}
