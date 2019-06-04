package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_bill")
public class AppBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 付款方id
     */
    @Column(name = "pay_user_id")
    private Long payUserId;

    /**
     * 收款方id
     */
    @Column(name = "rece_user_id")
    private Long receUserId;

    /**
     * 账单类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现,6位订单退款
     */
    @Column(name = "bill_type")
    private Integer billType;

    /**
     * 金额
     */
    private Long money;

    /**
     * 转账金额状态:1为转账中,2为已转账,3为转账失败
     */
    private Integer status;

    /**
     * 失败原因
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
     * 付款说明
     */
    private String remark;

    /**
     * 当bill_type=3时,订单编号存在
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 动作id:billType=1,2 则该属性为null, billType=3 则该属性为订单id, billType=4,5 则该属性为充值id、提现id,billType=6 则该属性为订单id
     */
    @Column(name = "action_id")
    private Long actionId;

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
     * 获取付款方id
     *
     * @return pay_user_id - 付款方id
     */
    public Long getPayUserId() {
        return payUserId;
    }

    /**
     * 设置付款方id
     *
     * @param payUserId 付款方id
     */
    public void setPayUserId(Long payUserId) {
        this.payUserId = payUserId;
    }

    /**
     * 获取收款方id
     *
     * @return rece_user_id - 收款方id
     */
    public Long getReceUserId() {
        return receUserId;
    }

    /**
     * 设置收款方id
     *
     * @param receUserId 收款方id
     */
    public void setReceUserId(Long receUserId) {
        this.receUserId = receUserId;
    }

    /**
     * 获取账单类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现,6位订单退款
     *
     * @return bill_type - 账单类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现,6位订单退款
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 设置账单类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现,6位订单退款
     *
     * @param billType 账单类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现,6位订单退款
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 获取转账金额状态:1为转账中,2为已转账,3为转账失败
     *
     * @return status - 转账金额状态:1为转账中,2为已转账,3为转账失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置转账金额状态:1为转账中,2为已转账,3为转账失败
     *
     * @param status 转账金额状态:1为转账中,2为已转账,3为转账失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取失败原因
     *
     * @return audit_fail_info - 失败原因
     */
    public String getAuditFailInfo() {
        return auditFailInfo;
    }

    /**
     * 设置失败原因
     *
     * @param auditFailInfo 失败原因
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

    /**
     * 获取付款说明
     *
     * @return remark - 付款说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置付款说明
     *
     * @param remark 付款说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取当bill_type=3时,订单编号存在
     *
     * @return order_no - 当bill_type=3时,订单编号存在
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置当bill_type=3时,订单编号存在
     *
     * @param orderNo 当bill_type=3时,订单编号存在
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取动作id:billType=1,2 则该属性为null, billType=3 则该属性为订单id, billType=4,5 则该属性为充值id、提现id,billType=6 则该属性为订单id
     *
     * @return action_id - 动作id:billType=1,2 则该属性为null, billType=3 则该属性为订单id, billType=4,5 则该属性为充值id、提现id,billType=6 则该属性为订单id
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * 设置动作id:billType=1,2 则该属性为null, billType=3 则该属性为订单id, billType=4,5 则该属性为充值id、提现id,billType=6 则该属性为订单id
     *
     * @param actionId 动作id:billType=1,2 则该属性为null, billType=3 则该属性为订单id, billType=4,5 则该属性为充值id、提现id,billType=6 则该属性为订单id
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }
}