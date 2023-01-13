package com.rocky.ao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rocky.ao.mapper.SysLogMapper;
import com.rocky.ao.model.entity.SysLog;
import com.rocky.ao.service.SysLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统操作日志(SysLog)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:04
 */
@Service
@Transactional
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

}

