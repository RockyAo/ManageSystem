package com.rocky.ao.controller;


import com.rocky.ao.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysDict")
public class SysDictController {

    /**
     * 服务对象
     */
    @Autowired
    private SysDictService sysDictService;
}

