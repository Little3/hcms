package com.tit.hcms.controller;

import com.tit.hcms.bean.Users;
import com.tit.hcms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王阳
 * @create 2020-03-22-12:21
 */
@Controller
public class LoginController {
    @Autowired
    UsersService usersService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/success")
    public String success() {
        return "index.html";
    }

    @RequestMapping("/vip")
    public String vip() {
        return "vip/index.html";
    }

    @RequestMapping("/user")
    public String user() {
        return "user/index.html";
    }
    @ResponseBody
    @RequestMapping("/login")
    public Map<String,Object> login(String username, String password, HttpSession session) {
        Map<String,Object> map = new HashMap<>();
        Users users = usersService.selectByUsername(username);
        if (users==null){
            map.put("msg","用户不存在");
            map.put("sign",0);
        }else if (users!=null) {
            String pwd = password;
            if (pwd.equals(users.getPassword())){
                int status = users.getStatus();
                session.setAttribute("user",users);
                String role = usersService.selectRole(status);
                map.put("sign",1);
                map.put("msg","登录成功");
                map.put("role",role);
            } else {
                map.put("sign",0);
                map.put("msg","密码错误");
            }
        }
        return map;
    }
    @ResponseBody
    @RequestMapping("/menu")
    public Map<String,Object> menu(HttpSession session) {
        Map<String,Object> map = new HashMap<>();
        Users users = (Users) session.getAttribute("user");
        Integer  role = users.getStatus();
        if (role == 1){
            map.put("role",1);
        } else if (role == 2){
            map.put("role",2);
        } else if (role == 3) {
            map.put("role",3);
        } else {
            map.put("role",3);
        }
        return map;
    }
}

