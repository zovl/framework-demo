package a.b.c.mybatisgeneratordemo.model;

import javax.persistence.*;

@Table(name = "back_role")
public class BackRole {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色名称
     */
    @Column(name = "TEXT")
    private String text;

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
     * 获取角色名称
     *
     * @return TEXT - 角色名称
     */
    public String getText() {
        return text;
    }

    /**
     * 设置角色名称
     *
     * @param text 角色名称
     */
    public void setText(String text) {
        this.text = text;
    }
}