package services;

import enums.MedicalSpeciality;
import enums.PersonType;
import model.Doctor;
import model.Person;
import repository.DoctorRepositoryImpl;
import view.HomeMenu;

import java.util.Scanner;

import static services.ListOfOptions.*;

public class AddDoctor {
    public static void addDoctor() {
        Doctor doctor = new Doctor();
        String educationalInstitution,
                crmRegistrationNumber;
        int medicalSpecialityOption,
            status;
        Scanner scanner = new Scanner(System.in);
        Person.addPerson(doctor, PersonType.doctor);

        System.out.print("Informe a Insituição de Ensino de Formação (obrigatório): ");
        educationalInstitution = scanner.nextLine();
        doctor.setEducationalInstitution(educationalInstitution);

        System.out.print("Informe o cadastro do CRM/UF (obriagdório): ");
        crmRegistrationNumber = scanner.nextLine();
        doctor.setCrmRegistrationNumber(crmRegistrationNumber);

        System.out.println("Escolha a especialização (obrigatório):");
        showMedicalSpecializationOptions();
        medicalSpecialityOption = ReadOptionSelected.readOption(typeOfMedicalSpecializationLenth());
        switch (medicalSpecialityOption) {
            case 1 -> doctor.setMedicalSpeciality(MedicalSpeciality.generalPractitioner);
            case 2 -> doctor.setMedicalSpeciality(MedicalSpeciality.anesthetist);
            case 3 -> doctor.setMedicalSpeciality(MedicalSpeciality.dermatologist);
            case 4 -> doctor.setMedicalSpeciality(MedicalSpeciality.gynecologist);
            case 5 -> doctor.setMedicalSpeciality(MedicalSpeciality.neurologist);
            case 6 -> doctor.setMedicalSpeciality(MedicalSpeciality.pediatrician);
            case 7 -> doctor.setMedicalSpeciality(MedicalSpeciality.psychiatrist);
            case 8 -> doctor.setMedicalSpeciality(MedicalSpeciality.orthopedist);
        }

        System.out.println("Informe o estado do(a) médico(a) no sistema: ");
        System.out.println("1. Ativo");
        System.out.print("2. Inativo: ");
        status = scanner.nextInt();
        doctor.setStatus(status == 1);

        DoctorRepositoryImpl doctorRepository = new DoctorRepositoryImpl();
        doctorRepository.addDoctor(doctor);

        System.out.println("Médico(a) cadastrado com sucesso.");
        System.out.println();

        HomeMenu.renderHomeMenu();
    }
}
