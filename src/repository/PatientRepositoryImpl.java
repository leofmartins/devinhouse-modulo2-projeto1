package repository;

import model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImpl implements PatientRepository {
    private static final List<Patient> patientList =  new ArrayList<>();
    @Override
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public Patient getPatient(int id) {
        for (Patient patient:
             patientList) {
            if (patient.getId() == id)
                return patient;
        }
        return null;
    }

    public static List<Patient> getPatientList() {
        return patientList;
    }
}
