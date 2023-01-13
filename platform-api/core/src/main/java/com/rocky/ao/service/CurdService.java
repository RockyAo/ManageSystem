package com.rocky.ao.service;

import com.rocky.ao.page.PageRequest;
import com.rocky.ao.page.PageResult;
import java.util.List;

/**
 * @author yun.ao
 * @date 2023/1/9 16:00
 * @description common CRUD service
 */
public interface CurdService<T> {

    /**
     * save operation
     *
     * @param record save record
     * @return int
     */
    int save(T record);

    /**
     * delete operation
     *
     * @param record record
     * @return int
     */
    int delete(T record);

    /**
     * batch remove
     *
     * @param records List<T>
     * @return
     */
    int delete(List<T> records);

    /**
     * find T by id
     *
     * @param id Long  hj
     * @return T
     */
    T findById(Long id);

    /**
     * search by page
     *
     * @param request PageRequest
     * @param <R>     parameters
     * @return PageResult
     */
    PageResult findPage(PageRequest request);
}
