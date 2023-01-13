package com.rocky.ao.service;

import com.rocky.ao.model.entity.SysDict;
import java.util.List;

/**
 * 字典表(SysDict)表服务接口
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:03
 */
public interface SysDictService extends CurdService<SysDict> {

    List<SysDict> findByLabel(String label);
}

