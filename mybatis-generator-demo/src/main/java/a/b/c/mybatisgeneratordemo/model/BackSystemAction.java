package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "back_system_action")
public class BackSystemAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 操作行为
     */
    private String title;

    /**
     * 详细描述(冗余)
     */
    private String description;

    /**
     * 管理员id
     */
    @Column(name = "admin_id")
    private String adminId;

    /**
     * 管理员昵称(冗余)
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * 管理员当前ip(冗余)
     */
    @Column(name = "admin_ip")
    private String adminIp;

    /**
     * 关联的对象的id，例如系统配置id,用户id,订单id,提现id,系统广播id(冗余)
     */
    @Column(name = "action_id")
    private String actionId;

    /**
     * 日志类型:
  1.系统配置 （修改参数）
  2.个人认证审核（审核通过/不通过）
  3.商户认证审核（审核通过/不通过）
  4.提现管理（打款确认）
  5.对账失败（备注和已处理）
  6.系统广播（发布推送和更新）
  7.角色管理（新增角色/权限修改）
  8.管理员管理（新增/修改管理员角色）
  9.订单管理（发起冻结资金判定）
  10.登录模块（登录记录）
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
     * 获取操作行为
     *
     * @return title - 操作行为
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置操作行为
     *
     * @param title 操作行为
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取详细描述(冗余)
     *
     * @return description - 详细描述(冗余)
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置详细描述(冗余)
     *
     * @param description 详细描述(冗余)
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取管理员id
     *
     * @return admin_id - 管理员id
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * 设置管理员id
     *
     * @param adminId 管理员id
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取管理员昵称(冗余)
     *
     * @return admin_name - 管理员昵称(冗余)
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置管理员昵称(冗余)
     *
     * @param adminName 管理员昵称(冗余)
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * 获取管理员当前ip(冗余)
     *
     * @return admin_ip - 管理员当前ip(冗余)
     */
    public String getAdminIp() {
        return adminIp;
    }

    /**
     * 设置管理员当前ip(冗余)
     *
     * @param adminIp 管理员当前ip(冗余)
     */
    public void setAdminIp(String adminIp) {
        this.adminIp = adminIp;
    }

    /**
     * 获取关联的对象的id，例如系统配置id,用户id,订单id,提现id,系统广播id(冗余)
     *
     * @return action_id - 关联的对象的id，例如系统配置id,用户id,订单id,提现id,系统广播id(冗余)
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * 设置关联的对象的id，例如系统配置id,用户id,订单id,提现id,系统广播id(冗余)
     *
     * @param actionId 关联的对象的id，例如系统配置id,用户id,订单id,提现id,系统广播id(冗余)
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取日志类型:
  1.系统配置 （修改参数）
  2.个人认证审核（审核通过/不通过）
  3.商户认证审核（审核通过/不通过）
  4.提现管理（打款确认）
  5.对账失败（备注和已处理）
  6.系统广播（发布推送和更新）
  7.角色管理（新增角色/权限修改）
  8.管理员管理（新增/修改管理员角色）
  9.订单管理（发起冻结资金判定）
  10.登录模块（登录记录）
     *
     * @return log_type - 日志类型:
  1.系统配置 （修改参数）
  2.个人认证审核（审核通过/不通过）
  3.商户认证审核（审核通过/不通过）
  4.提现管理（打款确认）
  5.对账失败（备注和已处理）
  6.系统广播（发布推送和更新）
  7.角色管理（新增角色/权限修改）
  8.管理员管理（新增/修改管理员角色）
  9.订单管理（发起冻结资金判定）
  10.登录模块（登录记录）
     */
    public Byte getLogType() {
        return logType;
    }

    /**
     * 设置日志类型:
  1.系统配置 （修改参数）
  2.个人认证审核（审核通过/不通过）
  3.商户认证审核（审核通过/不通过）
  4.提现管理（打款确认）
  5.对账失败（备注和已处理）
  6.系统广播（发布推送和更新）
  7.角色管理（新增角色/权限修改）
  8.管理员管理（新增/修改管理员角色）
  9.订单管理（发起冻结资金判定）
  10.登录模块（登录记录）
     *
     * @param logType 日志类型:
  1.系统配置 （修改参数）
  2.个人认证审核（审核通过/不通过）
  3.商户认证审核（审核通过/不通过）
  4.提现管理（打款确认）
  5.对账失败（备注和已处理）
  6.系统广播（发布推送和更新）
  7.角色管理（新增角色/权限修改）
  8.管理员管理（新增/修改管理员角色）
  9.订单管理（发起冻结资金判定）
  10.登录模块（登录记录）
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
}