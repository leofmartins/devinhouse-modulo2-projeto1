package enums;

public enum MedicalCareStatus {
    waiting("Aguardando Atendimento"),
    inMedicalCare("Em Atendimento"),
    medicalCareFinalized("Atendido"),
    notAttended("Não Atendido");

    final String description;
    MedicalCareStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
