package org.java.entity;

public class Disease {
    private Integer diseaseId;

    private Integer diseaseAdministration;

    private String diseaseName;

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public Integer getDiseaseAdministration() {
        return diseaseAdministration;
    }

    public void setDiseaseAdministration(Integer diseaseAdministration) {
        this.diseaseAdministration = diseaseAdministration;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }
}