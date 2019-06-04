package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_bill_record")
public class AppBillRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 记录类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现
     */
    private Integer type;

    /**
     * 账单id,充值记录id,提现记录id
     */
    @Column(name = "action_id")
    private Long actionId;

    /**
     * 金额
     */
    private Long money;

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
     * 获取记录类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现
     *
     * @return type - 记录类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置记录类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现
     *
     * @param type 记录类型:1为普通转账,2为扫码转账,3为订单预付款,4为充值,5为提现
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取账单id,充值记录id,提现记录id
     *
     * @return action_id - 账单id,充值记录id,提现记录id
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * 设置账单id,充值记录id,提现记录id
     *
     * @param actionId 账单id,充值记录id,提现记录id
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
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