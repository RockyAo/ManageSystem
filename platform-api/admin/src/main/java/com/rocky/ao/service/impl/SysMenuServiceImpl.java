package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysMenuMapper;
import com.rocky.ao.model.entity.SysMenu;
import com.rocky.ao.service.SysMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 菜单管理(SysMenu)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:04
 */
@Service
@Transactional
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

}

