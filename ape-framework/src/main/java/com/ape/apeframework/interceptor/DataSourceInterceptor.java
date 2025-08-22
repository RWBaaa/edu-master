package com.ape.apeframework.interceptor;

import com.ape.apeframework.config.DynamicDataSource;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 数据源切换拦截器
 */
public class DataSourceInterceptor implements HandlerInterceptor {
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求路径
        String requestURI = request.getRequestURI();
        
        // 如果请求路径包含ape-admin，则切换到ape-admin数据源
        if (requestURI.contains("/edu")) {
            DynamicDataSource.setDataSource("edu");
        } else {
            // 否则使用主数据源
            DynamicDataSource.setDataSource("primary");
        }
        
        return true;
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 清除数据源设置
        DynamicDataSource.clearDataSource();
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 确保清除数据源设置
        DynamicDataSource.clearDataSource();
    }
}
