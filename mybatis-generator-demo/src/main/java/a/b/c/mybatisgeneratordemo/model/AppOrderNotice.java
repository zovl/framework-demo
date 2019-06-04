package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order_notice")
public class AppOrderNotice {
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
     * 通知发起人id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 通知接收人id
     */
    @Column(name = "rece_user_id")
    private Long receUserId;

    /**
     * 通知类型:1为确认付款通知,2为取消订单通知,3为取消订单失败通知
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
     * 获取通知发起人id
     *
     * @return user_id - 通知发起人id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置通知发起人id
     *
     * @param userId 通知发起人id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取通知接收人id
     *
     * @return rece_user_id - 通知接收人id
     */
    public Long getReceUserId() {
        return receUserId;
    }

    /**
     * 设置通知接收人id
     *
     * @param receUserId 通知接收人id
     */
    public void setReceUserId(Long receUserId) {
        this.receUserId = receUserId;
    }

    /**
     * 获取通知类型:1为确认付款通知,2为取消订单通知,3为取消订单失败通知
     *
     * @return notice_type - 通知类型:1为确认付款通知,2为取消订单通知,3为取消订单失败通知
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /**
     * 设置通知类型:1为确认付款通知,2为取消订单通知,3为取消订单失败通知
     *
     * @param noticeType 通知类型:1为确认付款通知,2为取消订单通知,3为取消订单失败通知
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
}