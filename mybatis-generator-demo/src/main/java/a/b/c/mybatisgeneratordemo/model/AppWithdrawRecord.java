package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_withdraw_record")
public class AppWithdrawRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 提现用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 提现类型:1为自付,2为垫付,3为自付加垫付
     */
    @Column(name = "withdraw_type")
    private Integer withdrawType;

    /**
     * 提现金额
     */
    @Column(name = "withdraw_money")
    private Long withdrawMoney;

    /**
     * 垫付金额
     */
    @Column(name = "advance_money")
    private Long advanceMoney;

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
     * 提现银行卡号码
     */
    @Column(name = "bank_card_number")
    private String bankCardNumber;

    /**
     * 提现流水号
     */
    @Column(name = "withdraw_code")
    private String withdrawCode;

    /**
     * 提现金额请求状态:AUT为等待审批,NTE为终审完毕,WCF为订单待确认(商务支付用),BNK为银行处理中,FIN为完成,ERR提现失败
     */
    @Column(name = "req_status")
    private String reqStatus;

    /**
     * 提现金额业务状态:S为银行支付成功,F为银行支付失败,B为银行支付被退票,R为企业审批否决,D为企业过期不审批,C为企业撤销,M为商户撤销订单,V为委托贷款被借款方拒绝
     */
    @Column(name = "business_status")
    private String businessStatus;

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
     * 银行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 到账金额
     */
    @Column(name = "reach_money")
    private Long reachMoney;

    /**
     * 手续费
     */
    @Column(name = "fee_money")
    private Long feeMoney;

    /**
     * 提现完成时间(银行响应)
     */
    @Column(name = "finish_date")
    private Date finishDate;

    /**
     * 提现渠道
     */
    @Column(name = "withdraw_channel")
    private String withdrawChannel;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 银行实例流程号
     */
    @Column(name = "bank_process_number")
    private String bankProcessNumber;

    /**
     * 银行卡所属城市
     */
    @Column(name = "bank_city")
    private String bankCity;

    /**
     * 渠道返回信息xml格式
     */
    @Column(name = "bank_resp_info")
    private String bankRespInfo;

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
     * 获取提现用户id
     *
     * @return user_id - 提现用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置提现用户id
     *
     * @param userId 提现用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取提现类型:1为自付,2为垫付,3为自付加垫付
     *
     * @return withdraw_type - 提现类型:1为自付,2为垫付,3为自付加垫付
     */
    public Integer getWithdrawType() {
        return withdrawType;
    }

    /**
     * 设置提现类型:1为自付,2为垫付,3为自付加垫付
     *
     * @param withdrawType 提现类型:1为自付,2为垫付,3为自付加垫付
     */
    public void setWithdrawType(Integer withdrawType) {
        this.withdrawType = withdrawType;
    }

    /**
     * 获取提现金额
     *
     * @return withdraw_money - 提现金额
     */
    public Long getWithdrawMoney() {
        return withdrawMoney;
    }

    /**
     * 设置提现金额
     *
     * @param withdrawMoney 提现金额
     */
    public void setWithdrawMoney(Long withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    /**
     * 获取垫付金额
     *
     * @return advance_money - 垫付金额
     */
    public Long getAdvanceMoney() {
        return advanceMoney;
    }

    /**
     * 设置垫付金额
     *
     * @param advanceMoney 垫付金额
     */
    public void setAdvanceMoney(Long advanceMoney) {
        this.advanceMoney = advanceMoney;
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
     * 获取提现银行卡号码
     *
     * @return bank_card_number - 提现银行卡号码
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * 设置提现银行卡号码
     *
     * @param bankCardNumber 提现银行卡号码
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * 获取提现流水号
     *
     * @return withdraw_code - 提现流水号
     */
    public String getWithdrawCode() {
        return withdrawCode;
    }

    /**
     * 设置提现流水号
     *
     * @param withdrawCode 提现流水号
     */
    public void setWithdrawCode(String withdrawCode) {
        this.withdrawCode = withdrawCode;
    }

    /**
     * 获取提现金额请求状态:AUT为等待审批,NTE为终审完毕,WCF为订单待确认(商务支付用),BNK为银行处理中,FIN为完成,ERR提现失败
     *
     * @return req_status - 提现金额请求状态:AUT为等待审批,NTE为终审完毕,WCF为订单待确认(商务支付用),BNK为银行处理中,FIN为完成,ERR提现失败
     */
    public String getReqStatus() {
        return reqStatus;
    }

    /**
     * 设置提现金额请求状态:AUT为等待审批,NTE为终审完毕,WCF为订单待确认(商务支付用),BNK为银行处理中,FIN为完成,ERR提现失败
     *
     * @param reqStatus 提现金额请求状态:AUT为等待审批,NTE为终审完毕,WCF为订单待确认(商务支付用),BNK为银行处理中,FIN为完成,ERR提现失败
     */
    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    /**
     * 获取提现金额业务状态:S为银行支付成功,F为银行支付失败,B为银行支付被退票,R为企业审批否决,D为企业过期不审批,C为企业撤销,M为商户撤销订单,V为委托贷款被借款方拒绝
     *
     * @return business_status - 提现金额业务状态:S为银行支付成功,F为银行支付失败,B为银行支付被退票,R为企业审批否决,D为企业过期不审批,C为企业撤销,M为商户撤销订单,V为委托贷款被借款方拒绝
     */
    public String getBusinessStatus() {
        return businessStatus;
    }

    /**
     * 设置提现金额业务状态:S为银行支付成功,F为银行支付失败,B为银行支付被退票,R为企业审批否决,D为企业过期不审批,C为企业撤销,M为商户撤销订单,V为委托贷款被借款方拒绝
     *
     * @param businessStatus 提现金额业务状态:S为银行支付成功,F为银行支付失败,B为银行支付被退票,R为企业审批否决,D为企业过期不审批,C为企业撤销,M为商户撤销订单,V为委托贷款被借款方拒绝
     */
    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
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
     * 获取到账金额
     *
     * @return reach_money - 到账金额
     */
    public Long getReachMoney() {
        return reachMoney;
    }

    /**
     * 设置到账金额
     *
     * @param reachMoney 到账金额
     */
    public void setReachMoney(Long reachMoney) {
        this.reachMoney = reachMoney;
    }

    /**
     * 获取手续费
     *
     * @return fee_money - 手续费
     */
    public Long getFeeMoney() {
        return feeMoney;
    }

    /**
     * 设置手续费
     *
     * @param feeMoney 手续费
     */
    public void setFeeMoney(Long feeMoney) {
        this.feeMoney = feeMoney;
    }

    /**
     * 获取提现完成时间(银行响应)
     *
     * @return finish_date - 提现完成时间(银行响应)
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * 设置提现完成时间(银行响应)
     *
     * @param finishDate 提现完成时间(银行响应)
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 获取提现渠道
     *
     * @return withdraw_channel - 提现渠道
     */
    public String getWithdrawChannel() {
        return withdrawChannel;
    }

    /**
     * 设置提现渠道
     *
     * @param withdrawChannel 提现渠道
     */
    public void setWithdrawChannel(String withdrawChannel) {
        this.withdrawChannel = withdrawChannel;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取银行实例流程号
     *
     * @return bank_process_number - 银行实例流程号
     */
    public String getBankProcessNumber() {
        return bankProcessNumber;
    }

    /**
     * 设置银行实例流程号
     *
     * @param bankProcessNumber 银行实例流程号
     */
    public void setBankProcessNumber(String bankProcessNumber) {
        this.bankProcessNumber = bankProcessNumber;
    }

    /**
     * 获取银行卡所属城市
     *
     * @return bank_city - 银行卡所属城市
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * 设置银行卡所属城市
     *
     * @param bankCity 银行卡所属城市
     */
    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    /**
     * 获取渠道返回信息xml格式
     *
     * @return bank_resp_info - 渠道返回信息xml格式
     */
    public String getBankRespInfo() {
        return bankRespInfo;
    }

    /**
     * 设置渠道返回信息xml格式
     *
     * @param bankRespInfo 渠道返回信息xml格式
     */
    public void setBankRespInfo(String bankRespInfo) {
        this.bankRespInfo = bankRespInfo;
    }
}