package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "back_user")
public class BackUser {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "CREATEDATETIME")
    private Date createdatetime;

    @Column(name = "MODIFYDATETIME")
    private Date modifydatetime;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PWD")
    private String pwd;

    @Column(name = "PHONE")
    private String phone;

    /**
     * 是否删除
     */
    @Column(name = "ISDEL")
    private Boolean isdel;

    /**
     * 用户状态:1=启用,0=停用,2=异常
     */
    @Column(name = "USERSTATUS")
    private String userstatus;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return CREATEDATETIME
     */
    public Date getCreatedatetime() {
        return createdatetime;
    }

    /**
     * @param createdatetime
     */
    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    /**
     * @return MODIFYDATETIME
     */
    public Date getModifydatetime() {
        return modifydatetime;
    }

    /**
     * @param modifydatetime
     */
    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return PWD
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取是否删除
     *
     * @return ISDEL - 是否删除
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 设置是否删除
     *
     * @param isdel 是否删除
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    /**
     * 获取用户状态:1=启用,0=停用,2=异常
     *
     * @return USERSTATUS - 用户状态:1=启用,0=停用,2=异常
     */
    public String getUserstatus() {
        return userstatus;
    }

    /**
     * 设置用户状态:1=启用,0=停用,2=异常
     *
     * @param userstatus 用户状态:1=启用,0=停用,2=异常
     */
    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }
}