package a.b.c.mybatisgeneratordemo.model;

import javax.persistence.*;

@Table(name = "back_role_resource")
public class BackRoleResource {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 资源id
     */
    @Column(name = "RESOURCE_ID")
    private String resourceId;

    /**
     * 角色id
     */
    @Column(name = "ROLE_ID")
    private String roleId;

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
     * 获取资源id
     *
     * @return RESOURCE_ID - 资源id
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源id
     *
     * @param resourceId 资源id
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 获取角色id
     *
     * @return ROLE_ID - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}