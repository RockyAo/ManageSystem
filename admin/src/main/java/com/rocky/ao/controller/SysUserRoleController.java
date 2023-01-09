package com.rocky.ao.controller;


import com.rocky.ao.service.SysUserRoleService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysUserRole")
public class SysUserRoleController {

    /**
     * 服务对象
     */
    @Autowired
    private SysUserRoleService sysUserRoleService;
}

