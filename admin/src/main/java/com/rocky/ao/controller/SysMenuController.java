package com.rocky.ao.controller;


import com.rocky.ao.service.SysMenuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysMenu")
public class SysMenuController {

    /**
     * 服务对象
     */
    @Autowired
    private SysMenuService sysMenuService;
}

