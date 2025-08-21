package com.ape.apesystem.mapper;

import com.ape.apesystem.domain.ApeGenTableColumn;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xxxx
 * @version 1.0
 * @description: 代码生成字段mapper
 * @date  2025/10/10 9:26
 */
public interface ApeGenTableColumnMapper extends BaseMapper<ApeGenTableColumn> {

    /**
     * @description: 获取表字段
     * @param: table
     * @return:
     * @author xxxx
     * @date:  2025/10/11 9:45
     */
    List<Map<String, Object>> getTableField(@Param("table") String table);
}
