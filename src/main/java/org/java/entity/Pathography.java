package org.java.entity;

import java.util.Date;

public class Pathography {
    private String pathographyId;

    private String pathographyRegistration;

    private Date pathographyTime;

    private String pathographyStr;

    public String getPathographyId() {
        return pathographyId;
    }

    public void setPathographyId(String pathographyId) {
        this.pathographyId = pathographyId == null ? null : pathographyId.trim();
    }

    public String getPathographyRegistration() {
        return pathographyRegistration;
    }

    public void setPathographyRegistration(String pathographyRegistration) {
        this.pathographyRegistration = pathographyRegistration == null ? null : pathographyRegistration.trim();
    }

    public Date getPathographyTime() {
        return pathographyTime;
    }

    public void setPathographyTime(Date pathographyTime) {
        this.pathographyTime = pathographyTime;
    }

    public String getPathographyStr() {
        return pathographyStr;
    }

    public void setPathographyStr(String pathographyStr) {
        this.pathographyStr = pathographyStr == null ? null : pathographyStr.trim();
    }
}