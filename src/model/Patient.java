package model;

import enums.MedicalCareStatus;

import java.util.Date;

public class Patient extends Person {
    private String emergencyContact;
    private String[] allergyList;
    private String[] specialCares;
    private String healthInsurance;
    private int healthInsuranceNumber;
    private Date healthInsuranceExpirationDate;
    private MedicalCareStatus medicalCareStatus;
    private int totalMedicalCare = 0;

    public Patient(String name,
                   Gender gender,
                   Date birthdate,
                   String cpf,
                   String phone,
                   String emergencyContact,
                   MedicalCareStatus medicalCareStatus) {
        super(name,
                gender,
                birthdate,
                cpf,
                phone);
        this.emergencyContact = emergencyContact;
        this.medicalCareStatus = medicalCareStatus;
    }

    public Patient() {

    }

    public void setMedicalCareStatus(MedicalCareStatus medicalCareStatus) {
        this.medicalCareStatus = medicalCareStatus;
    }

    public void incrTotalMedicalCare() {
        this.totalMedicalCare += 1;
    }
}
