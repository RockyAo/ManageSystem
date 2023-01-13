package com.rocky.ao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rocky.ao.model.entity.SysUser;
import java.util.List;

/**
 * 用户管理(SysUser)表服务接口
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:57
 */
public interface SysUserService extends CurdService<SysUser> {
    List<SysUser> findAll();
}

