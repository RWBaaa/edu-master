//package com.ape.apeframework.config;
//
//import com.ape.apecommon.utils.StringUtils;
//import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//
///**
// * @Author rwe1
// * @Description 动态路由
// * @Date 08:38 2025/8/22
// **/
//public class DynamicDataSource extends AbstractRoutingDataSource {
//
////    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
//    private static final ThreadLocal<String> CONTEXT_HOLDER = new InheritableThreadLocal<>();
//
//    @Override
//    protected Object determineCurrentLookupKey() {
//
//        String dataSource = DynamicDataSourceContextHolder.peek();
//        if (StringUtils.isNotBlank(dataSource)) {
//            return dataSource;
//        }
//        dataSource = DynamicDataSource.getDataSource();
//        if (StringUtils.isNotBlank(dataSource)) {
//            return dataSource;
//        }
//
//        // 最后使用默认数据源
//        return "primary";
////        return CONTEXT_HOLDER.get();
//    }
//
//    public static void setDataSource(String dataSource) {
//        CONTEXT_HOLDER.set(dataSource);
//    }
//
//    public static String getDataSource() {
//        return CONTEXT_HOLDER.get();
//    }
//
//    public static void clearDataSource() {
//        CONTEXT_HOLDER.remove();
//    }
//}
