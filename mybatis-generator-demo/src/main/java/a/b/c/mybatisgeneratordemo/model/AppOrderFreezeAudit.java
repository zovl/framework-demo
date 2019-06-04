package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order_freeze_audit")
public class AppOrderFreezeAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 申请冻结的订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 申请人id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 冻结原因
     */
    private String description;

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
     * 审核状态:1为已申请审核中,2为审核同意,3为审核失败
     */
    private Integer status;

    /**
     * 审核失败原因
     */
    @Column(name = "audit_fail_info")
    private String auditFailInfo;

    /**
     * 解冻时间
     */
    @Column(name = "thawing_date")
    private Date thawingDate;

    /**
     * 解冻条件
     */
    @Column(name = "thawing_condition")
    private String thawingCondition;

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
     * 获取申请冻结的订单id
     *
     * @return order_id - 申请冻结的订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置申请冻结的订单id
     *
     * @param orderId 申请冻结的订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取申请人id
     *
     * @return user_id - 申请人id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置申请人id
     *
     * @param userId 申请人id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取冻结原因
     *
     * @return description - 冻结原因
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置冻结原因
     *
     * @param description 冻结原因
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取审核状态:1为已申请审核中,2为审核同意,3为审核失败
     *
     * @return status - 审核状态:1为已申请审核中,2为审核同意,3为审核失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置审核状态:1为已申请审核中,2为审核同意,3为审核失败
     *
     * @param status 审核状态:1为已申请审核中,2为审核同意,3为审核失败
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
     * 获取解冻时间
     *
     * @return thawing_date - 解冻时间
     */
    public Date getThawingDate() {
        return thawingDate;
    }

    /**
     * 设置解冻时间
     *
     * @param thawingDate 解冻时间
     */
    public void setThawingDate(Date thawingDate) {
        this.thawingDate = thawingDate;
    }

    /**
     * 获取解冻条件
     *
     * @return thawing_condition - 解冻条件
     */
    public String getThawingCondition() {
        return thawingCondition;
    }

    /**
     * 设置解冻条件
     *
     * @param thawingCondition 解冻条件
     */
    public void setThawingCondition(String thawingCondition) {
        this.thawingCondition = thawingCondition;
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