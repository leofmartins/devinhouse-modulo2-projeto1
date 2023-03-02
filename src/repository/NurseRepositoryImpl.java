package repository;

import model.Nurse;
import model.Patient;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class NurseRepositoryImpl implements NurseRepository {
    private static List<Nurse> nurseList = new ArrayList<>();
    @Override
    public void addNurse(Nurse person) {
        nurseList.add(person);
    }
}
