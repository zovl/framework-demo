package a.b.c.model;

import javax.persistence.*;

@Table(name = "roles_mapping")
public class RolesMapping {
    @Column(name = "Host")
    private String host;

    @Column(name = "User")
    private String user;

    @Column(name = "Role")
    private String role;

    @Column(name = "Admin_option")
    private String adminOption;

    /**
     * @return Host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return User
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return Role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return Admin_option
     */
    public String getAdminOption() {
        return adminOption;
    }

    /**
     * @param adminOption
     */
    public void setAdminOption(String adminOption) {
        this.adminOption = adminOption;
    }
}