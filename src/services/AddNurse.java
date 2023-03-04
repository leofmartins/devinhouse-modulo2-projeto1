package services;

import model.Nurse;
import model.Person;
import repository.NurseRepositoryImpl;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AddNurse {
    public static void addNurse() {
        Nurse nurse = new Nurse();
        String educationalInstitution,
                cofenRegistrationNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        Scanner scanner = new Scanner(System.in);
        Person.addPerson(nurse, dateFormat);

        System.out.println("Informe a Insituição de Ensino de Formação (obrigatório):");
        educationalInstitution = scanner.nextLine();
        nurse.setEducationalInstitution(educationalInstitution);

        System.out.println("Informe o cadastro do COFEN/UF:");
        cofenRegistrationNumber = scanner.nextLine();
        nurse.setCofenRegistrationNumber(cofenRegistrationNumber);

        NurseRepositoryImpl nurseRepository = new NurseRepositoryImpl();
        nurseRepository.addNurse(nurse);

        System.out.println("Enfermeiro(a) cadastrado com sucesso.");
    }
}
