package com.rocky.ao.controller;


import com.rocky.ao.service.SysRoleDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysRoleDept")
public class SysRoleDeptController {

    /**
     * 服务对象
     */
    @Autowired
    private SysRoleDeptService sysRoleDeptService;
}

