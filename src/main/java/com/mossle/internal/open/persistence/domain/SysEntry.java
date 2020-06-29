package com.mossle.internal.open.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SysEntry 系统入口.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "SYS_ENTRY")
public class SysEntry implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 外键，系统. */
    private SysInfo sysInfo;

    /** 外键，系统分类. */
    private SysCategory sysCategory;

    /** 图标. */
    private String logo;

    /** 分类. */
    private String type;

    /** 编码. */
    private String code;

    /** 名称. */
    private String name;

    /** 网址. */
    private String url;

    /** 排序. */
    private Integer priority;

    /** 状态. */
    private String status;

    /** 备注. */
    private String descn;

    /** 平台，web, app. */
    private String platform;

    /** 创建时间. */
    private Date createTime;

    /** 创建人. */
    private String userId;

    /** 租户. */
    private String tenantId;

    public SysEntry() {
    }

    public SysEntry(Long id) {
        this.id = id;
    }

    public SysEntry(Long id, SysInfo sysInfo, SysCategory sysCategory,
            String logo, String type, String code, String name, String url,
            Integer priority, String status, String descn, String platform,
            Date createTime, String userId, String tenantId) {
        this.id = id;
        this.sysInfo = sysInfo;
        this.sysCategory = sysCategory;
        this.logo = logo;
        this.type = type;
        this.code = code;
        this.name = name;
        this.url = url;
        this.priority = priority;
        this.status = status;
        this.descn = descn;
        this.platform = platform;
        this.createTime = createTime;
        this.userId = userId;
        this.tenantId = tenantId;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 外键，系统. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYS_ID")
    public SysInfo getSysInfo() {
        return this.sysInfo;
    }

    /**
     * @param sysInfo
     *            外键，系统.
     */
    public void setSysInfo(SysInfo sysInfo) {
        this.sysInfo = sysInfo;
    }

    /** @return 外键，系统分类. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    public SysCategory getSysCategory() {
        return this.sysCategory;
    }

    /**
     * @param sysCategory
     *            外键，系统分类.
     */
    public void setSysCategory(SysCategory sysCategory) {
        this.sysCategory = sysCategory;
    }

    /** @return 图标. */
    @Column(name = "LOGO", length = 200)
    public String getLogo() {
        return this.logo;
    }

    /**
     * @param logo
     *            图标.
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /** @return 分类. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            分类.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 编码. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            编码.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            名称.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return 网址. */
    @Column(name = "URL", length = 200)
    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     *            网址.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /** @return 排序. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            排序.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** @return 状态. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return 备注. */
    @Column(name = "DESCN", length = 200)
    public String getDescn() {
        return this.descn;
    }

    /**
     * @param descn
     *            备注.
     */
    public void setDescn(String descn) {
        this.descn = descn;
    }

    /** @return 平台，web, app. */
    @Column(name = "PLATFORM", length = 50)
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @param platform
     *            平台，web, app.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /** @return 创建时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            创建时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 创建人. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            创建人.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}