package org.java.entity;

import java.util.Date;

public class PurchaseOrder {
    private String purchaseOrderId;

    private String purchaseOrderOdd;

    private Integer purchaseOrderMedicine;

    private String purchaseOrderStaff;

    private Integer purchaseOrderState;

    private Integer purchaseOrderNumber;

    private Integer purchaseOrderPrice;

    private Date purchaseOrderTime;

    private String purchaseOrderStr;

    private Date purchaseOrderPaytime;

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId == null ? null : purchaseOrderId.trim();
    }

    public String getPurchaseOrderOdd() {
        return purchaseOrderOdd;
    }

    public void setPurchaseOrderOdd(String purchaseOrderOdd) {
        this.purchaseOrderOdd = purchaseOrderOdd == null ? null : purchaseOrderOdd.trim();
    }

    public Integer getPurchaseOrderMedicine() {
        return purchaseOrderMedicine;
    }

    public void setPurchaseOrderMedicine(Integer purchaseOrderMedicine) {
        this.purchaseOrderMedicine = purchaseOrderMedicine;
    }

    public String getPurchaseOrderStaff() {
        return purchaseOrderStaff;
    }

    public void setPurchaseOrderStaff(String purchaseOrderStaff) {
        this.purchaseOrderStaff = purchaseOrderStaff == null ? null : purchaseOrderStaff.trim();
    }

    public Integer getPurchaseOrderState() {
        return purchaseOrderState;
    }

    public void setPurchaseOrderState(Integer purchaseOrderState) {
        this.purchaseOrderState = purchaseOrderState;
    }

    public Integer getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(Integer purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Integer getPurchaseOrderPrice() {
        return purchaseOrderPrice;
    }

    public void setPurchaseOrderPrice(Integer purchaseOrderPrice) {
        this.purchaseOrderPrice = purchaseOrderPrice;
    }

    public Date getPurchaseOrderTime() {
        return purchaseOrderTime;
    }

    public void setPurchaseOrderTime(Date purchaseOrderTime) {
        this.purchaseOrderTime = purchaseOrderTime;
    }

    public String getPurchaseOrderStr() {
        return purchaseOrderStr;
    }

    public void setPurchaseOrderStr(String purchaseOrderStr) {
        this.purchaseOrderStr = purchaseOrderStr == null ? null : purchaseOrderStr.trim();
    }

    public Date getPurchaseOrderPaytime() {
        return purchaseOrderPaytime;
    }

    public void setPurchaseOrderPaytime(Date purchaseOrderPaytime) {
        this.purchaseOrderPaytime = purchaseOrderPaytime;
    }
}