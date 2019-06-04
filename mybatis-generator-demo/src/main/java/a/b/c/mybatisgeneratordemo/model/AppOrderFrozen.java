package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order_frozen")
public class AppOrderFrozen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 冻结申请人id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 冻结申请接收人id
     */
    @Column(name = "rece_user_id")
    private Long receUserId;

    /**
     * 冻结原因
     */
    private String remark;

    /**
     * 申请冻结状态:1为客服处理中,2为客服已处理,3为处理完毕
     */
    private Integer status;

    /**
     * 冻结处理时间
     */
    @Column(name = "process_date")
    private Date processDate;

    /**
     * 处理人id(管理员)
     */
    @Column(name = "process_admin_id")
    private String processAdminId;

    /**
     * 处理人昵称(管理员)
     */
    @Column(name = "process_admin_name")
    private String processAdminName;

    /**
     * 处理结果
     */
    @Column(name = "process_result")
    private String processResult;

    /**
     * 申请人是否同意处理结果(1为是0为否)
     */
    @Column(name = "applicant_is_agree")
    private Boolean applicantIsAgree;

    /**
     * 接收人是否同意处理结果(1为是0为否)
     */
    @Column(name = "rece_is_agree")
    private Boolean receIsAgree;

    /**
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Boolean isDel;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "created_date")
    private Date createdDate;

    /**
     * 1为资金归买方所有,2为资金归卖方所有
     */
    @Column(name = "result_status")
    private Integer resultStatus;

    /**
     * 订单终止时间
     */
    @Column(name = "game_over_date")
    private Date gameOverDate;

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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取冻结申请人id
     *
     * @return user_id - 冻结申请人id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置冻结申请人id
     *
     * @param userId 冻结申请人id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取冻结申请接收人id
     *
     * @return rece_user_id - 冻结申请接收人id
     */
    public Long getReceUserId() {
        return receUserId;
    }

    /**
     * 设置冻结申请接收人id
     *
     * @param receUserId 冻结申请接收人id
     */
    public void setReceUserId(Long receUserId) {
        this.receUserId = receUserId;
    }

    /**
     * 获取冻结原因
     *
     * @return remark - 冻结原因
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置冻结原因
     *
     * @param remark 冻结原因
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取申请冻结状态:1为客服处理中,2为客服已处理,3为处理完毕
     *
     * @return status - 申请冻结状态:1为客服处理中,2为客服已处理,3为处理完毕
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置申请冻结状态:1为客服处理中,2为客服已处理,3为处理完毕
     *
     * @param status 申请冻结状态:1为客服处理中,2为客服已处理,3为处理完毕
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取冻结处理时间
     *
     * @return process_date - 冻结处理时间
     */
    public Date getProcessDate() {
        return processDate;
    }

    /**
     * 设置冻结处理时间
     *
     * @param processDate 冻结处理时间
     */
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    /**
     * 获取处理人id(管理员)
     *
     * @return process_admin_id - 处理人id(管理员)
     */
    public String getProcessAdminId() {
        return processAdminId;
    }

    /**
     * 设置处理人id(管理员)
     *
     * @param processAdminId 处理人id(管理员)
     */
    public void setProcessAdminId(String processAdminId) {
        this.processAdminId = processAdminId;
    }

    /**
     * 获取处理人昵称(管理员)
     *
     * @return process_admin_name - 处理人昵称(管理员)
     */
    public String getProcessAdminName() {
        return processAdminName;
    }

    /**
     * 设置处理人昵称(管理员)
     *
     * @param processAdminName 处理人昵称(管理员)
     */
    public void setProcessAdminName(String processAdminName) {
        this.processAdminName = processAdminName;
    }

    /**
     * 获取处理结果
     *
     * @return process_result - 处理结果
     */
    public String getProcessResult() {
        return processResult;
    }

    /**
     * 设置处理结果
     *
     * @param processResult 处理结果
     */
    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    /**
     * 获取申请人是否同意处理结果(1为是0为否)
     *
     * @return applicant_is_agree - 申请人是否同意处理结果(1为是0为否)
     */
    public Boolean getApplicantIsAgree() {
        return applicantIsAgree;
    }

    /**
     * 设置申请人是否同意处理结果(1为是0为否)
     *
     * @param applicantIsAgree 申请人是否同意处理结果(1为是0为否)
     */
    public void setApplicantIsAgree(Boolean applicantIsAgree) {
        this.applicantIsAgree = applicantIsAgree;
    }

    /**
     * 获取接收人是否同意处理结果(1为是0为否)
     *
     * @return rece_is_agree - 接收人是否同意处理结果(1为是0为否)
     */
    public Boolean getReceIsAgree() {
        return receIsAgree;
    }

    /**
     * 设置接收人是否同意处理结果(1为是0为否)
     *
     * @param receIsAgree 接收人是否同意处理结果(1为是0为否)
     */
    public void setReceIsAgree(Boolean receIsAgree) {
        this.receIsAgree = receIsAgree;
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
     * 获取1为资金归买方所有,2为资金归卖方所有
     *
     * @return result_status - 1为资金归买方所有,2为资金归卖方所有
     */
    public Integer getResultStatus() {
        return resultStatus;
    }

    /**
     * 设置1为资金归买方所有,2为资金归卖方所有
     *
     * @param resultStatus 1为资金归买方所有,2为资金归卖方所有
     */
    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    /**
     * 获取订单终止时间
     *
     * @return game_over_date - 订单终止时间
     */
    public Date getGameOverDate() {
        return gameOverDate;
    }

    /**
     * 设置订单终止时间
     *
     * @param gameOverDate 订单终止时间
     */
    public void setGameOverDate(Date gameOverDate) {
        this.gameOverDate = gameOverDate;
    }
}