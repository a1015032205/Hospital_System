package org.java.entity;

import java.util.Date;

public class Hospital {
    private String hospitalId;

    private String hospitalName;

    private String hospitalClass;

    private Integer hospitalArea;

    private String hospitalAdd;

    private String hospitalE;

    private String hospitalN;

    private String hospitalTel;

    private String hospitalEmail;

    private String hospitalLogo;

    private Date hospitalTime;

    private String hospitalPath;

    private String hospitalIntroduce;

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalClass() {
        return hospitalClass;
    }

    public void setHospitalClass(String hospitalClass) {
        this.hospitalClass = hospitalClass == null ? null : hospitalClass.trim();
    }

    public Integer getHospitalArea() {
        return hospitalArea;
    }

    public void setHospitalArea(Integer hospitalArea) {
        this.hospitalArea = hospitalArea;
    }

    public String getHospitalAdd() {
        return hospitalAdd;
    }

    public void setHospitalAdd(String hospitalAdd) {
        this.hospitalAdd = hospitalAdd == null ? null : hospitalAdd.trim();
    }

    public String getHospitalE() {
        return hospitalE;
    }

    public void setHospitalE(String hospitalE) {
        this.hospitalE = hospitalE == null ? null : hospitalE.trim();
    }

    public String getHospitalN() {
        return hospitalN;
    }

    public void setHospitalN(String hospitalN) {
        this.hospitalN = hospitalN == null ? null : hospitalN.trim();
    }

    public String getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel == null ? null : hospitalTel.trim();
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail == null ? null : hospitalEmail.trim();
    }

    public String getHospitalLogo() {
        return hospitalLogo;
    }

    public void setHospitalLogo(String hospitalLogo) {
        this.hospitalLogo = hospitalLogo == null ? null : hospitalLogo.trim();
    }

    public Date getHospitalTime() {
        return hospitalTime;
    }

    public void setHospitalTime(Date hospitalTime) {
        this.hospitalTime = hospitalTime;
    }

    public String getHospitalPath() {
        return hospitalPath;
    }

    public void setHospitalPath(String hospitalPath) {
        this.hospitalPath = hospitalPath == null ? null : hospitalPath.trim();
    }

    public String getHospitalIntroduce() {
        return hospitalIntroduce;
    }

    public void setHospitalIntroduce(String hospitalIntroduce) {
        this.hospitalIntroduce = hospitalIntroduce == null ? null : hospitalIntroduce.trim();
    }
}