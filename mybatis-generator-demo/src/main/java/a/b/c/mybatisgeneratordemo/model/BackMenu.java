package a.b.c.mybatisgeneratordemo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "back_menu")
public class BackMenu {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 图标
     */
    @Column(name = "ICONCLS")
    private String iconcls;

    /**
     * 排序用
     */
    @Column(name = "SEQ")
    private BigDecimal seq;

    /**
     * 菜单名
     */
    @Column(name = "TEXT")
    private String text;

    @Column(name = "URL")
    private String url;

    /**
     * 父id
     */
    @Column(name = "PID")
    private String pid;

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
     * 获取图标
     *
     * @return ICONCLS - 图标
     */
    public String getIconcls() {
        return iconcls;
    }

    /**
     * 设置图标
     *
     * @param iconcls 图标
     */
    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    /**
     * 获取排序用
     *
     * @return SEQ - 排序用
     */
    public BigDecimal getSeq() {
        return seq;
    }

    /**
     * 设置排序用
     *
     * @param seq 排序用
     */
    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }

    /**
     * 获取菜单名
     *
     * @return TEXT - 菜单名
     */
    public String getText() {
        return text;
    }

    /**
     * 设置菜单名
     *
     * @param text 菜单名
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
     * 获取父id
     *
     * @return PID - 父id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置父id
     *
     * @param pid 父id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
}