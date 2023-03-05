package services;

import enums.PersonType;
import model.Nurse;
import model.Person;
import repository.NurseRepositoryImpl;
import view.HomeMenu;

import java.util.Scanner;

public class AddNurse {
    public static void addNurse() {
        Nurse nurse = new Nurse();
        String educationalInstitution,
                cofenRegistrationNumber;
        Scanner scanner = new Scanner(System.in);
        Person.addPerson(nurse, PersonType.nurse);

        do {
            System.out.print("Informe a Insituição de Ensino de Formação (obrigatório): ");
            educationalInstitution = scanner.nextLine();
        } while (educationalInstitution.isEmpty());

        nurse.setEducationalInstitution(educationalInstitution);

        do {
            System.out.print("Informe o cadastro do COFEN/UF (obrigatório): ");
            cofenRegistrationNumber = scanner.nextLine();
        } while (cofenRegistrationNumber.isEmpty());

        nurse.setCofenRegistrationNumber(cofenRegistrationNumber);

        NurseRepositoryImpl nurseRepository = new NurseRepositoryImpl();
        nurseRepository.addNurse(nurse);

        System.out.println("Enfermeiro(a) cadastrado com sucesso.");
        System.out.println();

        HomeMenu.renderHomeMenu();
    }
}
