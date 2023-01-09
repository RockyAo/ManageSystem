package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysUserRoleMapper;
import com.rocky.ao.model.entity.SysUserRole;
import com.rocky.ao.service.SysUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户角色(SysUserRole)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:58
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

}

