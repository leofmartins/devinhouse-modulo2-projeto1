package enums;

public enum MedicalSpeciality {
    generalPractitioner("Clínico Geral"),
    anesthetist("Anestesista"),
    dermatologist("Dermatologista"),
    gynecologist("Ginecologista"),
    neurologist("Neurologista"),
    pediatrician("Padiatra"),
    psychiatrist("Psicólogo(a)"),
    orthopedist("Ortopedista");

    final String description;

    MedicalSpeciality(String description) {
       this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
