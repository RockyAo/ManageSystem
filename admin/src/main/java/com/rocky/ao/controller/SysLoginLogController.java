package com.rocky.ao.controller;


import com.rocky.ao.service.SysLoginLogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysLoginLog")
public class SysLoginLogController {

    /**
     * 服务对象
     */
    @Autowired
    private SysLoginLogService sysLoginLogService;
}

