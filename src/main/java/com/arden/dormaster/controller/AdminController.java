package com.arden.dormaster.controller;

import com.arden.dormaster.po.Admin;
import com.arden.dormaster.service.AdminService;
import com.arden.dormaster.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller //标识该类为控制层以便向下调用服务层
public class AdminController {


    private AdminService adminService;

    //用户登录
    @RequestMapping(value="/login") //value的值是字符串，用于匹配Http请求地址，有多个时可以设置为{"",""}
    public String login(Admin admin, Model model, HttpSession session, HttpServletRequest request){
        //通过账号和密码查询用户
        //System.out.print(admin.getA_password());
        admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));
        Admin ad=adminService.findAdmin(admin);
        if(ad!=null){
            session.setAttribute(s:"ad",ad);
            return "homepage";
        }
        model.addAllAttributes(s:"msg",o:"用户名或密码错误，请重新登录！")；
        return "login";
    }

    //退出登录
    @RequestMapping(value="/loginout")
    public String loginout(Admin admin,Model model.HttpSession session){
        session.invalidate();
        return "login";
    }

    //删除管理员信息
    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public String deleteAdmin(Integer a_id){
        int a=adminService.deleteAdmin(a_id);
        return "admin_list";
    }

    //修改管理员信息
    @RequestMapping(value="/updateAdmin",method= RequestMethod.POST)
    public String updateAdmin(Admin admin){
        admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));
        int a=adminService.updateAdmin(admin);
        return "redirect:/findAdmin";
    }

    //根据管理员id搜索，将请求数据a_id写入参数a_id
    @RequestMapping(value="/findAdminById")
    public String findAdminById(Integer a_id,HttpSession session){
        Admin a=adminService.findAdminById(a_id);
        session.setAttribute(s:"a",a);
        return "admin_edit";
    }
}
