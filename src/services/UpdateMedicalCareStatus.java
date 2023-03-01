package services;

import enums.MedicalCareStatus;
import model.Patient;

public class UpdateMedicalCareStatus {
    public void updateMedicalCareStatus(Patient patient, MedicalCareStatus medicalCareStatus) {
        patient.setMedicalCareStatus(medicalCareStatus);
    }
}
