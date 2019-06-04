package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_system_message_copy")
public class AppSystemMessageCopy {
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
     * 消息类型:1=系统普通消息,2=账单消息,3=订单消息,4=充值消息,5=提现消息
     */
    @Column(name = "msg_type")
    private Integer msgType;

    /**
     * 账单id,订单id,充值记录id,提现记录id,广播id
     */
    @Column(name = "action_id")
    private Long actionId;

    /**
     * 系统头像图片路径
     */
    @Column(name = "system_avatar")
    private String systemAvatar;

    /**
     * 系统消息标题
     */
    private String title;

    /**
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Boolean isDel;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    /**
     * 描述
     */
    private String depiction;

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
     * 获取消息类型:1=系统普通消息,2=账单消息,3=订单消息,4=充值消息,5=提现消息
     *
     * @return msg_type - 消息类型:1=系统普通消息,2=账单消息,3=订单消息,4=充值消息,5=提现消息
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型:1=系统普通消息,2=账单消息,3=订单消息,4=充值消息,5=提现消息
     *
     * @param msgType 消息类型:1=系统普通消息,2=账单消息,3=订单消息,4=充值消息,5=提现消息
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * 获取账单id,订单id,充值记录id,提现记录id,广播id
     *
     * @return action_id - 账单id,订单id,充值记录id,提现记录id,广播id
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * 设置账单id,订单id,充值记录id,提现记录id,广播id
     *
     * @param actionId 账单id,订单id,充值记录id,提现记录id,广播id
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取系统头像图片路径
     *
     * @return system_avatar - 系统头像图片路径
     */
    public String getSystemAvatar() {
        return systemAvatar;
    }

    /**
     * 设置系统头像图片路径
     *
     * @param systemAvatar 系统头像图片路径
     */
    public void setSystemAvatar(String systemAvatar) {
        this.systemAvatar = systemAvatar;
    }

    /**
     * 获取系统消息标题
     *
     * @return title - 系统消息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置系统消息标题
     *
     * @param title 系统消息标题
     */
    public void setTitle(String title) {
        this.title = title;
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
     * 获取描述
     *
     * @return depiction - 描述
     */
    public String getDepiction() {
        return depiction;
    }

    /**
     * 设置描述
     *
     * @param depiction 描述
     */
    public void setDepiction(String depiction) {
        this.depiction = depiction;
    }
}