package com.tit.hcms.mapper;

import com.tit.hcms.bean.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @author 王阳
 * @create 2020-03-19-20:37
 */
@Mapper
public interface UsersMapper {

    //根据用户名查询用户对象是否存在。
    @Select(" select * from users where username=#{username}")
    Users selectByUsername(String username);

    /**
     * 添加用户
     */
    @Insert("insert into Users(id,username,password,status,realname,sex,reamrks,phone) values(#{id},#{username},#{password},#{status},#{realname},#{sex},#{remarks},#{phone})")
    int addUser(Users users);

    //    /**
//     * 查询用户角色
//     */
    @Select(" select role from roles where status=#{status}")
    String selectRole(int status);

}
