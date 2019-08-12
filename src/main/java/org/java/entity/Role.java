package org.java.entity;

public class Role {
    private String roleId;

    private String roleName;

    private Integer roleAvailable;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleAvailable() {
        return roleAvailable;
    }

    public void setRoleAvailable(Integer roleAvailable) {
        this.roleAvailable = roleAvailable;
    }
}