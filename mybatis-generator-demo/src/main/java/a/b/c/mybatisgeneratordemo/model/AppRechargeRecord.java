package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_recharge_record")
public class AppRechargeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 充值用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 金额
     */
    private Long money;

    /**
     * 充值手续费
     */
    @Column(name = "recharge_fee")
    private Long rechargeFee;

    /**
     * 银行编码
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 银行卡类型:1为储蓄卡,2为信用卡
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 银行卡号码
     */
    @Column(name = "bank_card_number")
    private String bankCardNumber;

    /**
     * 渠道类型:1为易联
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 交易流水号
     */
    @Column(name = "trade_code")
    private String tradeCode;

    /**
     * 本地订单号(善信通订单号)
     */
    @Column(name = "local_order_id")
    private String localOrderId;

    /**
     * 渠道订单号
     */
    @Column(name = "channel_order_id")
    private String channelOrderId;

    /**
     * 渠道订单状态:01未支付,02已支付,03已退款(全额撤销/冲正),04已过期,05已作废,06支付中,07退款中,08已被商户撤销,09已被持卡人撤销,10调账-支付成功,11调账-退款成功,12已退货
     */
    @Column(name = "channel_order_status")
    private String channelOrderStatus;

    /**
     * 充值金额状态:0为未入渠道(易联),1为已入渠道(易联),2为已入总账(善信通总账),3为充值失败
     */
    private Integer status;

    /**
     * 失败原因
     */
    @Column(name = "fail_info")
    private String failInfo;

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
     * 付款时间
     */
    @Column(name = "pay_date")
    private Date payDate;

    /**
     * 是否测试数据
     */
    @Column(name = "is_test")
    private Boolean isTest;

    /**
     * 银行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 渠道返回信息json格式
     */
    @Column(name = "channel_resp_info")
    private String channelRespInfo;

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
     * 获取充值用户id
     *
     * @return user_id - 充值用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置充值用户id
     *
     * @param userId 充值用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 获取充值手续费
     *
     * @return recharge_fee - 充值手续费
     */
    public Long getRechargeFee() {
        return rechargeFee;
    }

    /**
     * 设置充值手续费
     *
     * @param rechargeFee 充值手续费
     */
    public void setRechargeFee(Long rechargeFee) {
        this.rechargeFee = rechargeFee;
    }

    /**
     * 获取银行编码
     *
     * @return bank_code - 银行编码
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行编码
     *
     * @param bankCode 银行编码
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取银行卡类型:1为储蓄卡,2为信用卡
     *
     * @return card_type - 银行卡类型:1为储蓄卡,2为信用卡
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置银行卡类型:1为储蓄卡,2为信用卡
     *
     * @param cardType 银行卡类型:1为储蓄卡,2为信用卡
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取银行卡号码
     *
     * @return bank_card_number - 银行卡号码
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * 设置银行卡号码
     *
     * @param bankCardNumber 银行卡号码
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * 获取渠道类型:1为易联
     *
     * @return channel_id - 渠道类型:1为易联
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道类型:1为易联
     *
     * @param channelId 渠道类型:1为易联
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取交易流水号
     *
     * @return trade_code - 交易流水号
     */
    public String getTradeCode() {
        return tradeCode;
    }

    /**
     * 设置交易流水号
     *
     * @param tradeCode 交易流水号
     */
    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    /**
     * 获取本地订单号(善信通订单号)
     *
     * @return local_order_id - 本地订单号(善信通订单号)
     */
    public String getLocalOrderId() {
        return localOrderId;
    }

    /**
     * 设置本地订单号(善信通订单号)
     *
     * @param localOrderId 本地订单号(善信通订单号)
     */
    public void setLocalOrderId(String localOrderId) {
        this.localOrderId = localOrderId;
    }

    /**
     * 获取渠道订单号
     *
     * @return channel_order_id - 渠道订单号
     */
    public String getChannelOrderId() {
        return channelOrderId;
    }

    /**
     * 设置渠道订单号
     *
     * @param channelOrderId 渠道订单号
     */
    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    /**
     * 获取渠道订单状态:01未支付,02已支付,03已退款(全额撤销/冲正),04已过期,05已作废,06支付中,07退款中,08已被商户撤销,09已被持卡人撤销,10调账-支付成功,11调账-退款成功,12已退货
     *
     * @return channel_order_status - 渠道订单状态:01未支付,02已支付,03已退款(全额撤销/冲正),04已过期,05已作废,06支付中,07退款中,08已被商户撤销,09已被持卡人撤销,10调账-支付成功,11调账-退款成功,12已退货
     */
    public String getChannelOrderStatus() {
        return channelOrderStatus;
    }

    /**
     * 设置渠道订单状态:01未支付,02已支付,03已退款(全额撤销/冲正),04已过期,05已作废,06支付中,07退款中,08已被商户撤销,09已被持卡人撤销,10调账-支付成功,11调账-退款成功,12已退货
     *
     * @param channelOrderStatus 渠道订单状态:01未支付,02已支付,03已退款(全额撤销/冲正),04已过期,05已作废,06支付中,07退款中,08已被商户撤销,09已被持卡人撤销,10调账-支付成功,11调账-退款成功,12已退货
     */
    public void setChannelOrderStatus(String channelOrderStatus) {
        this.channelOrderStatus = channelOrderStatus;
    }

    /**
     * 获取充值金额状态:0为未入渠道(易联),1为已入渠道(易联),2为已入总账(善信通总账),3为充值失败
     *
     * @return status - 充值金额状态:0为未入渠道(易联),1为已入渠道(易联),2为已入总账(善信通总账),3为充值失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置充值金额状态:0为未入渠道(易联),1为已入渠道(易联),2为已入总账(善信通总账),3为充值失败
     *
     * @param status 充值金额状态:0为未入渠道(易联),1为已入渠道(易联),2为已入总账(善信通总账),3为充值失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取失败原因
     *
     * @return fail_info - 失败原因
     */
    public String getFailInfo() {
        return failInfo;
    }

    /**
     * 设置失败原因
     *
     * @param failInfo 失败原因
     */
    public void setFailInfo(String failInfo) {
        this.failInfo = failInfo;
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
     * 获取付款时间
     *
     * @return pay_date - 付款时间
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
     * 设置付款时间
     *
     * @param payDate 付款时间
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    /**
     * 获取是否测试数据
     *
     * @return is_test - 是否测试数据
     */
    public Boolean getIsTest() {
        return isTest;
    }

    /**
     * 设置是否测试数据
     *
     * @param isTest 是否测试数据
     */
    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }

    /**
     * 获取银行名称
     *
     * @return bank_name - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取渠道返回信息json格式
     *
     * @return channel_resp_info - 渠道返回信息json格式
     */
    public String getChannelRespInfo() {
        return channelRespInfo;
    }

    /**
     * 设置渠道返回信息json格式
     *
     * @param channelRespInfo 渠道返回信息json格式
     */
    public void setChannelRespInfo(String channelRespInfo) {
        this.channelRespInfo = channelRespInfo;
    }
}