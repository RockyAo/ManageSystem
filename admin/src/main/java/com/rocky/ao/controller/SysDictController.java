package com.rocky.ao.controller;


import com.rocky.ao.service.SysDictService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysDict")
public class SysDictController {

    /**
     * 服务对象
     */
    @Autowired
    private SysDictService sysDictService;
}

