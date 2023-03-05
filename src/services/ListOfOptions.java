package services;

public abstract class ListOfOptions {

    private static final String[] typeOfPersonList = {
            "Paciente",
            "Enfermeiro(a)",
            "Médico(a)"
    };

    private static final String[] typeOfMedicalCareStatusList = {
            "Aguardando atendimento",
            "Em atendimento",
            "Atendido",
            "Não atendido"
    };

    private static final String[] typeOfMEdicalSpecializationList = {
            "Clínico Geral",
            "Anestesista",
            "Dermatologista",
            "Ginecologista",
            "Neurologista",
            "Pediatria",
            "Psiquiatria",
            "Ortopedia"
    };

    private static final String[] typeOfReportsList = {
            "Listagem de pessoas",
            "Relatório de pacientes",
            "Relatório de médicos"
    };

    public static void showTypeOfPersonOptions() {
        for (int i = 0; i < typeOfPersonList.length; i++) {
            System.out.println((i + 1) + ". " + typeOfPersonList[i]);
        }
    }

    public static void showMedicalCareStatusOptions() {
        for (int i = 0; i < typeOfMedicalCareStatusList.length; i++) {
            System.out.println((i + 1) + ". " + typeOfMedicalCareStatusList[i]);
        }
    }

    public static void showMedicalSpecializationOptions() {
        for (int i = 0; i < typeOfMEdicalSpecializationList.length; i++) {
            System.out.println((i + 1) + ". " + typeOfMEdicalSpecializationList[i]);
        }
    }

    public static void showReportsOptions() {
        for (int i = 0; i < typeOfReportsList.length; i++) {
            System.out.println((i + 1) + ". " + typeOfReportsList[i]);
        }
    }

    public static int typeOfPersonLength() {
        return typeOfPersonList.length;
    }

    public static int typeOfMedicalCareStatusLength() {
        return typeOfMedicalCareStatusList.length;
    }

    public static int typeOfMedicalSpecializationLenth() {
        return typeOfMEdicalSpecializationList.length;
    }

    public static int typeOfReportsLength() {
        return typeOfReportsList.length;
    }
}
