package com.tit.hcms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王阳
 * @create 2020-03-22-15:27
 */
@Controller
public class CoachController {
    @RequestMapping("/selectCoach")
    public String selectCoach(){
        return "/user/selectCoach";
    }
    @RequestMapping("/coachMamagement")
    public String coachMamagement(){
        return "/system/coachMamagement";
    }
}
