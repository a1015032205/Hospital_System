package org.java.entity;

import java.util.Date;

public class Registration {
    private String registrationId;

    private Integer registrationNumber;

    private String registrationPatient;

    private Integer registrationDisease;

    private String registrationStaff;

    private Date registrationDiseaseTime;

    private Date registrationStartHospitalTime;

    private Integer registrationBed;

    private Integer registrationProduct;

    private Date registrationEndHospitalTime;

    private String registrationStr;

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId == null ? null : registrationId.trim();
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationPatient() {
        return registrationPatient;
    }

    public void setRegistrationPatient(String registrationPatient) {
        this.registrationPatient = registrationPatient == null ? null : registrationPatient.trim();
    }

    public Integer getRegistrationDisease() {
        return registrationDisease;
    }

    public void setRegistrationDisease(Integer registrationDisease) {
        this.registrationDisease = registrationDisease;
    }

    public String getRegistrationStaff() {
        return registrationStaff;
    }

    public void setRegistrationStaff(String registrationStaff) {
        this.registrationStaff = registrationStaff == null ? null : registrationStaff.trim();
    }

    public Date getRegistrationDiseaseTime() {
        return registrationDiseaseTime;
    }

    public void setRegistrationDiseaseTime(Date registrationDiseaseTime) {
        this.registrationDiseaseTime = registrationDiseaseTime;
    }

    public Date getRegistrationStartHospitalTime() {
        return registrationStartHospitalTime;
    }

    public void setRegistrationStartHospitalTime(Date registrationStartHospitalTime) {
        this.registrationStartHospitalTime = registrationStartHospitalTime;
    }

    public Integer getRegistrationBed() {
        return registrationBed;
    }

    public void setRegistrationBed(Integer registrationBed) {
        this.registrationBed = registrationBed;
    }

    public Integer getRegistrationProduct() {
        return registrationProduct;
    }

    public void setRegistrationProduct(Integer registrationProduct) {
        this.registrationProduct = registrationProduct;
    }

    public Date getRegistrationEndHospitalTime() {
        return registrationEndHospitalTime;
    }

    public void setRegistrationEndHospitalTime(Date registrationEndHospitalTime) {
        this.registrationEndHospitalTime = registrationEndHospitalTime;
    }

    public String getRegistrationStr() {
        return registrationStr;
    }

    public void setRegistrationStr(String registrationStr) {
        this.registrationStr = registrationStr == null ? null : registrationStr.trim();
    }
}