package com.ape.apeframework.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author rwe1
 * @Description 动态路由
 * @Date 08:38 2025/8/22
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {

//    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
    private static final ThreadLocal<String> CONTEXT_HOLDER = new InheritableThreadLocal<>();

    @Override
    protected Object determineCurrentLookupKey() {
        return CONTEXT_HOLDER.get();
    }

    public static void setDataSource(String dataSource) {
        CONTEXT_HOLDER.set(dataSource);
    }

    public static String getDataSource() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDataSource() {
        CONTEXT_HOLDER.remove();
    }
}
