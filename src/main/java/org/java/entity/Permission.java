package org.java.entity;

public class Permission {
    private String permissionId;

    private String permissionName;

    private String permissionType;

    private String permissionUrl;

    private String permissionPercode;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType == null ? null : permissionType.trim();
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl == null ? null : permissionUrl.trim();
    }

    public String getPermissionPercode() {
        return permissionPercode;
    }

    public void setPermissionPercode(String permissionPercode) {
        this.permissionPercode = permissionPercode == null ? null : permissionPercode.trim();
    }
}