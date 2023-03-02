package repository;

import model.Patient;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImpl implements PersonRepository {
    private static List<Patient> patientList =  new ArrayList<>();
    @Override
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public Patient getPatientList(int id) {
        return patientList.get(id);
    }
}
