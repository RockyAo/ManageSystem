package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysLoginLogMapper;
import com.rocky.ao.model.entity.SysLoginLog;
import com.rocky.ao.service.SysLoginLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统登录日志(SysLoginLog)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-09 10:47:56
 */
@Service
@Transactional
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLog> implements SysLoginLogService {

}

