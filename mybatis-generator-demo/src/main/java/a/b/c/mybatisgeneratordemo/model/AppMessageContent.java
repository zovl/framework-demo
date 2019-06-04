package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_message_content")
public class AppMessageContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 消息组id
     */
    @Column(name = "message_group_id")
    private Long messageGroupId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 消息类型:1=文字,2=图片,3=音频,4=收藏,5=名片,6=转账,7=订单
     */
    @Column(name = "msg_type")
    private Integer msgType;

    /**
     * 有可能是收藏id,名片的用户id,转账账单id,订单id
     */
    @Column(name = "action_id")
    private Long actionId;

    /**
     * 资源地址:图片资源,音频资源
     */
    @Column(name = "resource_path")
    private String resourcePath;

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
     * 文字内容
     */
    private String text;

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
     * 获取消息组id
     *
     * @return message_group_id - 消息组id
     */
    public Long getMessageGroupId() {
        return messageGroupId;
    }

    /**
     * 设置消息组id
     *
     * @param messageGroupId 消息组id
     */
    public void setMessageGroupId(Long messageGroupId) {
        this.messageGroupId = messageGroupId;
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
     * 获取消息类型:1=文字,2=图片,3=音频,4=收藏,5=名片,6=转账,7=订单
     *
     * @return msg_type - 消息类型:1=文字,2=图片,3=音频,4=收藏,5=名片,6=转账,7=订单
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型:1=文字,2=图片,3=音频,4=收藏,5=名片,6=转账,7=订单
     *
     * @param msgType 消息类型:1=文字,2=图片,3=音频,4=收藏,5=名片,6=转账,7=订单
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * 获取有可能是收藏id,名片的用户id,转账账单id,订单id
     *
     * @return action_id - 有可能是收藏id,名片的用户id,转账账单id,订单id
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * 设置有可能是收藏id,名片的用户id,转账账单id,订单id
     *
     * @param actionId 有可能是收藏id,名片的用户id,转账账单id,订单id
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取资源地址:图片资源,音频资源
     *
     * @return resource_path - 资源地址:图片资源,音频资源
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * 设置资源地址:图片资源,音频资源
     *
     * @param resourcePath 资源地址:图片资源,音频资源
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
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
     * 获取文字内容
     *
     * @return text - 文字内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置文字内容
     *
     * @param text 文字内容
     */
    public void setText(String text) {
        this.text = text;
    }
}