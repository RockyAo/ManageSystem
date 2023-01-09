package com.rocky.ao.controller;


import com.rocky.ao.service.SysLogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysLog")
public class SysLogController {

    /**
     * 服务对象
     */
    @Autowired
    private SysLogService sysLogService;
}

