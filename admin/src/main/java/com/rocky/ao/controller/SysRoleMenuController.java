package com.rocky.ao.controller;


import com.rocky.ao.service.SysRoleMenuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysRoleMenu")
public class SysRoleMenuController {

    /**
     * 服务对象
     */
    @Autowired
    private SysRoleMenuService sysRoleMenuService;
}

