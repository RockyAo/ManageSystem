package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysDeptMapper;
import com.rocky.ao.model.entity.SysDept;
import com.rocky.ao.service.SysDeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 机构管理(SysDept)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:56
 */
@Service
@Transactional
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

}

