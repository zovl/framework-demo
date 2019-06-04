package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_message_group")
public class AppMessageGroup {
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
     * 聊天对象id
     */
    @Column(name = "chat_user_id")
    private Long chatUserId;

    /**
     * 聊天组名
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 聊天组图片路径
     */
    @Column(name = "group_avatar")
    private String groupAvatar;

    /**
     * 最后描述
     */
    @Column(name = "last_depiction")
    private String lastDepiction;

    /**
     * 未读消息数
     */
    @Column(name = "unread_count")
    private Integer unreadCount;

    /**
     * 是否置顶(1为是0为否)
     */
    @Column(name = "is_top")
    private Boolean isTop;

    /**
     * 是否屏蔽(1为是0为否)
     */
    @Column(name = "is_shield")
    private Boolean isShield;

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
     * 获取聊天对象id
     *
     * @return chat_user_id - 聊天对象id
     */
    public Long getChatUserId() {
        return chatUserId;
    }

    /**
     * 设置聊天对象id
     *
     * @param chatUserId 聊天对象id
     */
    public void setChatUserId(Long chatUserId) {
        this.chatUserId = chatUserId;
    }

    /**
     * 获取聊天组名
     *
     * @return group_name - 聊天组名
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置聊天组名
     *
     * @param groupName 聊天组名
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取聊天组图片路径
     *
     * @return group_avatar - 聊天组图片路径
     */
    public String getGroupAvatar() {
        return groupAvatar;
    }

    /**
     * 设置聊天组图片路径
     *
     * @param groupAvatar 聊天组图片路径
     */
    public void setGroupAvatar(String groupAvatar) {
        this.groupAvatar = groupAvatar;
    }

    /**
     * 获取最后描述
     *
     * @return last_depiction - 最后描述
     */
    public String getLastDepiction() {
        return lastDepiction;
    }

    /**
     * 设置最后描述
     *
     * @param lastDepiction 最后描述
     */
    public void setLastDepiction(String lastDepiction) {
        this.lastDepiction = lastDepiction;
    }

    /**
     * 获取未读消息数
     *
     * @return unread_count - 未读消息数
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    /**
     * 设置未读消息数
     *
     * @param unreadCount 未读消息数
     */
    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    /**
     * 获取是否置顶(1为是0为否)
     *
     * @return is_top - 是否置顶(1为是0为否)
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * 设置是否置顶(1为是0为否)
     *
     * @param isTop 是否置顶(1为是0为否)
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * 获取是否屏蔽(1为是0为否)
     *
     * @return is_shield - 是否屏蔽(1为是0为否)
     */
    public Boolean getIsShield() {
        return isShield;
    }

    /**
     * 设置是否屏蔽(1为是0为否)
     *
     * @param isShield 是否屏蔽(1为是0为否)
     */
    public void setIsShield(Boolean isShield) {
        this.isShield = isShield;
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