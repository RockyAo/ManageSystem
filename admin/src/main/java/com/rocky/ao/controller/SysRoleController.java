package com.rocky.ao.controller;


import com.rocky.ao.service.SysRoleService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysRole")
public class SysRoleController {

    /**
     * 服务对象
     */
    @Autowired
    private SysRoleService sysRoleService;
}

