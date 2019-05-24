package com.caimao.loginRefact.utils;

import java.util.UUID;

/**
 * UserToken的工具类
 * 模块名称：CaimaoDevOps com.caimao.loginRefact.utils
 * 功能说明：<br>
 * 开发人员：Luzx
 * 创建时间： 2019-05-09 16:24
 * 系统版本：1.0.0
 **/

public class TokenUtil {

    public static TokenUtil getIntance(){
        return new TokenUtil();
    }

    /**
     * 生成用户Token
     * @param userId
     * @return
     */
    public String createToken(int userId){
        //生成token
        UUID uuid = UUID.randomUUID();
        String token = userId+"_"
                +uuid.toString().replaceAll("-", "");
        return token;
    }

    public boolean checkToken(String token){
        if(token==null || "".equals(token)){
            return false;
        }
        String[] arr1 = token.split("_");
        if(arr1.length != 2){
            return false;
        }
        return false;
    }

}