package com.rocky.ao.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class SysRole {

    /**
     * 编号
     */
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 备注
     */
    private String remark;
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


