package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_sys_account")
public class AppSysAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 账户总金额(当日垫付金总额+截止当日利息总额+其他资金总额+截止当日充值总额(易联+招行)-截止当日提现总额
     */
    @Column(name = "sys_money")
    private Long sysMoney;

    /**
     * 垫付金总额
     */
    @Column(name = "advance_total")
    private Long advanceTotal;

    /**
     * 垫付金余额
     */
    @Column(name = "advance_balance")
    private Long advanceBalance;

    /**
     * 已垫付金额
     */
    @Column(name = "advance_moeny")
    private Long advanceMoeny;

    /**
     * 当前垫付红线
     */
    @Column(name = "advance_line")
    private Long advanceLine;

    /**
     * 易联入账
     */
    @Column(name = "in_eco")
    private Long inEco;

    /**
     * 所有招商入账
     */
    @Column(name = "in_cmb")
    private Long inCmb;

    /**
     * 总提现金额
     */
    private Long withdraw;

    /**
     * 当日所有用户手续费
     */
    @Column(name = "handling_fee")
    private Long handlingFee;

    /**
     * 当前手续费率(冗余数据
     */
    @Column(name = "current_handling_rate")
    private Long currentHandlingRate;

    /**
     * 其他资金总金额
     */
    @Column(name = "other_money")
    private Long otherMoney;

    @Column(name = "serial_number")
    private String serialNumber;

    private Long interest;

    @Column(name = "today_interest")
    private Long todayInterest;

    /**
     * 生成时间(定时任务,与利息生成的时间一致
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Byte isDel;

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
     * 获取账户总金额(当日垫付金总额+截止当日利息总额+其他资金总额+截止当日充值总额(易联+招行)-截止当日提现总额
     *
     * @return sys_money - 账户总金额(当日垫付金总额+截止当日利息总额+其他资金总额+截止当日充值总额(易联+招行)-截止当日提现总额
     */
    public Long getSysMoney() {
        return sysMoney;
    }

    /**
     * 设置账户总金额(当日垫付金总额+截止当日利息总额+其他资金总额+截止当日充值总额(易联+招行)-截止当日提现总额
     *
     * @param sysMoney 账户总金额(当日垫付金总额+截止当日利息总额+其他资金总额+截止当日充值总额(易联+招行)-截止当日提现总额
     */
    public void setSysMoney(Long sysMoney) {
        this.sysMoney = sysMoney;
    }

    /**
     * 获取垫付金总额
     *
     * @return advance_total - 垫付金总额
     */
    public Long getAdvanceTotal() {
        return advanceTotal;
    }

    /**
     * 设置垫付金总额
     *
     * @param advanceTotal 垫付金总额
     */
    public void setAdvanceTotal(Long advanceTotal) {
        this.advanceTotal = advanceTotal;
    }

    /**
     * 获取垫付金余额
     *
     * @return advance_balance - 垫付金余额
     */
    public Long getAdvanceBalance() {
        return advanceBalance;
    }

    /**
     * 设置垫付金余额
     *
     * @param advanceBalance 垫付金余额
     */
    public void setAdvanceBalance(Long advanceBalance) {
        this.advanceBalance = advanceBalance;
    }

    /**
     * 获取已垫付金额
     *
     * @return advance_moeny - 已垫付金额
     */
    public Long getAdvanceMoeny() {
        return advanceMoeny;
    }

    /**
     * 设置已垫付金额
     *
     * @param advanceMoeny 已垫付金额
     */
    public void setAdvanceMoeny(Long advanceMoeny) {
        this.advanceMoeny = advanceMoeny;
    }

    /**
     * 获取当前垫付红线
     *
     * @return advance_line - 当前垫付红线
     */
    public Long getAdvanceLine() {
        return advanceLine;
    }

    /**
     * 设置当前垫付红线
     *
     * @param advanceLine 当前垫付红线
     */
    public void setAdvanceLine(Long advanceLine) {
        this.advanceLine = advanceLine;
    }

    /**
     * 获取易联入账
     *
     * @return in_eco - 易联入账
     */
    public Long getInEco() {
        return inEco;
    }

    /**
     * 设置易联入账
     *
     * @param inEco 易联入账
     */
    public void setInEco(Long inEco) {
        this.inEco = inEco;
    }

    /**
     * 获取所有招商入账
     *
     * @return in_cmb - 所有招商入账
     */
    public Long getInCmb() {
        return inCmb;
    }

    /**
     * 设置所有招商入账
     *
     * @param inCmb 所有招商入账
     */
    public void setInCmb(Long inCmb) {
        this.inCmb = inCmb;
    }

    /**
     * 获取总提现金额
     *
     * @return withdraw - 总提现金额
     */
    public Long getWithdraw() {
        return withdraw;
    }

    /**
     * 设置总提现金额
     *
     * @param withdraw 总提现金额
     */
    public void setWithdraw(Long withdraw) {
        this.withdraw = withdraw;
    }

    /**
     * 获取当日所有用户手续费
     *
     * @return handling_fee - 当日所有用户手续费
     */
    public Long getHandlingFee() {
        return handlingFee;
    }

    /**
     * 设置当日所有用户手续费
     *
     * @param handlingFee 当日所有用户手续费
     */
    public void setHandlingFee(Long handlingFee) {
        this.handlingFee = handlingFee;
    }

    /**
     * 获取当前手续费率(冗余数据
     *
     * @return current_handling_rate - 当前手续费率(冗余数据
     */
    public Long getCurrentHandlingRate() {
        return currentHandlingRate;
    }

    /**
     * 设置当前手续费率(冗余数据
     *
     * @param currentHandlingRate 当前手续费率(冗余数据
     */
    public void setCurrentHandlingRate(Long currentHandlingRate) {
        this.currentHandlingRate = currentHandlingRate;
    }

    /**
     * 获取其他资金总金额
     *
     * @return other_money - 其他资金总金额
     */
    public Long getOtherMoney() {
        return otherMoney;
    }

    /**
     * 设置其他资金总金额
     *
     * @param otherMoney 其他资金总金额
     */
    public void setOtherMoney(Long otherMoney) {
        this.otherMoney = otherMoney;
    }

    /**
     * @return serial_number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return interest
     */
    public Long getInterest() {
        return interest;
    }

    /**
     * @param interest
     */
    public void setInterest(Long interest) {
        this.interest = interest;
    }

    /**
     * @return today_interest
     */
    public Long getTodayInterest() {
        return todayInterest;
    }

    /**
     * @param todayInterest
     */
    public void setTodayInterest(Long todayInterest) {
        this.todayInterest = todayInterest;
    }

    /**
     * 获取生成时间(定时任务,与利息生成的时间一致
     *
     * @return create_date - 生成时间(定时任务,与利息生成的时间一致
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置生成时间(定时任务,与利息生成的时间一致
     *
     * @param createDate 生成时间(定时任务,与利息生成的时间一致
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取是否删除(1为是0为否)
     *
     * @return is_del - 是否删除(1为是0为否)
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除(1为是0为否)
     *
     * @param isDel 是否删除(1为是0为否)
     */
    public void setIsDel(Byte isDel) {
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
}