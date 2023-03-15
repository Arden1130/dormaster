package com.arden.dormaster.controller;

import com.arden.dormaster.po.Admin;
import com.arden.dormaster.service.AdminService;
import com.arden.dormaster.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller //标识该类为控制层以便向下调用服务层
public class AdminController {


    private AdminService adminService;

    @RequestMapping(value="/login") //value的值是字符串，用于匹配Http请求地址，有多个时可以设置为{"",""}
    public String login(Admin admin, Model model, HttpSession session, HttpServletRequest request){
        //通过账号和密码查询用户
        //System.out.print(admin.getA_password());
        admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));

    }
}
