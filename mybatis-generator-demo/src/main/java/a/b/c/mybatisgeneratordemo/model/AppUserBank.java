package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user_bank")
public class AppUserBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户资金托管银行类型：1.招商银行，2.农商银行
     */
    @Column(name = "bank_type")
    private Integer bankType;

    /**
     * 用户资金托管银行子账号id，默认用app_user.login_id
     */
    @Column(name = "bank_id")
    private String bankId;

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
     * 获取用户资金托管银行类型：1.招商银行，2.农商银行
     *
     * @return bank_type - 用户资金托管银行类型：1.招商银行，2.农商银行
     */
    public Integer getBankType() {
        return bankType;
    }

    /**
     * 设置用户资金托管银行类型：1.招商银行，2.农商银行
     *
     * @param bankType 用户资金托管银行类型：1.招商银行，2.农商银行
     */
    public void setBankType(Integer bankType) {
        this.bankType = bankType;
    }

    /**
     * 获取用户资金托管银行子账号id，默认用app_user.login_id
     *
     * @return bank_id - 用户资金托管银行子账号id，默认用app_user.login_id
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置用户资金托管银行子账号id，默认用app_user.login_id
     *
     * @param bankId 用户资金托管银行子账号id，默认用app_user.login_id
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
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