package com.rocky.ao.controller;


import com.rocky.ao.http.Response;
import com.rocky.ao.model.entity.SysUser;
import com.rocky.ao.page.PageRequest;
import com.rocky.ao.service.SysUserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("user")
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

    @PostMapping("findPage")
    public Response<?> findPage(@RequestBody PageRequest pageRequest) {
        return Response.onSuccess(sysUserService.findPage(pageRequest));
    }
}

