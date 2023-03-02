package services;

import model.Nurse;
import repository.NurseRepositoryImpl;

public class AddNurse {
    public static void addNurse() {
        Nurse nurse = new Nurse();
        NurseRepositoryImpl nurseRepository = new NurseRepositoryImpl();
        nurseRepository.addNurse(nurse);
        System.out.println("Enfermeiro(a) cadastrado com sucesso.");
        System.out.println();
    }
}
