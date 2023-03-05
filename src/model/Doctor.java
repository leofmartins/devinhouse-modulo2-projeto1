package model;

import enums.MedicalSpeciality;

public class Doctor extends Patient {
    String educationalInstitution;
    String crmRegistrationNumber;
    MedicalSpeciality medicalSpeciality;
    Boolean status;
    int totalMedicalCare;

    public Doctor() {}

    public MedicalSpeciality getMedicalSpeciality() {
        return medicalSpeciality;
    }

    @Override
    public int getTotalMedicalCare() {
        return totalMedicalCare;
    }

    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }

    public void setCrmRegistrationNumber(String crmRegistrationNumber) {
        this.crmRegistrationNumber = crmRegistrationNumber;
    }

    public void setMedicalSpeciality(MedicalSpeciality medicalSpeciality) {
        this.medicalSpeciality = medicalSpeciality;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void incrTotalMedicalCare() {
        this.totalMedicalCare += 1;
    }
}
