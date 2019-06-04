package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order_revok")
public class AppOrderRevok {
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
     * 是否付款人发起的撤销申请
     */
    @Column(name = "is_payer")
    private Boolean isPayer;

    /**
     * 撤销申请人id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 撤销接收人id
     */
    @Column(name = "rece_user_id")
    private Long receUserId;

    /**
     * 撤销原因
     */
    private String remark;

    /**
     * 撤销状态:1为申请撤销,2为撤销成功,3为撤销失败
     */
    private Integer status;

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
     * 是否勾选定金退还
     */
    @Column(name = "is_checked")
    private Boolean isChecked;

    /**
     * 撤销处理结果
     */
    @Column(name = "process_result")
    private String processResult;

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
     * 获取是否付款人发起的撤销申请
     *
     * @return is_payer - 是否付款人发起的撤销申请
     */
    public Boolean getIsPayer() {
        return isPayer;
    }

    /**
     * 设置是否付款人发起的撤销申请
     *
     * @param isPayer 是否付款人发起的撤销申请
     */
    public void setIsPayer(Boolean isPayer) {
        this.isPayer = isPayer;
    }

    /**
     * 获取撤销申请人id
     *
     * @return user_id - 撤销申请人id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置撤销申请人id
     *
     * @param userId 撤销申请人id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取撤销接收人id
     *
     * @return rece_user_id - 撤销接收人id
     */
    public Long getReceUserId() {
        return receUserId;
    }

    /**
     * 设置撤销接收人id
     *
     * @param receUserId 撤销接收人id
     */
    public void setReceUserId(Long receUserId) {
        this.receUserId = receUserId;
    }

    /**
     * 获取撤销原因
     *
     * @return remark - 撤销原因
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置撤销原因
     *
     * @param remark 撤销原因
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取撤销状态:1为申请撤销,2为撤销成功,3为撤销失败
     *
     * @return status - 撤销状态:1为申请撤销,2为撤销成功,3为撤销失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置撤销状态:1为申请撤销,2为撤销成功,3为撤销失败
     *
     * @param status 撤销状态:1为申请撤销,2为撤销成功,3为撤销失败
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取是否勾选定金退还
     *
     * @return is_checked - 是否勾选定金退还
     */
    public Boolean getIsChecked() {
        return isChecked;
    }

    /**
     * 设置是否勾选定金退还
     *
     * @param isChecked 是否勾选定金退还
     */
    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    /**
     * 获取撤销处理结果
     *
     * @return process_result - 撤销处理结果
     */
    public String getProcessResult() {
        return processResult;
    }

    /**
     * 设置撤销处理结果
     *
     * @param processResult 撤销处理结果
     */
    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }
}