package com.rocky.ao.controller;


import com.rocky.ao.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysLog")
public class SysLogController {

    /**
     * 服务对象
     */
    @Autowired
    private SysLogService sysLogService;
}

