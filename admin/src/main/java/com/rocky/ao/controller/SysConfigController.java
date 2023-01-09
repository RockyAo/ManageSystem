package com.rocky.ao.controller;


import com.rocky.ao.service.SysConfigService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysConfig")
public class SysConfigController {

    /**
     * 服务对象
     */
    @Autowired
    private SysConfigService sysConfigService;
}

