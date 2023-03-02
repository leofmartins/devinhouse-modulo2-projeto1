package repository;

import model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImpl implements PatientRepository {
    private static List<Patient> patientList =  new ArrayList<>();
    @Override
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public Patient getPatientList(int id) {
        return patientList.get(id);
    }
}
