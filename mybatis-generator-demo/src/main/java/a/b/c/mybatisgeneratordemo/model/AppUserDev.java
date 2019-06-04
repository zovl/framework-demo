package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user_dev")
public class AppUserDev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 设备版本
     */
    @Column(name = "client_version")
    private String clientVersion;

    /**
     * 设备唯一号
     */
    @Column(name = "client_id")
    private String clientId;

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
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Boolean isDel;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取设备版本
     *
     * @return client_version - 设备版本
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * 设置设备版本
     *
     * @param clientVersion 设备版本
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * 获取设备唯一号
     *
     * @return client_id - 设备唯一号
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置设备唯一号
     *
     * @param clientId 设备唯一号
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
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
     * 获取是否删除(1为是0为否)
     *
     * @return is_del - 是否删除(1为是0为否)
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除(1为是0为否)
     *
     * @param isDel 是否删除(1为是0为否)
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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
}