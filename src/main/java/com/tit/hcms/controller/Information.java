package com.tit.hcms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王阳
 * @create 2020-03-22-15:33
 */
@Controller
public class Information {
    @RequestMapping("information")
    public String information(){
        return "system/information";
    }
    @RequestMapping("newsManagement")
    public String newsManagement(){
        return "system/newsManagement";
    }
}
