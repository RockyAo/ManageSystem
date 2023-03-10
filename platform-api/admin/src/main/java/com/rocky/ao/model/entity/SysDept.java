package com.rocky.ao.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class SysDept {

    /**
     * 编号
     */
    private Long id;
    /**
     * 机构名称
     */
    private String name;
    /**
     * 上级机构ID，一级机构为0
     */
    private Long parentId;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private String lastUpdateBy;
    /**
     * 更新时间
     */
    private Date lastUpdateTime;
    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Integer delFlag;
}


