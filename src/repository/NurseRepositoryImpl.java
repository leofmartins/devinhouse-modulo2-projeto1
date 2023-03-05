package repository;

import model.Nurse;

import java.util.ArrayList;
import java.util.List;

public class NurseRepositoryImpl implements NurseRepository {
    private static final List<Nurse> nurseList = new ArrayList<>();
    @Override
    public void addNurse(Nurse person) {
        nurseList.add(person);
    }

    public static List<Nurse> getNurseList() {
        return nurseList;
    }
}
