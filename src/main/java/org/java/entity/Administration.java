package org.java.entity;

public class Administration {
    private Integer administrationId;

    private String administrationName;

    private Integer administrationDepartment;

    private String administrationAdd;

    public Integer getAdministrationId() {
        return administrationId;
    }

    public void setAdministrationId(Integer administrationId) {
        this.administrationId = administrationId;
    }

    public String getAdministrationName() {
        return administrationName;
    }

    public void setAdministrationName(String administrationName) {
        this.administrationName = administrationName == null ? null : administrationName.trim();
    }

    public Integer getAdministrationDepartment() {
        return administrationDepartment;
    }

    public void setAdministrationDepartment(Integer administrationDepartment) {
        this.administrationDepartment = administrationDepartment;
    }

    public String getAdministrationAdd() {
        return administrationAdd;
    }

    public void setAdministrationAdd(String administrationAdd) {
        this.administrationAdd = administrationAdd == null ? null : administrationAdd.trim();
    }
}