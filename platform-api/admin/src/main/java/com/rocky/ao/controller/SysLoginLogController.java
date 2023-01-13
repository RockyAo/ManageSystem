package com.rocky.ao.controller;


import com.rocky.ao.service.SysLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysLoginLog")
public class SysLoginLogController {

    /**
     * 服务对象
     */
    @Autowired
    private SysLoginLogService sysLoginLogService;
}

