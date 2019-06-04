package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order_monitor")
public class AppOrderMonitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单业务流程中需要监控的金额
     */
    private Long money;

    /**
     * 监控状态:1为订单交易金额转入,2为订单交易金额转出,3为订单交易金额冻结
     */
    @Column(name = "notice_type")
    private Integer noticeType;

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
     * 交易金额转入用户id
     */
    @Column(name = "inner_user_id")
    private Long innerUserId;

    /**
     * 交易金额转出用户id
     */
    @Column(name = "out_user_id")
    private Long outUserId;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 付款金额类型: 1为订单定金,2为订单尾款,3为订单全额,4为订单预付款
     */
    @Column(name = "pay_money_type")
    private Integer payMoneyType;

    /**
     * 金额转出时间
     */
    @Column(name = "out_money_date")
    private Date outMoneyDate;

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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单业务流程中需要监控的金额
     *
     * @return money - 订单业务流程中需要监控的金额
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 设置订单业务流程中需要监控的金额
     *
     * @param money 订单业务流程中需要监控的金额
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 获取监控状态:1为订单交易金额转入,2为订单交易金额转出,3为订单交易金额冻结
     *
     * @return notice_type - 监控状态:1为订单交易金额转入,2为订单交易金额转出,3为订单交易金额冻结
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /**
     * 设置监控状态:1为订单交易金额转入,2为订单交易金额转出,3为订单交易金额冻结
     *
     * @param noticeType 监控状态:1为订单交易金额转入,2为订单交易金额转出,3为订单交易金额冻结
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
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
     * 获取交易金额转入用户id
     *
     * @return inner_user_id - 交易金额转入用户id
     */
    public Long getInnerUserId() {
        return innerUserId;
    }

    /**
     * 设置交易金额转入用户id
     *
     * @param innerUserId 交易金额转入用户id
     */
    public void setInnerUserId(Long innerUserId) {
        this.innerUserId = innerUserId;
    }

    /**
     * 获取交易金额转出用户id
     *
     * @return out_user_id - 交易金额转出用户id
     */
    public Long getOutUserId() {
        return outUserId;
    }

    /**
     * 设置交易金额转出用户id
     *
     * @param outUserId 交易金额转出用户id
     */
    public void setOutUserId(Long outUserId) {
        this.outUserId = outUserId;
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
     * 获取付款金额类型: 1为订单定金,2为订单尾款,3为订单全额,4为订单预付款
     *
     * @return pay_money_type - 付款金额类型: 1为订单定金,2为订单尾款,3为订单全额,4为订单预付款
     */
    public Integer getPayMoneyType() {
        return payMoneyType;
    }

    /**
     * 设置付款金额类型: 1为订单定金,2为订单尾款,3为订单全额,4为订单预付款
     *
     * @param payMoneyType 付款金额类型: 1为订单定金,2为订单尾款,3为订单全额,4为订单预付款
     */
    public void setPayMoneyType(Integer payMoneyType) {
        this.payMoneyType = payMoneyType;
    }

    /**
     * 获取金额转出时间
     *
     * @return out_money_date - 金额转出时间
     */
    public Date getOutMoneyDate() {
        return outMoneyDate;
    }

    /**
     * 设置金额转出时间
     *
     * @param outMoneyDate 金额转出时间
     */
    public void setOutMoneyDate(Date outMoneyDate) {
        this.outMoneyDate = outMoneyDate;
    }
}