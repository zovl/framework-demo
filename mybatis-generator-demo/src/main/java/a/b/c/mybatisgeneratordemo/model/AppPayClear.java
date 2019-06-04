package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_pay_clear")
public class AppPayClear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 清算日期
     */
    @Column(name = "clear_date")
    private Date clearDate;

    /**
     * 每日充值清算流水号
     */
    @Column(name = "pay_clear_no")
    private String payClearNo;

    /**
     * 应到账金额(本地根据充值表统计)
     */
    @Column(name = "should_money")
    private Long shouldMoney;

    /**
     * 实到账金额
     */
    @Column(name = "real_money")
    private Long realMoney;

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
     * 获取清算日期
     *
     * @return clear_date - 清算日期
     */
    public Date getClearDate() {
        return clearDate;
    }

    /**
     * 设置清算日期
     *
     * @param clearDate 清算日期
     */
    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    /**
     * 获取每日充值清算流水号
     *
     * @return pay_clear_no - 每日充值清算流水号
     */
    public String getPayClearNo() {
        return payClearNo;
    }

    /**
     * 设置每日充值清算流水号
     *
     * @param payClearNo 每日充值清算流水号
     */
    public void setPayClearNo(String payClearNo) {
        this.payClearNo = payClearNo;
    }

    /**
     * 获取应到账金额(本地根据充值表统计)
     *
     * @return should_money - 应到账金额(本地根据充值表统计)
     */
    public Long getShouldMoney() {
        return shouldMoney;
    }

    /**
     * 设置应到账金额(本地根据充值表统计)
     *
     * @param shouldMoney 应到账金额(本地根据充值表统计)
     */
    public void setShouldMoney(Long shouldMoney) {
        this.shouldMoney = shouldMoney;
    }

    /**
     * 获取实到账金额
     *
     * @return real_money - 实到账金额
     */
    public Long getRealMoney() {
        return realMoney;
    }

    /**
     * 设置实到账金额
     *
     * @param realMoney 实到账金额
     */
    public void setRealMoney(Long realMoney) {
        this.realMoney = realMoney;
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