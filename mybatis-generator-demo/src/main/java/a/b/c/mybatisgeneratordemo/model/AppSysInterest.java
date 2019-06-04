package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_sys_interest")
public class AppSysInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 利息流水号
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * 计息本金
     */
    private Long principal;

    /**
     * 利息总额
     */
    @Column(name = "total_interest")
    private Long totalInterest;

    /**
     * 利息
     */
    private Long interest;

    /**
     * 利率
     */
    @Column(name = "interest_rate")
    private Long interestRate;

    /**
     * 生成时间(定时任务
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 是否删除(1为是0为否)
     */
    @Column(name = "is_del")
    private Byte isDel;

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
     * 获取利息流水号
     *
     * @return serial_number - 利息流水号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置利息流水号
     *
     * @param serialNumber 利息流水号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获取计息本金
     *
     * @return principal - 计息本金
     */
    public Long getPrincipal() {
        return principal;
    }

    /**
     * 设置计息本金
     *
     * @param principal 计息本金
     */
    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    /**
     * 获取利息总额
     *
     * @return total_interest - 利息总额
     */
    public Long getTotalInterest() {
        return totalInterest;
    }

    /**
     * 设置利息总额
     *
     * @param totalInterest 利息总额
     */
    public void setTotalInterest(Long totalInterest) {
        this.totalInterest = totalInterest;
    }

    /**
     * 获取利息
     *
     * @return interest - 利息
     */
    public Long getInterest() {
        return interest;
    }

    /**
     * 设置利息
     *
     * @param interest 利息
     */
    public void setInterest(Long interest) {
        this.interest = interest;
    }

    /**
     * 获取利率
     *
     * @return interest_rate - 利率
     */
    public Long getInterestRate() {
        return interestRate;
    }

    /**
     * 设置利率
     *
     * @param interestRate 利率
     */
    public void setInterestRate(Long interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * 获取生成时间(定时任务
     *
     * @return create_date - 生成时间(定时任务
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置生成时间(定时任务
     *
     * @param createDate 生成时间(定时任务
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
}