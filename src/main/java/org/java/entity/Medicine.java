package org.java.entity;

import java.util.Date;

public class Medicine {
    private Integer medicineId;

    private String medicineName;

    private Integer medicinePharmacy;

    private String medicineFunction;

    private String medicineWarning;

    private Integer medicinePrice;

    private Integer medicineNumber;

    private Integer medicineWarningNumber;

    private String medicineImg;

    private Date medicineStartTime;

    private Date medicineBirTime;

    private String medicineLife;

    private Date medicineEndTime;

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public Integer getMedicinePharmacy() {
        return medicinePharmacy;
    }

    public void setMedicinePharmacy(Integer medicinePharmacy) {
        this.medicinePharmacy = medicinePharmacy;
    }

    public String getMedicineFunction() {
        return medicineFunction;
    }

    public void setMedicineFunction(String medicineFunction) {
        this.medicineFunction = medicineFunction == null ? null : medicineFunction.trim();
    }

    public String getMedicineWarning() {
        return medicineWarning;
    }

    public void setMedicineWarning(String medicineWarning) {
        this.medicineWarning = medicineWarning == null ? null : medicineWarning.trim();
    }

    public Integer getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Integer medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public Integer getMedicineNumber() {
        return medicineNumber;
    }

    public void setMedicineNumber(Integer medicineNumber) {
        this.medicineNumber = medicineNumber;
    }

    public Integer getMedicineWarningNumber() {
        return medicineWarningNumber;
    }

    public void setMedicineWarningNumber(Integer medicineWarningNumber) {
        this.medicineWarningNumber = medicineWarningNumber;
    }

    public String getMedicineImg() {
        return medicineImg;
    }

    public void setMedicineImg(String medicineImg) {
        this.medicineImg = medicineImg == null ? null : medicineImg.trim();
    }

    public Date getMedicineStartTime() {
        return medicineStartTime;
    }

    public void setMedicineStartTime(Date medicineStartTime) {
        this.medicineStartTime = medicineStartTime;
    }

    public Date getMedicineBirTime() {
        return medicineBirTime;
    }

    public void setMedicineBirTime(Date medicineBirTime) {
        this.medicineBirTime = medicineBirTime;
    }

    public String getMedicineLife() {
        return medicineLife;
    }

    public void setMedicineLife(String medicineLife) {
        this.medicineLife = medicineLife == null ? null : medicineLife.trim();
    }

    public Date getMedicineEndTime() {
        return medicineEndTime;
    }

    public void setMedicineEndTime(Date medicineEndTime) {
        this.medicineEndTime = medicineEndTime;
    }
}