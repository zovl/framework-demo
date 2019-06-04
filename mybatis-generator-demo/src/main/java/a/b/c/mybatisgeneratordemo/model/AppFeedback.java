package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_feedback")
public class AppFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 反馈人
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 设备版本,默认1.0
     */
    @Column(name = "client_version")
    private String clientVersion;

    /**
     * 设备类型系统名 ANDORID/IOS
     */
    @Column(name = "client_type")
    private String clientType;

    /**
     * 设备系统版本
     */
    @Column(name = "client_os_version")
    private String clientOsVersion;

    /**
     * 描述
     */
    private String description;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取反馈人
     *
     * @return user_id - 反馈人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置反馈人
     *
     * @param userId 反馈人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取设备版本,默认1.0
     *
     * @return client_version - 设备版本,默认1.0
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * 设置设备版本,默认1.0
     *
     * @param clientVersion 设备版本,默认1.0
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * 获取设备类型系统名 ANDORID/IOS
     *
     * @return client_type - 设备类型系统名 ANDORID/IOS
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * 设置设备类型系统名 ANDORID/IOS
     *
     * @param clientType 设备类型系统名 ANDORID/IOS
     */
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * 获取设备系统版本
     *
     * @return client_os_version - 设备系统版本
     */
    public String getClientOsVersion() {
        return clientOsVersion;
    }

    /**
     * 设置设备系统版本
     *
     * @param clientOsVersion 设备系统版本
     */
    public void setClientOsVersion(String clientOsVersion) {
        this.clientOsVersion = clientOsVersion;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return created_date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return last_modified_by
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return last_modified_date
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * @return is_del
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}