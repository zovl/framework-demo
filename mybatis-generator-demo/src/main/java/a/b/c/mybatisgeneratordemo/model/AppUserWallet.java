package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user_wallet")
public class AppUserWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 打开钱包密码
     */
    @Column(name = "show_password")
    private String showPassword;

    /**
     * 支付密码
     */
    @Column(name = "pay_password")
    private String payPassword;

    /**
     * 用户余额,前端显示
     */
    @Column(name = "show_money")
    private Long showMoney;

    /**
     * 用户待入金额(冗余)
     */
    @Column(name = "tobe_money")
    private Long tobeMoney;

    /**
     * 用户已入金额(冗余)
     */
    @Column(name = "being_money")
    private Long beingMoney;

    /**
     * 用户冻结金额(冗余)
     */
    @Column(name = "freeze_money")
    private Long freezeMoney;

    /**
     * 用户提现金额(冗余)
     */
    @Column(name = "withdraw_money")
    private Long withdrawMoney;

    /**
     * 用户垫付金额(冗余)
     */
    @Column(name = "advance_money")
    private Long advanceMoney;

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
     * 获取打开钱包密码
     *
     * @return show_password - 打开钱包密码
     */
    public String getShowPassword() {
        return showPassword;
    }

    /**
     * 设置打开钱包密码
     *
     * @param showPassword 打开钱包密码
     */
    public void setShowPassword(String showPassword) {
        this.showPassword = showPassword;
    }

    /**
     * 获取支付密码
     *
     * @return pay_password - 支付密码
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 设置支付密码
     *
     * @param payPassword 支付密码
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    /**
     * 获取用户余额,前端显示
     *
     * @return show_money - 用户余额,前端显示
     */
    public Long getShowMoney() {
        return showMoney;
    }

    /**
     * 设置用户余额,前端显示
     *
     * @param showMoney 用户余额,前端显示
     */
    public void setShowMoney(Long showMoney) {
        this.showMoney = showMoney;
    }

    /**
     * 获取用户待入金额(冗余)
     *
     * @return tobe_money - 用户待入金额(冗余)
     */
    public Long getTobeMoney() {
        return tobeMoney;
    }

    /**
     * 设置用户待入金额(冗余)
     *
     * @param tobeMoney 用户待入金额(冗余)
     */
    public void setTobeMoney(Long tobeMoney) {
        this.tobeMoney = tobeMoney;
    }

    /**
     * 获取用户已入金额(冗余)
     *
     * @return being_money - 用户已入金额(冗余)
     */
    public Long getBeingMoney() {
        return beingMoney;
    }

    /**
     * 设置用户已入金额(冗余)
     *
     * @param beingMoney 用户已入金额(冗余)
     */
    public void setBeingMoney(Long beingMoney) {
        this.beingMoney = beingMoney;
    }

    /**
     * 获取用户冻结金额(冗余)
     *
     * @return freeze_money - 用户冻结金额(冗余)
     */
    public Long getFreezeMoney() {
        return freezeMoney;
    }

    /**
     * 设置用户冻结金额(冗余)
     *
     * @param freezeMoney 用户冻结金额(冗余)
     */
    public void setFreezeMoney(Long freezeMoney) {
        this.freezeMoney = freezeMoney;
    }

    /**
     * 获取用户提现金额(冗余)
     *
     * @return withdraw_money - 用户提现金额(冗余)
     */
    public Long getWithdrawMoney() {
        return withdrawMoney;
    }

    /**
     * 设置用户提现金额(冗余)
     *
     * @param withdrawMoney 用户提现金额(冗余)
     */
    public void setWithdrawMoney(Long withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    /**
     * 获取用户垫付金额(冗余)
     *
     * @return advance_money - 用户垫付金额(冗余)
     */
    public Long getAdvanceMoney() {
        return advanceMoney;
    }

    /**
     * 设置用户垫付金额(冗余)
     *
     * @param advanceMoney 用户垫付金额(冗余)
     */
    public void setAdvanceMoney(Long advanceMoney) {
        this.advanceMoney = advanceMoney;
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