package model;

import enums.MedicalSpeciality;

import java.util.Date;

public class Doctor extends Patient {
    String educationalInstitution;
    String crmRegistrationNumber;
    MedicalSpeciality medicalSpeciality;
    Boolean status;
    int totalMedicalCare;

//    public Doctor(String name,
//                  Gender gender,
//                  Date birthdate,
//                  String cpf,
//                  String phone,
//                  String educationalInstitution,
//                  String crmRegistrationNumber,
//                  MedicalSpeciality medicalSpeciality) {
//        super(name, gender, birthdate, cpf, phone);
//        this.educationalInstitution = educationalInstitution;
//        this.crmRegistrationNumber = crmRegistrationNumber;
//        this.medicalSpeciality = medicalSpeciality;
//    }

    public Doctor() {};

    public void incrTotalMedicalCare() {
        this.totalMedicalCare += 1;
    }
}
