package com.rocky.ao.service.impl;

import com.rocky.ao.mapper.SysUserMapper;
import com.rocky.ao.model.entity.SysUser;
import com.rocky.ao.page.MybatisPageHelper;
import com.rocky.ao.page.PageRequest;
import com.rocky.ao.page.PageResult;
import com.rocky.ao.service.SysUserService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户管理(SysUser)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:57
 */
@Service
@Slf4j
@AllArgsConstructor
public class SysUserServiceImpl implements SysUserService {

    private final SysUserMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int save(SysUser record) {
        return 0;
    }

    @Override
    public int delete(SysUser record) {
        return 0;
    }

    @Override
    public int delete(List<SysUser> records) {
        return 0;
    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest request) {
        return MybatisPageHelper.findPage(request, userMapper);
    }
}

