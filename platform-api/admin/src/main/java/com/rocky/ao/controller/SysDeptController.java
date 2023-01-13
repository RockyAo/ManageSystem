package com.rocky.ao.controller;


import com.rocky.ao.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysDept")
public class SysDeptController {

    /**
     * 服务对象
     */
    @Autowired
    private SysDeptService sysDeptService;
}

