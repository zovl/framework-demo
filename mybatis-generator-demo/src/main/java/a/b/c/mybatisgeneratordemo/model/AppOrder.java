package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order")
public class AppOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 订单发起人id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 订单类型:1=买入,2=卖出
     */
    @Column(name = "order_type")
    private Integer orderType;

    /**
     * 订单交易对象id
     */
    @Column(name = "tran_user_id")
    private Long tranUserId;

    /**
     * 商品名
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品描述
     */
    @Column(name = "product_desc")
    private String productDesc;

    /**
     * 订单总金额(单位分)
     */
    @Column(name = "order_amount")
    private Long orderAmount;

    /**
     * 双方协议的收货时间(非真实订单完成时间)
     */
    @Column(name = "rece_date")
    private Date receDate;

    /**
     * 文字备注
     */
    @Column(name = "text_mark")
    private String textMark;

    /**
     * 图片备注1
     */
    @Column(name = "pic_mark_one")
    private String picMarkOne;

    /**
     * 付款方式:1=到付,2=预付,3=分期付
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 付款方式为1,则需要定金(单位分)
     */
    @Column(name = "earnest_money")
    private Long earnestMoney;

    /**
     * 付款方式为1,尾款(单位分)
     */
    @Column(name = "surplus_money")
    private Long surplusMoney;

    /**
     * 付款方式为3,则需要预付款(单位分)
     */
    @Column(name = "pre_money")
    private Long preMoney;

    /**
     * 订单状态:1为未付款,2为已确认订单,3为已过期,4为已撤销,5为已冻结,6为已付款,7为已退款,8为已完成,9为撤销申请中,10为冻结申请中,11为退款申请中
     */
    @Column(name = "order_status")
    private Integer orderStatus;

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
     * 订单过期时间
     */
    @Column(name = "expired_date")
    private Date expiredDate;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 完成订单(收货)方式 1为对方确认收货,2为系统自动完成
     */
    @Column(name = "finish_order_type")
    private Integer finishOrderType;

    /**
     * 确认订单时间
     */
    @Column(name = "confirm_date")
    private Date confirmDate;

    /**
     * 完成订单时间
     */
    @Column(name = "finish_date")
    private Date finishDate;

    /**
     * 交易金额,以分为单位
     */
    @Column(name = "tran_money")
    private Long tranMoney;

    /**
     * 订单交易时间
     */
    @Column(name = "pay_date")
    private Date payDate;

    /**
     * 图片备注2
     */
    @Column(name = "pic_mark_two")
    private String picMarkTwo;

    /**
     * 图片备注3
     */
    @Column(name = "pic_mark_three")
    private String picMarkThree;

    /**
     * 图片备注4
     */
    @Column(name = "pic_mark_four")
    private String picMarkFour;

    /**
     * 图片备注5
     */
    @Column(name = "pic_mark_five")
    private String picMarkFive;

    /**
     * 图片备注6
     */
    @Column(name = "pic_mark_six")
    private String picMarkSix;

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
     * 获取订单发起人id
     *
     * @return user_id - 订单发起人id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置订单发起人id
     *
     * @param userId 订单发起人id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取订单类型:1=买入,2=卖出
     *
     * @return order_type - 订单类型:1=买入,2=卖出
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型:1=买入,2=卖出
     *
     * @param orderType 订单类型:1=买入,2=卖出
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取订单交易对象id
     *
     * @return tran_user_id - 订单交易对象id
     */
    public Long getTranUserId() {
        return tranUserId;
    }

    /**
     * 设置订单交易对象id
     *
     * @param tranUserId 订单交易对象id
     */
    public void setTranUserId(Long tranUserId) {
        this.tranUserId = tranUserId;
    }

    /**
     * 获取商品名
     *
     * @return product_name - 商品名
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名
     *
     * @param productName 商品名
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品描述
     *
     * @return product_desc - 商品描述
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * 设置商品描述
     *
     * @param productDesc 商品描述
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * 获取订单总金额(单位分)
     *
     * @return order_amount - 订单总金额(单位分)
     */
    public Long getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单总金额(单位分)
     *
     * @param orderAmount 订单总金额(单位分)
     */
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取双方协议的收货时间(非真实订单完成时间)
     *
     * @return rece_date - 双方协议的收货时间(非真实订单完成时间)
     */
    public Date getReceDate() {
        return receDate;
    }

    /**
     * 设置双方协议的收货时间(非真实订单完成时间)
     *
     * @param receDate 双方协议的收货时间(非真实订单完成时间)
     */
    public void setReceDate(Date receDate) {
        this.receDate = receDate;
    }

    /**
     * 获取文字备注
     *
     * @return text_mark - 文字备注
     */
    public String getTextMark() {
        return textMark;
    }

    /**
     * 设置文字备注
     *
     * @param textMark 文字备注
     */
    public void setTextMark(String textMark) {
        this.textMark = textMark;
    }

    /**
     * 获取图片备注1
     *
     * @return pic_mark_one - 图片备注1
     */
    public String getPicMarkOne() {
        return picMarkOne;
    }

    /**
     * 设置图片备注1
     *
     * @param picMarkOne 图片备注1
     */
    public void setPicMarkOne(String picMarkOne) {
        this.picMarkOne = picMarkOne;
    }

    /**
     * 获取付款方式:1=到付,2=预付,3=分期付
     *
     * @return pay_type - 付款方式:1=到付,2=预付,3=分期付
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置付款方式:1=到付,2=预付,3=分期付
     *
     * @param payType 付款方式:1=到付,2=预付,3=分期付
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取付款方式为1,则需要定金(单位分)
     *
     * @return earnest_money - 付款方式为1,则需要定金(单位分)
     */
    public Long getEarnestMoney() {
        return earnestMoney;
    }

    /**
     * 设置付款方式为1,则需要定金(单位分)
     *
     * @param earnestMoney 付款方式为1,则需要定金(单位分)
     */
    public void setEarnestMoney(Long earnestMoney) {
        this.earnestMoney = earnestMoney;
    }

    /**
     * 获取付款方式为1,尾款(单位分)
     *
     * @return surplus_money - 付款方式为1,尾款(单位分)
     */
    public Long getSurplusMoney() {
        return surplusMoney;
    }

    /**
     * 设置付款方式为1,尾款(单位分)
     *
     * @param surplusMoney 付款方式为1,尾款(单位分)
     */
    public void setSurplusMoney(Long surplusMoney) {
        this.surplusMoney = surplusMoney;
    }

    /**
     * 获取付款方式为3,则需要预付款(单位分)
     *
     * @return pre_money - 付款方式为3,则需要预付款(单位分)
     */
    public Long getPreMoney() {
        return preMoney;
    }

    /**
     * 设置付款方式为3,则需要预付款(单位分)
     *
     * @param preMoney 付款方式为3,则需要预付款(单位分)
     */
    public void setPreMoney(Long preMoney) {
        this.preMoney = preMoney;
    }

    /**
     * 获取订单状态:1为未付款,2为已确认订单,3为已过期,4为已撤销,5为已冻结,6为已付款,7为已退款,8为已完成,9为撤销申请中,10为冻结申请中,11为退款申请中
     *
     * @return order_status - 订单状态:1为未付款,2为已确认订单,3为已过期,4为已撤销,5为已冻结,6为已付款,7为已退款,8为已完成,9为撤销申请中,10为冻结申请中,11为退款申请中
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态:1为未付款,2为已确认订单,3为已过期,4为已撤销,5为已冻结,6为已付款,7为已退款,8为已完成,9为撤销申请中,10为冻结申请中,11为退款申请中
     *
     * @param orderStatus 订单状态:1为未付款,2为已确认订单,3为已过期,4为已撤销,5为已冻结,6为已付款,7为已退款,8为已完成,9为撤销申请中,10为冻结申请中,11为退款申请中
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
     * 获取订单过期时间
     *
     * @return expired_date - 订单过期时间
     */
    public Date getExpiredDate() {
        return expiredDate;
    }

    /**
     * 设置订单过期时间
     *
     * @param expiredDate 订单过期时间
     */
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
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
     * 获取完成订单(收货)方式 1为对方确认收货,2为系统自动完成
     *
     * @return finish_order_type - 完成订单(收货)方式 1为对方确认收货,2为系统自动完成
     */
    public Integer getFinishOrderType() {
        return finishOrderType;
    }

    /**
     * 设置完成订单(收货)方式 1为对方确认收货,2为系统自动完成
     *
     * @param finishOrderType 完成订单(收货)方式 1为对方确认收货,2为系统自动完成
     */
    public void setFinishOrderType(Integer finishOrderType) {
        this.finishOrderType = finishOrderType;
    }

    /**
     * 获取确认订单时间
     *
     * @return confirm_date - 确认订单时间
     */
    public Date getConfirmDate() {
        return confirmDate;
    }

    /**
     * 设置确认订单时间
     *
     * @param confirmDate 确认订单时间
     */
    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    /**
     * 获取完成订单时间
     *
     * @return finish_date - 完成订单时间
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * 设置完成订单时间
     *
     * @param finishDate 完成订单时间
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 获取交易金额,以分为单位
     *
     * @return tran_money - 交易金额,以分为单位
     */
    public Long getTranMoney() {
        return tranMoney;
    }

    /**
     * 设置交易金额,以分为单位
     *
     * @param tranMoney 交易金额,以分为单位
     */
    public void setTranMoney(Long tranMoney) {
        this.tranMoney = tranMoney;
    }

    /**
     * 获取订单交易时间
     *
     * @return pay_date - 订单交易时间
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
     * 设置订单交易时间
     *
     * @param payDate 订单交易时间
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    /**
     * 获取图片备注2
     *
     * @return pic_mark_two - 图片备注2
     */
    public String getPicMarkTwo() {
        return picMarkTwo;
    }

    /**
     * 设置图片备注2
     *
     * @param picMarkTwo 图片备注2
     */
    public void setPicMarkTwo(String picMarkTwo) {
        this.picMarkTwo = picMarkTwo;
    }

    /**
     * 获取图片备注3
     *
     * @return pic_mark_three - 图片备注3
     */
    public String getPicMarkThree() {
        return picMarkThree;
    }

    /**
     * 设置图片备注3
     *
     * @param picMarkThree 图片备注3
     */
    public void setPicMarkThree(String picMarkThree) {
        this.picMarkThree = picMarkThree;
    }

    /**
     * 获取图片备注4
     *
     * @return pic_mark_four - 图片备注4
     */
    public String getPicMarkFour() {
        return picMarkFour;
    }

    /**
     * 设置图片备注4
     *
     * @param picMarkFour 图片备注4
     */
    public void setPicMarkFour(String picMarkFour) {
        this.picMarkFour = picMarkFour;
    }

    /**
     * 获取图片备注5
     *
     * @return pic_mark_five - 图片备注5
     */
    public String getPicMarkFive() {
        return picMarkFive;
    }

    /**
     * 设置图片备注5
     *
     * @param picMarkFive 图片备注5
     */
    public void setPicMarkFive(String picMarkFive) {
        this.picMarkFive = picMarkFive;
    }

    /**
     * 获取图片备注6
     *
     * @return pic_mark_six - 图片备注6
     */
    public String getPicMarkSix() {
        return picMarkSix;
    }

    /**
     * 设置图片备注6
     *
     * @param picMarkSix 图片备注6
     */
    public void setPicMarkSix(String picMarkSix) {
        this.picMarkSix = picMarkSix;
    }
}