package com.rocky.ao.controller;


import com.rocky.ao.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysConfig")
public class SysConfigController {

    /**
     * 服务对象
     */
    @Autowired
    private SysConfigService sysConfigService;
}

