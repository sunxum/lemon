package com.mossle.internal.oss.persistence.domain;

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
 * OssAccess 访问秘钥.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "OSS_ACCESS")
public class OssAccess implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 外键. */
    private OssBucket ossBucket;

    /** 类型（备用）. */
    private String type;

    /** 账号. */
    private String accessKey;

    /** 密码. */
    private String secretKey;

    /** 状态: active,inactive. */
    private String status;

    /** 创建时间. */
    private Date createTime;

    /** 描述(备用). */
    private String description;

    /** 创建人(备用). */
    private String userId;

    /** 租户. */
    private String tenantId;

    public OssAccess() {
    }

    public OssAccess(Long id) {
        this.id = id;
    }

    public OssAccess(Long id, OssBucket ossBucket, String type,
            String accessKey, String secretKey, String status, Date createTime,
            String description, String userId, String tenantId) {
        this.id = id;
        this.ossBucket = ossBucket;
        this.type = type;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.status = status;
        this.createTime = createTime;
        this.description = description;
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

    /** @return 外键. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUCKET_ID")
    public OssBucket getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @param ossBucket
     *            外键.
     */
    public void setOssBucket(OssBucket ossBucket) {
        this.ossBucket = ossBucket;
    }

    /** @return 类型（备用）. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            类型（备用）.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 账号. */
    @Column(name = "ACCESS_KEY", length = 100)
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @param accessKey
     *            账号.
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /** @return 密码. */
    @Column(name = "SECRET_KEY", length = 100)
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @param secretKey
     *            密码.
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /** @return 状态: active,inactive. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态: active,inactive.
     */
    public void setStatus(String status) {
        this.status = status;
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

    /** @return 描述(备用). */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            描述(备用).
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 创建人(备用). */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            创建人(备用).
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 50)
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
