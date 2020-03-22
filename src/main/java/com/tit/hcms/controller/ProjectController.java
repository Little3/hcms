package com.tit.hcms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王阳
 * @create 2020-03-22-15:27
 */
@Controller
public class ProjectController {
    @RequestMapping("/selectProject")
    public String selectProject(){
        return "/user/selectProject";
    }
    @RequestMapping("/projectView")
    public String projectView(){
        return "/system/projectView";
    }
    @RequestMapping("/addProject")
    public String addProject(){
        return "/system/addProject";
    }
}
