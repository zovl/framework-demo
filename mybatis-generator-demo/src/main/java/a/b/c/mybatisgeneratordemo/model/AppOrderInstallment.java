package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order_installment")
public class AppOrderInstallment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 分期序号
     */
    @Column(name = "sort_no")
    private Integer sortNo;

    /**
     * 提交金额 元单位
     */
    private Double money;

    /**
     * 付款时间
     */
    @Column(name = "pay_date")
    private Date payDate;

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
     * 真实金额
     */
    @Column(name = "real_money")
    private Long realMoney;

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
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取分期序号
     *
     * @return sort_no - 分期序号
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * 设置分期序号
     *
     * @param sortNo 分期序号
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取提交金额 元单位
     *
     * @return money - 提交金额 元单位
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置提交金额 元单位
     *
     * @param money 提交金额 元单位
     */
    public void setMoney(Double money) {
        this.money = money;
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
     * 获取真实金额
     *
     * @return real_money - 真实金额
     */
    public Long getRealMoney() {
        return realMoney;
    }

    /**
     * 设置真实金额
     *
     * @param realMoney 真实金额
     */
    public void setRealMoney(Long realMoney) {
        this.realMoney = realMoney;
    }
}