package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_pay_clear_log")
public class AppPayClearLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 充值清算流水号
     */
    @Column(name = "pay_clear_no")
    private String payClearNo;

    /**
     * 渠道商户号(易联)
     */
    @Column(name = "busineer_number")
    private String busineerNumber;

    /**
     * 渠道订单编号(易联)
     */
    @Column(name = "channel_order_id")
    private String channelOrderId;

    /**
     * 商户系统订单编号
     */
    @Column(name = "local_order_id")
    private String localOrderId;

    /**
     * 系统终端号(易联)
     */
    @Column(name = "sys_terminal_code")
    private String sysTerminalCode;

    /**
     * 银联流水号(易联)
     */
    @Column(name = "unionpay_number")
    private String unionpayNumber;

    /**
     * 商户流水号(易联)
     */
    @Column(name = "busineer_serial_number")
    private String busineerSerialNumber;

    /**
     * 交易的银行卡号
     */
    @Column(name = "bank_card_number")
    private String bankCardNumber;

    /**
     * 交易日期(易联)
     */
    @Column(name = "pay_date_str")
    private String payDateStr;

    /**
     * 清算日期(易联)
     */
    @Column(name = "clear_date_str")
    private String clearDateStr;

    /**
     * 交易金额(0.00)
     */
    @Column(name = "pay_money")
    private String payMoney;

    /**
     * 交易佣金(0.00)
     */
    @Column(name = "pay_commission")
    private String payCommission;

    /**
     * 交易手机号
     */
    @Column(name = "pay_phone")
    private String payPhone;

    /**
     * 合同编号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 订单当前状态
     */
    private String status;

    /**
     * 交易类型
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * 帐号类型
     */
    @Column(name = "account_type")
    private String accountType;

    /**
     * 清算方式:1=自动,2=手动
     */
    @Column(name = "clear_type")
    private Integer clearType;

    /**
     * 如果清算方式为手动则需要等级管理员名称
     */
    @Column(name = "admin_name")
    private String adminName;

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
     * 获取充值清算流水号
     *
     * @return pay_clear_no - 充值清算流水号
     */
    public String getPayClearNo() {
        return payClearNo;
    }

    /**
     * 设置充值清算流水号
     *
     * @param payClearNo 充值清算流水号
     */
    public void setPayClearNo(String payClearNo) {
        this.payClearNo = payClearNo;
    }

    /**
     * 获取渠道商户号(易联)
     *
     * @return busineer_number - 渠道商户号(易联)
     */
    public String getBusineerNumber() {
        return busineerNumber;
    }

    /**
     * 设置渠道商户号(易联)
     *
     * @param busineerNumber 渠道商户号(易联)
     */
    public void setBusineerNumber(String busineerNumber) {
        this.busineerNumber = busineerNumber;
    }

    /**
     * 获取渠道订单编号(易联)
     *
     * @return channel_order_id - 渠道订单编号(易联)
     */
    public String getChannelOrderId() {
        return channelOrderId;
    }

    /**
     * 设置渠道订单编号(易联)
     *
     * @param channelOrderId 渠道订单编号(易联)
     */
    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    /**
     * 获取商户系统订单编号
     *
     * @return local_order_id - 商户系统订单编号
     */
    public String getLocalOrderId() {
        return localOrderId;
    }

    /**
     * 设置商户系统订单编号
     *
     * @param localOrderId 商户系统订单编号
     */
    public void setLocalOrderId(String localOrderId) {
        this.localOrderId = localOrderId;
    }

    /**
     * 获取系统终端号(易联)
     *
     * @return sys_terminal_code - 系统终端号(易联)
     */
    public String getSysTerminalCode() {
        return sysTerminalCode;
    }

    /**
     * 设置系统终端号(易联)
     *
     * @param sysTerminalCode 系统终端号(易联)
     */
    public void setSysTerminalCode(String sysTerminalCode) {
        this.sysTerminalCode = sysTerminalCode;
    }

    /**
     * 获取银联流水号(易联)
     *
     * @return unionpay_number - 银联流水号(易联)
     */
    public String getUnionpayNumber() {
        return unionpayNumber;
    }

    /**
     * 设置银联流水号(易联)
     *
     * @param unionpayNumber 银联流水号(易联)
     */
    public void setUnionpayNumber(String unionpayNumber) {
        this.unionpayNumber = unionpayNumber;
    }

    /**
     * 获取商户流水号(易联)
     *
     * @return busineer_serial_number - 商户流水号(易联)
     */
    public String getBusineerSerialNumber() {
        return busineerSerialNumber;
    }

    /**
     * 设置商户流水号(易联)
     *
     * @param busineerSerialNumber 商户流水号(易联)
     */
    public void setBusineerSerialNumber(String busineerSerialNumber) {
        this.busineerSerialNumber = busineerSerialNumber;
    }

    /**
     * 获取交易的银行卡号
     *
     * @return bank_card_number - 交易的银行卡号
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * 设置交易的银行卡号
     *
     * @param bankCardNumber 交易的银行卡号
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * 获取交易日期(易联)
     *
     * @return pay_date_str - 交易日期(易联)
     */
    public String getPayDateStr() {
        return payDateStr;
    }

    /**
     * 设置交易日期(易联)
     *
     * @param payDateStr 交易日期(易联)
     */
    public void setPayDateStr(String payDateStr) {
        this.payDateStr = payDateStr;
    }

    /**
     * 获取清算日期(易联)
     *
     * @return clear_date_str - 清算日期(易联)
     */
    public String getClearDateStr() {
        return clearDateStr;
    }

    /**
     * 设置清算日期(易联)
     *
     * @param clearDateStr 清算日期(易联)
     */
    public void setClearDateStr(String clearDateStr) {
        this.clearDateStr = clearDateStr;
    }

    /**
     * 获取交易金额(0.00)
     *
     * @return pay_money - 交易金额(0.00)
     */
    public String getPayMoney() {
        return payMoney;
    }

    /**
     * 设置交易金额(0.00)
     *
     * @param payMoney 交易金额(0.00)
     */
    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * 获取交易佣金(0.00)
     *
     * @return pay_commission - 交易佣金(0.00)
     */
    public String getPayCommission() {
        return payCommission;
    }

    /**
     * 设置交易佣金(0.00)
     *
     * @param payCommission 交易佣金(0.00)
     */
    public void setPayCommission(String payCommission) {
        this.payCommission = payCommission;
    }

    /**
     * 获取交易手机号
     *
     * @return pay_phone - 交易手机号
     */
    public String getPayPhone() {
        return payPhone;
    }

    /**
     * 设置交易手机号
     *
     * @param payPhone 交易手机号
     */
    public void setPayPhone(String payPhone) {
        this.payPhone = payPhone;
    }

    /**
     * 获取合同编号
     *
     * @return contract_no - 合同编号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置合同编号
     *
     * @param contractNo 合同编号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * 获取订单当前状态
     *
     * @return status - 订单当前状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单当前状态
     *
     * @param status 订单当前状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取交易类型
     *
     * @return pay_type - 交易类型
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置交易类型
     *
     * @param payType 交易类型
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取帐号类型
     *
     * @return account_type - 帐号类型
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置帐号类型
     *
     * @param accountType 帐号类型
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取清算方式:1=自动,2=手动
     *
     * @return clear_type - 清算方式:1=自动,2=手动
     */
    public Integer getClearType() {
        return clearType;
    }

    /**
     * 设置清算方式:1=自动,2=手动
     *
     * @param clearType 清算方式:1=自动,2=手动
     */
    public void setClearType(Integer clearType) {
        this.clearType = clearType;
    }

    /**
     * 获取如果清算方式为手动则需要等级管理员名称
     *
     * @return admin_name - 如果清算方式为手动则需要等级管理员名称
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置如果清算方式为手动则需要等级管理员名称
     *
     * @param adminName 如果清算方式为手动则需要等级管理员名称
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
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