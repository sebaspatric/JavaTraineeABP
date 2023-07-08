package Validation;

public class ValAdm {
    // Validaciones
    public static boolean esAreaValida(String area) {
        return area != null && area.length() >= 5 && area.length() <= 20;
    }

    public static boolean esExperienciaPreviaValida(String experienciaPrevia) {
        return experienciaPrevia == null || experienciaPrevia.length() <= 100;
    }
}
