package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_system_log")
public class AppSystemLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 日志名称
     */
    private String title;

    /**
     * 根据类型关联的ID
     */
    @Column(name = "action_id")
    private Long actionId;

    /**
     * 日志类型:1=用户意见反馈,2=垫付金到达红线,3=冻结生效
     */
    @Column(name = "log_type")
    private Byte logType;

    /**
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Byte isDel;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    /**
     * 日志内容
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
     * 获取日志名称
     *
     * @return title - 日志名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置日志名称
     *
     * @param title 日志名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取根据类型关联的ID
     *
     * @return action_id - 根据类型关联的ID
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * 设置根据类型关联的ID
     *
     * @param actionId 根据类型关联的ID
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取日志类型:1=用户意见反馈,2=垫付金到达红线,3=冻结生效
     *
     * @return log_type - 日志类型:1=用户意见反馈,2=垫付金到达红线,3=冻结生效
     */
    public Byte getLogType() {
        return logType;
    }

    /**
     * 设置日志类型:1=用户意见反馈,2=垫付金到达红线,3=冻结生效
     *
     * @param logType 日志类型:1=用户意见反馈,2=垫付金到达红线,3=冻结生效
     */
    public void setLogType(Byte logType) {
        this.logType = logType;
    }

    /**
     * 获取是否删除(1为是0为否)
     *
     * @return is_del - 是否删除(1为是0为否)
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除(1为是0为否)
     *
     * @param isDel 是否删除(1为是0为否)
     */
    public void setIsDel(Byte isDel) {
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
     * 获取日志内容
     *
     * @return description - 日志内容
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置日志内容
     *
     * @param description 日志内容
     */
    public void setDescription(String description) {
        this.description = description;
    }
}