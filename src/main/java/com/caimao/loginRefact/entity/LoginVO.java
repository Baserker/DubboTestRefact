package com.caimao.loginRefact.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 登录验证的拓展类
 * 模块名称：loginRefact com.caimao.loginRefact.entity
 * 功能说明：<br>
 * 开发人员：Wangyq
 * 创建时间： 2019-05-08 16:56
 * 系统版本：1.0.0
 **/

public class LoginVO implements Serializable{

    private static final long serialVersionUID = 1L;

    private String userToken;

    private List<String> funcList;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public List<String> getFuncList() {
        return funcList;
    }

    public void setFuncList(List<String> funcList) {
        this.funcList = funcList;
    }
}