package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysDictMapper;
import com.rocky.ao.model.entity.SysDict;
import com.rocky.ao.service.SysDictService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 字典表(SysDict)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:56
 */
@Service
@Transactional
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements SysDictService {

}

