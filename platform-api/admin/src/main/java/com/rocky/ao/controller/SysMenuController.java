package com.rocky.ao.controller;


import com.rocky.ao.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysMenu")
public class SysMenuController {

    /**
     * 服务对象
     */
    @Autowired
    private SysMenuService sysMenuService;
}

