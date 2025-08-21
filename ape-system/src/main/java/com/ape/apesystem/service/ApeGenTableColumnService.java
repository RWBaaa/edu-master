package com.ape.apesystem.service;

import com.ape.apesystem.domain.ApeGenTableColumn;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author xxxx
 * @version 1.0
 * @description: 代码生成字段service
 * @date  2025/10/10 9:28
 */
public interface ApeGenTableColumnService extends IService<ApeGenTableColumn> {

    /**
    * @description: 获取表字段
    * @param: table
    * @return:
    * @author xxxx
    * @date:  2025/10/11 9:45
    */
    List<Map<String, Object>> getTableField(String table);
}
