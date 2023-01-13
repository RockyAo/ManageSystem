package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysRoleMenuMapper;
import com.rocky.ao.model.entity.SysRoleMenu;
import com.rocky.ao.service.SysRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色菜单(SysRoleMenu)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:05
 */
@Service
@Transactional
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

}

