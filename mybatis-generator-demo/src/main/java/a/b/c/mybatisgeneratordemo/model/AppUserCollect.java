package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user_collect")
public class AppUserCollect {
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
     * 收藏类型:1=文字,2=图片,3=音频,4=名片
     */
    @Column(name = "collect_type")
    private Integer collectType;

    /**
     * 名片的用户id
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
     * 发布人loginId
     */
    @Column(name = "publish_login_id")
    private String publishLoginId;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 语音时长
     */
    @Column(name = "time_length")
    private String timeLength;

    /**
     * 消息id(环信)
     */
    @Column(name = "msg_id")
    private String msgId;

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
     * 获取收藏类型:1=文字,2=图片,3=音频,4=名片
     *
     * @return collect_type - 收藏类型:1=文字,2=图片,3=音频,4=名片
     */
    public Integer getCollectType() {
        return collectType;
    }

    /**
     * 设置收藏类型:1=文字,2=图片,3=音频,4=名片
     *
     * @param collectType 收藏类型:1=文字,2=图片,3=音频,4=名片
     */
    public void setCollectType(Integer collectType) {
        this.collectType = collectType;
    }

    /**
     * 获取名片的用户id
     *
     * @return action_id - 名片的用户id
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * 设置名片的用户id
     *
     * @param actionId 名片的用户id
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
     * 获取发布人loginId
     *
     * @return publish_login_id - 发布人loginId
     */
    public String getPublishLoginId() {
        return publishLoginId;
    }

    /**
     * 设置发布人loginId
     *
     * @param publishLoginId 发布人loginId
     */
    public void setPublishLoginId(String publishLoginId) {
        this.publishLoginId = publishLoginId;
    }

    /**
     * 获取文件名
     *
     * @return filename - 文件名
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名
     *
     * @param filename 文件名
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取语音时长
     *
     * @return time_length - 语音时长
     */
    public String getTimeLength() {
        return timeLength;
    }

    /**
     * 设置语音时长
     *
     * @param timeLength 语音时长
     */
    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    /**
     * 获取消息id(环信)
     *
     * @return msg_id - 消息id(环信)
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * 设置消息id(环信)
     *
     * @param msgId 消息id(环信)
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
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