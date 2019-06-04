package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 账户名是登录用的
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 善信通号类似微信号
     */
    @Column(name = "sxt_id")
    private String sxtId;

    /**
     * 内部使用
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 密码,内部使用
     */
    private String password;

    /**
     * 邮箱(冗余)
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 身份证号码
     */
    @Column(name = "identity_number")
    private String identityNumber;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证正面
     */
    @Column(name = "identity_front_path")
    private String identityFrontPath;

    /**
     * 身份证反面路径
     */
    @Column(name = "identity_back_path")
    private String identityBackPath;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 签名
     */
    private String signature;

    /**
     * 二维码路径
     */
    @Column(name = "qrcode_path")
    private String qrcodePath;

    /**
     * 头像路径（冗余）
     */
    @Column(name = "avatar_path")
    private String avatarPath;

    /**
     * 好友数（冗余）
     */
    @Column(name = "friend_count")
    private Long friendCount;

    /**
     * 级别(1为普通用户,2为认证用户,3为商户)
     */
    @Column(name = "level_id")
    private Integer levelId;

    /**
     * 地区
     */
    private String area;

    /**
     * 职务
     */
    private String duties;

    /**
     * 行业
     */
    private String industry;

    /**
     * 性别(1为男0为女)
     */
    private Boolean gender;

    /**
     * 年龄(冗余)
     */
    private Integer age;

    /**
     * 认证商户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     */
    @Column(name = "auth_business_status")
    private Integer authBusinessStatus;

    /**
     * 认证用户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     */
    @Column(name = "auth_user_status")
    private Integer authUserStatus;

    /**
     * 邀请码(冗余)
     */
    @Column(name = "invite_code")
    private String inviteCode;

    /**
     * 最后一次登录ip
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 最后一次登录时间
     */
    @Column(name = "last_login_date")
    private Date lastLoginDate;

    /**
     * 是否绑定手机号
     */
    @Column(name = "is_bind_phone")
    private Boolean isBindPhone;

    /**
     * 是否已禁用
     */
    @Column(name = "is_disabled")
    private Boolean isDisabled;

    /**
     * 禁用开始时间
     */
    @Column(name = "disabled_start_time")
    private Date disabledStartTime;

    /**
     * 禁用结束时间
     */
    @Column(name = "disabled_end_time")
    private Date disabledEndTime;

    /**
     * 禁用管理员账号
     */
    @Column(name = "disabled_back_user")
    private String disabledBackUser;

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
     * 设备token
     */
    @Column(name = "device_token")
    private String deviceToken;

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
     * 获取账户名是登录用的
     *
     * @return account_name - 账户名是登录用的
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账户名是登录用的
     *
     * @param accountName 账户名是登录用的
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取善信通号类似微信号
     *
     * @return sxt_id - 善信通号类似微信号
     */
    public String getSxtId() {
        return sxtId;
    }

    /**
     * 设置善信通号类似微信号
     *
     * @param sxtId 善信通号类似微信号
     */
    public void setSxtId(String sxtId) {
        this.sxtId = sxtId;
    }

    /**
     * 获取内部使用
     *
     * @return login_id - 内部使用
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置内部使用
     *
     * @param loginId 内部使用
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取密码,内部使用
     *
     * @return password - 密码,内部使用
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码,内部使用
     *
     * @param password 密码,内部使用
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱(冗余)
     *
     * @return email - 邮箱(冗余)
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱(冗余)
     *
     * @param email 邮箱(冗余)
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取身份证号码
     *
     * @return identity_number - 身份证号码
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * 设置身份证号码
     *
     * @param identityNumber 身份证号码
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证正面
     *
     * @return identity_front_path - 身份证正面
     */
    public String getIdentityFrontPath() {
        return identityFrontPath;
    }

    /**
     * 设置身份证正面
     *
     * @param identityFrontPath 身份证正面
     */
    public void setIdentityFrontPath(String identityFrontPath) {
        this.identityFrontPath = identityFrontPath;
    }

    /**
     * 获取身份证反面路径
     *
     * @return identity_back_path - 身份证反面路径
     */
    public String getIdentityBackPath() {
        return identityBackPath;
    }

    /**
     * 设置身份证反面路径
     *
     * @param identityBackPath 身份证反面路径
     */
    public void setIdentityBackPath(String identityBackPath) {
        this.identityBackPath = identityBackPath;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取签名
     *
     * @return signature - 签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置签名
     *
     * @param signature 签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取二维码路径
     *
     * @return qrcode_path - 二维码路径
     */
    public String getQrcodePath() {
        return qrcodePath;
    }

    /**
     * 设置二维码路径
     *
     * @param qrcodePath 二维码路径
     */
    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath;
    }

    /**
     * 获取头像路径（冗余）
     *
     * @return avatar_path - 头像路径（冗余）
     */
    public String getAvatarPath() {
        return avatarPath;
    }

    /**
     * 设置头像路径（冗余）
     *
     * @param avatarPath 头像路径（冗余）
     */
    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    /**
     * 获取好友数（冗余）
     *
     * @return friend_count - 好友数（冗余）
     */
    public Long getFriendCount() {
        return friendCount;
    }

    /**
     * 设置好友数（冗余）
     *
     * @param friendCount 好友数（冗余）
     */
    public void setFriendCount(Long friendCount) {
        this.friendCount = friendCount;
    }

    /**
     * 获取级别(1为普通用户,2为认证用户,3为商户)
     *
     * @return level_id - 级别(1为普通用户,2为认证用户,3为商户)
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * 设置级别(1为普通用户,2为认证用户,3为商户)
     *
     * @param levelId 级别(1为普通用户,2为认证用户,3为商户)
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * 获取地区
     *
     * @return area - 地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置地区
     *
     * @param area 地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取职务
     *
     * @return duties - 职务
     */
    public String getDuties() {
        return duties;
    }

    /**
     * 设置职务
     *
     * @param duties 职务
     */
    public void setDuties(String duties) {
        this.duties = duties;
    }

    /**
     * 获取行业
     *
     * @return industry - 行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 设置行业
     *
     * @param industry 行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 获取性别(1为男0为女)
     *
     * @return gender - 性别(1为男0为女)
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置性别(1为男0为女)
     *
     * @param gender 性别(1为男0为女)
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄(冗余)
     *
     * @return age - 年龄(冗余)
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄(冗余)
     *
     * @param age 年龄(冗余)
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取认证商户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     *
     * @return auth_business_status - 认证商户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     */
    public Integer getAuthBusinessStatus() {
        return authBusinessStatus;
    }

    /**
     * 设置认证商户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     *
     * @param authBusinessStatus 认证商户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     */
    public void setAuthBusinessStatus(Integer authBusinessStatus) {
        this.authBusinessStatus = authBusinessStatus;
    }

    /**
     * 获取认证用户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     *
     * @return auth_user_status - 认证用户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     */
    public Integer getAuthUserStatus() {
        return authUserStatus;
    }

    /**
     * 设置认证用户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     *
     * @param authUserStatus 认证用户状态: 0为未认证,1为认证资料审核中,2为审核失败,3为审核通过
     */
    public void setAuthUserStatus(Integer authUserStatus) {
        this.authUserStatus = authUserStatus;
    }

    /**
     * 获取邀请码(冗余)
     *
     * @return invite_code - 邀请码(冗余)
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码(冗余)
     *
     * @param inviteCode 邀请码(冗余)
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 获取最后一次登录ip
     *
     * @return last_login_ip - 最后一次登录ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后一次登录ip
     *
     * @param lastLoginIp 最后一次登录ip
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取最后一次登录时间
     *
     * @return last_login_date - 最后一次登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastLoginDate 最后一次登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取是否绑定手机号
     *
     * @return is_bind_phone - 是否绑定手机号
     */
    public Boolean getIsBindPhone() {
        return isBindPhone;
    }

    /**
     * 设置是否绑定手机号
     *
     * @param isBindPhone 是否绑定手机号
     */
    public void setIsBindPhone(Boolean isBindPhone) {
        this.isBindPhone = isBindPhone;
    }

    /**
     * 获取是否已禁用
     *
     * @return is_disabled - 是否已禁用
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    /**
     * 设置是否已禁用
     *
     * @param isDisabled 是否已禁用
     */
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * 获取禁用开始时间
     *
     * @return disabled_start_time - 禁用开始时间
     */
    public Date getDisabledStartTime() {
        return disabledStartTime;
    }

    /**
     * 设置禁用开始时间
     *
     * @param disabledStartTime 禁用开始时间
     */
    public void setDisabledStartTime(Date disabledStartTime) {
        this.disabledStartTime = disabledStartTime;
    }

    /**
     * 获取禁用结束时间
     *
     * @return disabled_end_time - 禁用结束时间
     */
    public Date getDisabledEndTime() {
        return disabledEndTime;
    }

    /**
     * 设置禁用结束时间
     *
     * @param disabledEndTime 禁用结束时间
     */
    public void setDisabledEndTime(Date disabledEndTime) {
        this.disabledEndTime = disabledEndTime;
    }

    /**
     * 获取禁用管理员账号
     *
     * @return disabled_back_user - 禁用管理员账号
     */
    public String getDisabledBackUser() {
        return disabledBackUser;
    }

    /**
     * 设置禁用管理员账号
     *
     * @param disabledBackUser 禁用管理员账号
     */
    public void setDisabledBackUser(String disabledBackUser) {
        this.disabledBackUser = disabledBackUser;
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
     * 获取设备token
     *
     * @return device_token - 设备token
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * 设置设备token
     *
     * @param deviceToken 设备token
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}