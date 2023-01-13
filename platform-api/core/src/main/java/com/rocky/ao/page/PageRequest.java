package com.rocky.ao.page;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author yun.ao
 * @date 2023/1/9 17:18
 * @description
 */
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class PageRequest {

    /**
     * current page index
     */
    private int pageNum = 1;
    /**
     * current page size
     */
    private int pageSize = 10;

    /**
     * request parameters
     */
    private Object parameters;
}
