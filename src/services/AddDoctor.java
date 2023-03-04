package services;

import model.Doctor;
import repository.DoctorRepositoryImpl;

public class AddDoctor {
    public static void addDoctor() {
        Doctor doctor = new Doctor();
        DoctorRepositoryImpl doctorRepository = new DoctorRepositoryImpl();
        doctorRepository.addDoctor(doctor);
        System.out.println("Médico(a) cadastrado com sucesso.");
        System.out.println();
    }
}
