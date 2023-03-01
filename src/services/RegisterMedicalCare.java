package services;

import model.Doctor;
import model.Patient;

public class RegisterMedicalCare {
    public void registerMedicalCare(Patient patient, Doctor doctor) {
        patient.incrTotalMedicalCare();
        doctor.incrTotalMedicalCare();
    }
}