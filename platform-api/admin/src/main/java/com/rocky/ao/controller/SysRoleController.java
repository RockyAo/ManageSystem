package com.rocky.ao.controller;


import com.rocky.ao.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysRole")
public class SysRoleController {

    /**
     * 服务对象
     */
    @Autowired
    private SysRoleService sysRoleService;
}

