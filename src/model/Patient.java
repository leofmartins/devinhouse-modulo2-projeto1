package model;

import enums.MedicalCareStatus;

import java.util.Date;

class Patient extends Person {
    String emergencyContact;
    String[] allergyList;
    String[] specialCares;
    String healthInsurance;
    int healthInsuranceNumber;
    Date healthInsuranceExpirationDate;
    MedicalCareStatus medicalCareStatus;
    int totalMedicalCare;
}
