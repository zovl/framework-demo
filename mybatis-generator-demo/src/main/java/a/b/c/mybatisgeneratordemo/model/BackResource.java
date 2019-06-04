package a.b.c.mybatisgeneratordemo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "back_resource")
public class BackResource {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "SEQ")
    private BigDecimal seq;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "URL")
    private String url;

    @Column(name = "PID")
    private String pid;

    /**
     * 是否菜单
     */
    @Column(name = "IS_MENU")
    private Boolean isMenu;

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
     * @return SEQ
     */
    public BigDecimal getSeq() {
        return seq;
    }

    /**
     * @param seq
     */
    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }

    /**
     * @return TEXT
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return PID
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取是否菜单
     *
     * @return IS_MENU - 是否菜单
     */
    public Boolean getIsMenu() {
        return isMenu;
    }

    /**
     * 设置是否菜单
     *
     * @param isMenu 是否菜单
     */
    public void setIsMenu(Boolean isMenu) {
        this.isMenu = isMenu;
    }
}