package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_friend_ship")
public class AppFriendShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 好友用户id
     */
    @Column(name = "friend_user_id")
    private Long friendUserId;

    /**
     * 状态:0为等待验证,1为已添加
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
     * 好友备注
     */
    @Column(name = "friend_remark")
    private String friendRemark;

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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取好友用户id
     *
     * @return friend_user_id - 好友用户id
     */
    public Long getFriendUserId() {
        return friendUserId;
    }

    /**
     * 设置好友用户id
     *
     * @param friendUserId 好友用户id
     */
    public void setFriendUserId(Long friendUserId) {
        this.friendUserId = friendUserId;
    }

    /**
     * 获取状态:0为等待验证,1为已添加
     *
     * @return status - 状态:0为等待验证,1为已添加
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态:0为等待验证,1为已添加
     *
     * @param status 状态:0为等待验证,1为已添加
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
     * 获取好友备注
     *
     * @return friend_remark - 好友备注
     */
    public String getFriendRemark() {
        return friendRemark;
    }

    /**
     * 设置好友备注
     *
     * @param friendRemark 好友备注
     */
    public void setFriendRemark(String friendRemark) {
        this.friendRemark = friendRemark;
    }
}