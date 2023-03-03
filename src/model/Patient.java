package model;

import enums.MedicalCareStatus;

import java.util.Date;

public class Patient extends Person {
    private String emergencyContact;
    private String allergyList;
    private String specialCares;
    private String healthInsurance;
    private String healthInsuranceNumber;
    private Date healthInsuranceExpirationDate;
    private MedicalCareStatus medicalCareStatus;

    private int totalMedicalCare;

    public Patient() {
        totalMedicalCare = 1;
    }



    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setAllergyList(String allergyList) {
        this.allergyList = allergyList;
    }

    public void setSpecialCares(String specialCares) {
        this.specialCares = specialCares;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public void setHealthInsuranceExpirationDate(Date healthInsuranceExpirationDate) {
        this.healthInsuranceExpirationDate = healthInsuranceExpirationDate;
    }

    public void setMedicalCareStatus(MedicalCareStatus medicalCareStatus) {
        this.medicalCareStatus = medicalCareStatus;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public String getAllergyList() {
        return allergyList;
    }

    public String getSpecialCares() {
        return specialCares;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public Date getHealthInsuranceExpirationDate() {
        return healthInsuranceExpirationDate;
    }

    public MedicalCareStatus getMedicalCareStatus() {
        return medicalCareStatus;
    }

    public int getTotalMedicalCare() {
        return totalMedicalCare;
    }
}
