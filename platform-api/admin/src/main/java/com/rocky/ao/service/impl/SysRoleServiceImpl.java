package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysRoleMapper;
import com.rocky.ao.model.entity.SysRole;
import com.rocky.ao.service.SysRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色管理(SysRole)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:04
 */
@Service
@Transactional
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}

