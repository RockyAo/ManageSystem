package com.rocky.ao.controller;


import com.rocky.ao.model.entity.SysUser;
import com.rocky.ao.service.SysUserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("sysUser")
@AllArgsConstructor
public class SysUserController {

    /**
     * 服务对象
     */
    private final SysUserService sysUserService;

    @GetMapping("all")
    public List<SysUser> findAll() {
        return sysUserService.findAll();
    }
}

