package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_system_broadcast")
public class AppSystemBroadcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 系统广播标题
     */
    private String title;

    /**
     * 消息类型:1=普通消息,2=系统更新
     */
    private Boolean type;

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
     * 广播内容
     */
    private String description;

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
     * 获取系统广播标题
     *
     * @return title - 系统广播标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置系统广播标题
     *
     * @param title 系统广播标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取消息类型:1=普通消息,2=系统更新
     *
     * @return type - 消息类型:1=普通消息,2=系统更新
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置消息类型:1=普通消息,2=系统更新
     *
     * @param type 消息类型:1=普通消息,2=系统更新
     */
    public void setType(Boolean type) {
        this.type = type;
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
     * 获取广播内容
     *
     * @return description - 广播内容
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置广播内容
     *
     * @param description 广播内容
     */
    public void setDescription(String description) {
        this.description = description;
    }
}