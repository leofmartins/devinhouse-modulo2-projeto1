package services;

import model.Patient;
import repository.PatientRepositoryImpl;

public class AddPatient {
    public static void addPatient() {
        Patient patient = new Patient();
        PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();
        patientRepository.addPatient(patient);
        System.out.println("Paciente cadastrado com sucesso.");
        System.out.println();
    }
}
