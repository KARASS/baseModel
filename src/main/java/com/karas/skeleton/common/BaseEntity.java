package com.karas.skeleton.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @DESCRIPTION  Entity 基类
 * @AUTHOR karas - 272256055@qq.com
 * @DATE 2016/10/28
 */
public class BaseEntity  implements Serializable {
    //如果是 ERP OA CRM等企业内部系统 建议使用 UUID,可以方便数据迁移
    // 分库/分表/数据迁移/合并 无需考虑 ID冲突  自增长问题
    private String id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新者
     */
    private String updateUser;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
