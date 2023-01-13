package com.rocky.ao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rocky.ao.model.entity.SysDict;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 字典表(SysDict)表数据库访问层
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:03
 */
public interface SysDictMapper extends BaseMapper<SysDict> {

    /**
     * 分月查询
     */
    List<SysDict> findPage();

    /**
     * 根据标签名称查询
     *
     * @param label 标签
     * @return
     */
    List<SysDict> findByLabel(@Param(value = "label") String label);

    /**
     * 根据标签名称分页查询
     *
     * @param label
     * @return
     */
    List<SysDict> findPageByLabel(@Param("label") String label);
}

