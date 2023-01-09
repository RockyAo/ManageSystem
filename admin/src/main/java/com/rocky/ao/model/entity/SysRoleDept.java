package com.rocky.ao.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class SysRoleDept {

    /**
     * 编号
     */
    private Long id;
    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 机构ID
     */
    private Long deptId;
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
}


