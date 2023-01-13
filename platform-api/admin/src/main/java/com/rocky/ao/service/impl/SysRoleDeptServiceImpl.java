package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysRoleDeptMapper;
import com.rocky.ao.model.entity.SysRoleDept;
import com.rocky.ao.service.SysRoleDeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色机构(SysRoleDept)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:05
 */
@Service
@Transactional
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDept> implements SysRoleDeptService {

}

