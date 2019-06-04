package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_system_config")
public class AppSystemConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 系统配置名
     */
    @Column(name = "config_key")
    private String configKey;

    /**
     * 系统配置值
     */
    @Column(name = "config_value")
    private String configValue;

    /**
     * 注释
     */
    @Column(name = "config_description")
    private String configDescription;

    /**
     * 是否删除,0=否,1=是
     */
    @Column(name = "is_del")
    private Byte isDel;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * 最后修改时间
     */
    @Column(name = "last_modify_date")
    private Date lastModifyDate;

    /**
     * 系统配置值
     */
    @Column(name = "config_value_two")
    private String configValueTwo;

    /**
     * 系统配置值的个数
     */
    private Integer type;

    /**
     * 生效时间必须大于创建时间
     */
    @Column(name = "enabled_date")
    private Date enabledDate;

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
     * 获取系统配置名
     *
     * @return config_key - 系统配置名
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * 设置系统配置名
     *
     * @param configKey 系统配置名
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    /**
     * 获取系统配置值
     *
     * @return config_value - 系统配置值
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 设置系统配置值
     *
     * @param configValue 系统配置值
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * 获取注释
     *
     * @return config_description - 注释
     */
    public String getConfigDescription() {
        return configDescription;
    }

    /**
     * 设置注释
     *
     * @param configDescription 注释
     */
    public void setConfigDescription(String configDescription) {
        this.configDescription = configDescription;
    }

    /**
     * 获取是否删除,0=否,1=是
     *
     * @return is_del - 是否删除,0=否,1=是
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除,0=否,1=是
     *
     * @param isDel 是否删除,0=否,1=是
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取最后修改时间
     *
     * @return last_modify_date - 最后修改时间
     */
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastModifyDate 最后修改时间
     */
    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    /**
     * 获取系统配置值
     *
     * @return config_value_two - 系统配置值
     */
    public String getConfigValueTwo() {
        return configValueTwo;
    }

    /**
     * 设置系统配置值
     *
     * @param configValueTwo 系统配置值
     */
    public void setConfigValueTwo(String configValueTwo) {
        this.configValueTwo = configValueTwo;
    }

    /**
     * 获取系统配置值的个数
     *
     * @return type - 系统配置值的个数
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置系统配置值的个数
     *
     * @param type 系统配置值的个数
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取生效时间必须大于创建时间
     *
     * @return enabled_date - 生效时间必须大于创建时间
     */
    public Date getEnabledDate() {
        return enabledDate;
    }

    /**
     * 设置生效时间必须大于创建时间
     *
     * @param enabledDate 生效时间必须大于创建时间
     */
    public void setEnabledDate(Date enabledDate) {
        this.enabledDate = enabledDate;
    }
}