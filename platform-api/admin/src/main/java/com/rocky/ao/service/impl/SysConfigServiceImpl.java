package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysConfigMapper;
import com.rocky.ao.model.entity.SysConfig;
import com.rocky.ao.service.SysConfigService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统配置表(SysConfig)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:03
 */
@Service
@Transactional
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

}

