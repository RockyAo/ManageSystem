package com.rocky.ao.page;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author yun.ao
 * @date 2023/1/9 17:27
 * @description
 */
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class PageResult {

    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 分页数据
     */
    private List<?> content;
}
