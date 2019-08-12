package org.java.entity;

import java.util.Date;

public class PatientOrder {
    private String patientOrderId;

    private String patientOrderOdd;

    private Integer patientOrderMedicine;

    private String patientOrderStaff;

    private Integer patientOrderState;

    private Integer patientOrderNumber;

    private Integer patientOrderPrice;

    private Date patientOrderTime;

    private String patientOrderStr;

    private Date patientOrderPaytime;

    public String getPatientOrderId() {
        return patientOrderId;
    }

    public void setPatientOrderId(String patientOrderId) {
        this.patientOrderId = patientOrderId == null ? null : patientOrderId.trim();
    }

    public String getPatientOrderOdd() {
        return patientOrderOdd;
    }

    public void setPatientOrderOdd(String patientOrderOdd) {
        this.patientOrderOdd = patientOrderOdd == null ? null : patientOrderOdd.trim();
    }

    public Integer getPatientOrderMedicine() {
        return patientOrderMedicine;
    }

    public void setPatientOrderMedicine(Integer patientOrderMedicine) {
        this.patientOrderMedicine = patientOrderMedicine;
    }

    public String getPatientOrderStaff() {
        return patientOrderStaff;
    }

    public void setPatientOrderStaff(String patientOrderStaff) {
        this.patientOrderStaff = patientOrderStaff == null ? null : patientOrderStaff.trim();
    }

    public Integer getPatientOrderState() {
        return patientOrderState;
    }

    public void setPatientOrderState(Integer patientOrderState) {
        this.patientOrderState = patientOrderState;
    }

    public Integer getPatientOrderNumber() {
        return patientOrderNumber;
    }

    public void setPatientOrderNumber(Integer patientOrderNumber) {
        this.patientOrderNumber = patientOrderNumber;
    }

    public Integer getPatientOrderPrice() {
        return patientOrderPrice;
    }

    public void setPatientOrderPrice(Integer patientOrderPrice) {
        this.patientOrderPrice = patientOrderPrice;
    }

    public Date getPatientOrderTime() {
        return patientOrderTime;
    }

    public void setPatientOrderTime(Date patientOrderTime) {
        this.patientOrderTime = patientOrderTime;
    }

    public String getPatientOrderStr() {
        return patientOrderStr;
    }

    public void setPatientOrderStr(String patientOrderStr) {
        this.patientOrderStr = patientOrderStr == null ? null : patientOrderStr.trim();
    }

    public Date getPatientOrderPaytime() {
        return patientOrderPaytime;
    }

    public void setPatientOrderPaytime(Date patientOrderPaytime) {
        this.patientOrderPaytime = patientOrderPaytime;
    }
}