package com.ape.apeframework.config;

import com.ape.apeframework.interceptor.DataSourceInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.pattern.PathPatternParser;

/**
 * @author xxxx
 * @version 1.0
 * @description: 图片、视频、文件拦截
 * @date  2025/10/20 8:39
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //歌手头像地址
        registry.addResourceHandler("/img/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+System.getProperty("file.separator")
        );

        registry.addResourceHandler("/video/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"video"
                        +System.getProperty("file.separator")+System.getProperty("file.separator")
        );

        registry.addResourceHandler("/file/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"file"
                        +System.getProperty("file.separator")+System.getProperty("file.separator")
        );
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new DataSourceInterceptor())
//                .addPathPatterns("/edu/**");
//    }


    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //为ape-admin包下的controller添加前缀
        configurer.addPathPrefix("/edu", clazz ->
                clazz.getPackage() != null &&
                        clazz.getPackage().getName().startsWith("com.ape.apeadmin")
        );
    }
}
