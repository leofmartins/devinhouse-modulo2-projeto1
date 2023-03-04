package enums;

public enum PersonType {
    patient("Paciente"),
    nurse("Enfermeiro(a)"),
    doctor("Médico(a)");

    final String description;

    PersonType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
