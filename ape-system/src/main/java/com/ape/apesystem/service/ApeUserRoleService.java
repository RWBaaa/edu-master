package com.ape.apesystem.service;

import com.ape.apesystem.domain.ApeUserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * @author xxxx
 * @version 1.0
 * @description: 用户角色关系service
 * @date  2025/8/31 14:36
 */
public interface ApeUserRoleService extends IService<ApeUserRole> {

    /**
    * @description: 根据账号获取角色
    * @param: loginAccount
    * @return:
    * @author xxxx
    * @date:  2025/9/7 17:01
    */
    Set<String> getUserRolesSet(String loginAccount);

}
