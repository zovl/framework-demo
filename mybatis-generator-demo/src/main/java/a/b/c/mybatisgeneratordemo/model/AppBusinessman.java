package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_businessman")
public class AppBusinessman {
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
     * 善信通电子账户id
     */
    @Column(name = "elec_account_id")
    private String elecAccountId;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司地址
     */
    @Column(name = "company_addr")
    private String companyAddr;

    /**
     * 营业执照号
     */
    @Column(name = "business_lincese_code")
    private String businessLinceseCode;

    /**
     * 营业执照
     */
    @Column(name = "business_lincese_path")
    private String businessLincesePath;

    /**
     * 组织机构代码证
     */
    @Column(name = "agency_path")
    private String agencyPath;

    /**
     * 国税登记证
     */
    @Column(name = "taxation_path")
    private String taxationPath;

    /**
     * 三证合一路径
     */
    @Column(name = "three_license_path")
    private String threeLicensePath;

    /**
     * 五证合一路径
     */
    @Column(name = "five_license_path")
    private String fiveLicensePath;

    /**
     * 商户状态:1=审核中,2=审核失败,3=审核通过
     */
    private Integer status;

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
     * 获取善信通电子账户id
     *
     * @return elec_account_id - 善信通电子账户id
     */
    public String getElecAccountId() {
        return elecAccountId;
    }

    /**
     * 设置善信通电子账户id
     *
     * @param elecAccountId 善信通电子账户id
     */
    public void setElecAccountId(String elecAccountId) {
        this.elecAccountId = elecAccountId;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司地址
     *
     * @return company_addr - 公司地址
     */
    public String getCompanyAddr() {
        return companyAddr;
    }

    /**
     * 设置公司地址
     *
     * @param companyAddr 公司地址
     */
    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    /**
     * 获取营业执照号
     *
     * @return business_lincese_code - 营业执照号
     */
    public String getBusinessLinceseCode() {
        return businessLinceseCode;
    }

    /**
     * 设置营业执照号
     *
     * @param businessLinceseCode 营业执照号
     */
    public void setBusinessLinceseCode(String businessLinceseCode) {
        this.businessLinceseCode = businessLinceseCode;
    }

    /**
     * 获取营业执照
     *
     * @return business_lincese_path - 营业执照
     */
    public String getBusinessLincesePath() {
        return businessLincesePath;
    }

    /**
     * 设置营业执照
     *
     * @param businessLincesePath 营业执照
     */
    public void setBusinessLincesePath(String businessLincesePath) {
        this.businessLincesePath = businessLincesePath;
    }

    /**
     * 获取组织机构代码证
     *
     * @return agency_path - 组织机构代码证
     */
    public String getAgencyPath() {
        return agencyPath;
    }

    /**
     * 设置组织机构代码证
     *
     * @param agencyPath 组织机构代码证
     */
    public void setAgencyPath(String agencyPath) {
        this.agencyPath = agencyPath;
    }

    /**
     * 获取国税登记证
     *
     * @return taxation_path - 国税登记证
     */
    public String getTaxationPath() {
        return taxationPath;
    }

    /**
     * 设置国税登记证
     *
     * @param taxationPath 国税登记证
     */
    public void setTaxationPath(String taxationPath) {
        this.taxationPath = taxationPath;
    }

    /**
     * 获取三证合一路径
     *
     * @return three_license_path - 三证合一路径
     */
    public String getThreeLicensePath() {
        return threeLicensePath;
    }

    /**
     * 设置三证合一路径
     *
     * @param threeLicensePath 三证合一路径
     */
    public void setThreeLicensePath(String threeLicensePath) {
        this.threeLicensePath = threeLicensePath;
    }

    /**
     * 获取五证合一路径
     *
     * @return five_license_path - 五证合一路径
     */
    public String getFiveLicensePath() {
        return fiveLicensePath;
    }

    /**
     * 设置五证合一路径
     *
     * @param fiveLicensePath 五证合一路径
     */
    public void setFiveLicensePath(String fiveLicensePath) {
        this.fiveLicensePath = fiveLicensePath;
    }

    /**
     * 获取商户状态:1=审核中,2=审核失败,3=审核通过
     *
     * @return status - 商户状态:1=审核中,2=审核失败,3=审核通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置商户状态:1=审核中,2=审核失败,3=审核通过
     *
     * @param status 商户状态:1=审核中,2=审核失败,3=审核通过
     */
    public void setStatus(Integer status) {
        this.status = status;
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