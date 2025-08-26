package com.ape.apeframework.utils;

import com.ape.apeframework.provider.ShiroContextProvider;
import com.ape.apesystem.domain.ApeUser;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.0
 * @description: shiro工具类
 * @date  2025/9/12 10:52
 */
public class ShiroUtils {

    private static ShiroContextProvider provider;

    /**
    * @description: 获取当前登陆用户
    */
    public static ApeUser getUserInfo(){
//        return (ApeUser) SecurityUtils.getSubject().getPrincipal();
        ApeUser apeUser = new ApeUser();
        if (provider != null) {
            apeUser.setId(getUserId());
            apeUser.setUserName(getUserName());
        }
        return apeUser;
    }

    public static void setContextProvider(ShiroContextProvider contextProvider) {
        provider = contextProvider;
    }

    public static String getUserId() {
        return provider != null ? provider.getCurrentUserId() : null;
    }

    public static String getUserName() {
        return provider != null ? provider.getCurrentUserName() : null;
    }

    public static boolean hasRole(String role) {
        return provider != null && provider.hasRole(role);
    }

}
