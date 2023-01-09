package com.rocky.ao.controller;


import com.rocky.ao.service.SysRoleDeptService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysRoleDept")
public class SysRoleDeptController {

    /**
     * 服务对象
     */
    @Autowired
    private SysRoleDeptService sysRoleDeptService;
}

