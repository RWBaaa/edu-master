package com.ape.apeframework.provider;

public interface ShiroContextProvider {
    String getCurrentUserId();
    String getCurrentUserName();
    boolean hasRole(String role);
    boolean hasPermission(String permission);
    Object getCurrentUser();
}
