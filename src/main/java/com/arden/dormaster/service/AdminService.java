package com.arden.dormaster.service;

import com.arden.dormaster.po.Admin;
import com.arden.dormaster.po.PageInfo;

import java.util.List;

public interface AdminService {
    //通过账号和密码查询用户
    public Admin findAdmin(Admin admin);

    //找到所有数据
    public List<Admin> getAll();

     //分页查询
    public PageInfo<Admin> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize);

    //添加管理员信息
    public int addAdmin(Admin admin);

    //删除管理员信息
    public int deleteAdmin(Integer a_id);

    //修改管理员信息
    public int updateAdmin(Admin admin);

    public Admin findAdminById(Integer a_id);

}
