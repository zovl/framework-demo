package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_contact_message")
public class AppContactMessage {
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
     * 目标用户id
     */
    @Column(name = "target_id")
    private Long targetId;

    /**
     * 消息类型:1=等待验证,2=已添加
     */
    @Column(name = "msg_type")
    private Integer msgType;

    /**
     * 验证过期时间
     */
    @Column(name = "expired_date")
    private Date expiredDate;

    /**
     * 消息内容
     */
    private String message;

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
     * 获取目标用户id
     *
     * @return target_id - 目标用户id
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * 设置目标用户id
     *
     * @param targetId 目标用户id
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * 获取消息类型:1=等待验证,2=已添加
     *
     * @return msg_type - 消息类型:1=等待验证,2=已添加
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型:1=等待验证,2=已添加
     *
     * @param msgType 消息类型:1=等待验证,2=已添加
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * 获取验证过期时间
     *
     * @return expired_date - 验证过期时间
     */
    public Date getExpiredDate() {
        return expiredDate;
    }

    /**
     * 设置验证过期时间
     *
     * @param expiredDate 验证过期时间
     */
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    /**
     * 获取消息内容
     *
     * @return message - 消息内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置消息内容
     *
     * @param message 消息内容
     */
    public void setMessage(String message) {
        this.message = message;
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
}