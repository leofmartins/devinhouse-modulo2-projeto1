package services;

import enums.MedicalCareStatus;
import model.Doctor;
import model.Patient;
import repository.DoctorRepositoryImpl;
import repository.PatientRepositoryImpl;
import view.HomeMenu;

import java.util.Scanner;

public class RegisterMedicalCare {
    public static void registerMedicalCare() {
        Scanner scanner = new Scanner(System.in);
        PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();
        DoctorRepositoryImpl doctorRepository = new DoctorRepositoryImpl();

        System.out.println("REGISTRO DE ATENDIMENTO MÉDICO");
        System.out.print("Informe o id do paciente: ");
        int patientId = scanner.nextInt();
        System.out.print("Informe o id do(a) médico(a): ");
        int doctorId = scanner.nextInt();

        Patient patient = patientRepository.getPatient(patientId);
        Doctor doctor = doctorRepository.getDoctor(doctorId);
        patient.incrTotalMedicalCare();
        patient.setMedicalCareStatus(MedicalCareStatus.inMedicalCare);
        doctor.incrTotalMedicalCare();

        System.out.println("Atendimento registrado com sucesso.");
        System.out.println();

        HomeMenu.renderHomeMenu();
    }
}