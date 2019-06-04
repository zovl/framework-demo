package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_bank_info")
public class AppBankInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 银行卡名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 银行卡编号
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 卡号长度
     */
    @Column(name = "card_length")
    private Integer cardLength;

    /**
     * 卡类型:1=借记卡,2=贷记卡
     */
    @Column(name = "card_type")
    private Integer cardType;

    /**
     * 银行卡bin码
     */
    @Column(name = "bin_code")
    private String binCode;

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
     * 获取银行卡名称
     *
     * @return bank_name - 银行卡名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行卡名称
     *
     * @param bankName 银行卡名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行卡编号
     *
     * @return bank_code - 银行卡编号
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行卡编号
     *
     * @param bankCode 银行卡编号
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取卡号长度
     *
     * @return card_length - 卡号长度
     */
    public Integer getCardLength() {
        return cardLength;
    }

    /**
     * 设置卡号长度
     *
     * @param cardLength 卡号长度
     */
    public void setCardLength(Integer cardLength) {
        this.cardLength = cardLength;
    }

    /**
     * 获取卡类型:1=借记卡,2=贷记卡
     *
     * @return card_type - 卡类型:1=借记卡,2=贷记卡
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * 设置卡类型:1=借记卡,2=贷记卡
     *
     * @param cardType 卡类型:1=借记卡,2=贷记卡
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取银行卡bin码
     *
     * @return bin_code - 银行卡bin码
     */
    public String getBinCode() {
        return binCode;
    }

    /**
     * 设置银行卡bin码
     *
     * @param binCode 银行卡bin码
     */
    public void setBinCode(String binCode) {
        this.binCode = binCode;
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
}