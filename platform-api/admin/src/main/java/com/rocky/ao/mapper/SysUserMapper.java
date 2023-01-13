package com.rocky.ao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rocky.ao.model.entity.SysUser;
import java.util.List;

/**
 * 用户管理(SysUser)表数据库访问层
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:57
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> findAll();

    List<SysUser> findPage();
}

