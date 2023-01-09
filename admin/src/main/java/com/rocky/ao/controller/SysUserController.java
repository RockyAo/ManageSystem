package com.rocky.ao.controller;


import com.rocky.ao.service.SysUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysUser")
public class SysUserController {

    /**
     * 服务对象
     */
    @Autowired
    private SysUserService sysUserService;
}

