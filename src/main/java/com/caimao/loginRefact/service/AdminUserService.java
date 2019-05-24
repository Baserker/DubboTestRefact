package com.caimao.loginRefact.service;

import com.caimao.loginRefact.entity.LoginVO;

import java.util.List;

/**
 * 用户接口层
 * 模块名称：CaimaoDevOps com.caimao.devops.service
 * 功能说明：<br>
 * 开发人员：Luzx
 * 创建时间： 2019-05-08 15:35
 * 系统版本：1.0.0
 **/
public interface AdminUserService {

    public List<LoginVO> testGetAll();

    /**
     * 获取用户的登录信息
     * @param userName
     * @param password
     * @return
     */
    public LoginVO getUserToken(String userName,String password);
}
