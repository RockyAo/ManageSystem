package com.rocky.ao.controller;


import com.rocky.ao.http.Response;
import com.rocky.ao.model.entity.SysDict;
import com.rocky.ao.page.PageRequest;
import com.rocky.ao.service.SysDictService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dict")
@AllArgsConstructor
public class SysDictController {

    /**
     * 服务对象
     */
    private final SysDictService service;

    @PostMapping("save")
    public Response<?> save(@RequestBody SysDict record) {
        return Response.onSuccess(service.save(record));
    }

    @PostMapping("delete")
    public Response<?> delete(@RequestBody List<SysDict> record) {
        return Response.onSuccess(service.delete(record));
    }

    @PostMapping("findPage")
    public Response<?> findPage(@RequestBody PageRequest request) {
        return Response.onSuccess(service.findPage(request));
    }

    @GetMapping("findByLabel")
    public Response<?> findByLabel(@RequestParam String label) {
        return Response.onSuccess(service.findByLabel(label));
    }
}

