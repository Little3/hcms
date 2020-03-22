package com.tit.hcms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王阳
 * @create 2020-03-22-12:43
 */
@Controller
public class UsersController {

    @RequestMapping("/userInfo")
    public String userInfo(){
        return "user/userInfo";
    }
    @RequestMapping("/updateInfo")
    public String updateInfo(){
        return "user/updateInfo";
    }
    @RequestMapping("/vipCard")
    public String vipCard(){
        return "vip/vipCard";
    }
    @RequestMapping("/account")
    public String account(){
        return "vip/account";
    }
    @RequestMapping("/rechange")
    public String rechange(){
        return "vip/rechange";
    }
    @RequestMapping("/consumeRecord")
    public String consumeRecord(){
        return "vip/consumeRecord";
    }

  @RequestMapping("/vipCardManagement")
    public String vipCardManagement(){
        return "system/vipCardManagement";
    }
    @RequestMapping("/usersManagement")
    public String usersManagement(){
        return "system/usersManagement";
    }
    @RequestMapping("/vipUsersManagement")
    public String vipUsersManagement(){
        return "system/vipUsersManagement";
    }
    @RequestMapping("/vipCardRecharge")
    public String vipCardRecharge(){
        return "system/vipCardRecharge";
    }
    @RequestMapping("/vipConsumeRecord")
    public String vipConsumeRecord(){
        return "system/vipConsumeRecord";
    }
    @RequestMapping("/vipRecharge")
    public String vipRecharge(){
        return "system/vipRecharge";
    }


}
