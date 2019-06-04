package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_bank_card")
public class AppBankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户真实姓名(冗余)
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 银行名
     */
    @Column(name = "bank_name")
    private String bankName;

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
     * 银行卡绑定手机号码
     */
    @Column(name = "bank_card_phone")
    private String bankCardPhone;

    /**
     * 银行单笔限额
     */
    @Column(name = "bank_card_single_limit")
    private String bankCardSingleLimit;

    /**
     * 银行每日限额
     */
    @Column(name = "bank_card_daily_limit")
    private String bankCardDailyLimit;

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
     * 银行卡所属城市
     */
    @Column(name = "bank_city")
    private String bankCity;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户真实姓名(冗余)
     *
     * @return real_name - 用户真实姓名(冗余)
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真实姓名(冗余)
     *
     * @param realName 用户真实姓名(冗余)
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取银行名
     *
     * @return bank_name - 银行名
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名
     *
     * @param bankName 银行名
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
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
     * 获取银行卡绑定手机号码
     *
     * @return bank_card_phone - 银行卡绑定手机号码
     */
    public String getBankCardPhone() {
        return bankCardPhone;
    }

    /**
     * 设置银行卡绑定手机号码
     *
     * @param bankCardPhone 银行卡绑定手机号码
     */
    public void setBankCardPhone(String bankCardPhone) {
        this.bankCardPhone = bankCardPhone;
    }

    /**
     * 获取银行单笔限额
     *
     * @return bank_card_single_limit - 银行单笔限额
     */
    public String getBankCardSingleLimit() {
        return bankCardSingleLimit;
    }

    /**
     * 设置银行单笔限额
     *
     * @param bankCardSingleLimit 银行单笔限额
     */
    public void setBankCardSingleLimit(String bankCardSingleLimit) {
        this.bankCardSingleLimit = bankCardSingleLimit;
    }

    /**
     * 获取银行每日限额
     *
     * @return bank_card_daily_limit - 银行每日限额
     */
    public String getBankCardDailyLimit() {
        return bankCardDailyLimit;
    }

    /**
     * 设置银行每日限额
     *
     * @param bankCardDailyLimit 银行每日限额
     */
    public void setBankCardDailyLimit(String bankCardDailyLimit) {
        this.bankCardDailyLimit = bankCardDailyLimit;
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
}