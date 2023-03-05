package model;

import enums.MedicalCareStatus;

import java.util.Date;

public class Patient extends Person {
    private String healthInsurance;
    private MedicalCareStatus medicalCareStatus;

    private final int totalMedicalCare;

    public Patient() {
        totalMedicalCare = 1;
    }



    public void setEmergencyContact(String emergencyContact) {
    }

    public void setAllergyList(String allergyList) {
    }

    public void setSpecialCares(String specialCares) {
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
    }

    public void setHealthInsuranceExpirationDate(Date healthInsuranceExpirationDate) {
    }

    public void setMedicalCareStatus(MedicalCareStatus medicalCareStatus) {
        this.medicalCareStatus = medicalCareStatus;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public MedicalCareStatus getMedicalCareStatus() {
        return medicalCareStatus;
    }

    public int getTotalMedicalCare() {
        return totalMedicalCare;
    }
}
