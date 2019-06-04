package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_sys_advance")
public class AppSysAdvance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 垫付金金额
     */
    @Column(name = "advance_money")
    private Long advanceMoney;

    /**
     * 经办人
     */
    private String operator;

    /**
     * 备注
     */
    private String remark;

    /**
     * 生成时间
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
     * 获取垫付金金额
     *
     * @return advance_money - 垫付金金额
     */
    public Long getAdvanceMoney() {
        return advanceMoney;
    }

    /**
     * 设置垫付金金额
     *
     * @param advanceMoney 垫付金金额
     */
    public void setAdvanceMoney(Long advanceMoney) {
        this.advanceMoney = advanceMoney;
    }

    /**
     * 获取经办人
     *
     * @return operator - 经办人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置经办人
     *
     * @param operator 经办人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取生成时间
     *
     * @return create_date - 生成时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置生成时间
     *
     * @param createDate 生成时间
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