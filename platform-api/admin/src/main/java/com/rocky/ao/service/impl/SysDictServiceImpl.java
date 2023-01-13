package com.rocky.ao.service.impl;

import com.rocky.ao.mapper.SysDictMapper;
import com.rocky.ao.model.entity.SysDict;
import com.rocky.ao.page.MybatisPageHelper;
import com.rocky.ao.page.PageRequest;
import com.rocky.ao.page.PageResult;
import com.rocky.ao.service.SysDictService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 字典表(SysDict)表服务实现类
 *
 * @author yun.ao
 * @since 2023-01-13 14:47:03
 */
@Service
@AllArgsConstructor
public class SysDictServiceImpl implements SysDictService {

    private final SysDictMapper mapper;

    @Override
    public List<SysDict> findByLabel(String label) {
        return null;
    }

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return mapper.insert(record);
        }
        return mapper.updateById(record);
    }

    @Override
    public int delete(SysDict record) {
        return mapper.deleteById(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        records.forEach(this::delete);
        return 1;
    }

    @Override
    public SysDict findById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public PageResult findPage(PageRequest request) {
        Object parameters = request.getParameters();

        if (parameters != null) {
            return MybatisPageHelper.findPage(request, mapper, "findPageByLabel", parameters);
        }
        return MybatisPageHelper.findPage(request, mapper);
    }
}

