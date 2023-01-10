package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysUserMapper;
import com.rocky.ao.model.entity.SysUser;
import com.rocky.ao.service.SysUserService;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户管理(SysUser)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:57
 */
@Service
@Transactional
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public List<SysUser> findAll() {
        return baseMapper.findAll();
    }
}

