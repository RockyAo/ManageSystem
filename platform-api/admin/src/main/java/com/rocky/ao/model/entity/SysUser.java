package com.rocky.ao.model.entity;

import java.util.Date;
import lombok.Data;

@Data
public class SysUser {

    /**
     * 编号
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 密码
     */
    private String password;
    /**
     * 加密盐
     */
    private String salt;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;
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
    /**
     * 是否删除  -1：已删除  0：正常
     */
    private Integer delFlag;
}


