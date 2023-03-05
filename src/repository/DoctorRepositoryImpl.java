package repository;

import model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements DoctorRepository {
    private static final List<Doctor> doctorList = new ArrayList<>();
    @Override
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public Doctor getDoctor(int id) {
        return doctorList.get(id);
    }
}
