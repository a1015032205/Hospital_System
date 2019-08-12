package org.java.entity;

public class Bed {
    private Integer bedId;

    private Integer bedWard;

    private Integer wardState;

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Integer getBedWard() {
        return bedWard;
    }

    public void setBedWard(Integer bedWard) {
        this.bedWard = bedWard;
    }

    public Integer getWardState() {
        return wardState;
    }

    public void setWardState(Integer wardState) {
        this.wardState = wardState;
    }
}