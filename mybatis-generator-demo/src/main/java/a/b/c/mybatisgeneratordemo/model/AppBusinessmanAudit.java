package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_businessman_audit")
public class AppBusinessmanAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 审核人id
     */
    @Column(name = "back_user_id")
    private String backUserId;

    /**
     * 审核人名称(冗余)
     */
    @Column(name = "back_user_name")
    private String backUserName;

    /**
     * 审核时间
     */
    @Column(name = "audit_date")
    private Date auditDate;

    /**
     * 申请为商户的状态:1为申请中,2申请失败,3申请成功
     */
    private Integer status;

    /**
     * 审核失败原因
     */
    @Column(name = "audit_fail_info")
    private String auditFailInfo;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    /**
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Boolean isDel;

    @Column(name = "created_date")
    private Date createdDate;

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
     * 获取审核人id
     *
     * @return back_user_id - 审核人id
     */
    public String getBackUserId() {
        return backUserId;
    }

    /**
     * 设置审核人id
     *
     * @param backUserId 审核人id
     */
    public void setBackUserId(String backUserId) {
        this.backUserId = backUserId;
    }

    /**
     * 获取审核人名称(冗余)
     *
     * @return back_user_name - 审核人名称(冗余)
     */
    public String getBackUserName() {
        return backUserName;
    }

    /**
     * 设置审核人名称(冗余)
     *
     * @param backUserName 审核人名称(冗余)
     */
    public void setBackUserName(String backUserName) {
        this.backUserName = backUserName;
    }

    /**
     * 获取审核时间
     *
     * @return audit_date - 审核时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审核时间
     *
     * @param auditDate 审核时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * 获取申请为商户的状态:1为申请中,2申请失败,3申请成功
     *
     * @return status - 申请为商户的状态:1为申请中,2申请失败,3申请成功
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置申请为商户的状态:1为申请中,2申请失败,3申请成功
     *
     * @param status 申请为商户的状态:1为申请中,2申请失败,3申请成功
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取审核失败原因
     *
     * @return audit_fail_info - 审核失败原因
     */
    public String getAuditFailInfo() {
        return auditFailInfo;
    }

    /**
     * 设置审核失败原因
     *
     * @param auditFailInfo 审核失败原因
     */
    public void setAuditFailInfo(String auditFailInfo) {
        this.auditFailInfo = auditFailInfo;
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
}