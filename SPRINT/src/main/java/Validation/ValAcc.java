package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValAcc {

    public static boolean validarIdentificador(int identificador) {
        try {
            return identificador > 0;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean validarRutCliente(int rutCliente) {
        try {
            return rutCliente > 0;
        } catch (Exception e) {
            return false;
        }
    }


/*
    private boolean validarHora(String hora) {
        try {
            String[] partes = hora.split(":");
            if (partes.length != 2) {
                return false;
            }
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);
            return horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
        } catch (Exception e) {
            return false;
        }
    }
* */


    public static boolean validarLugar(String lugar) {
        try {
            return lugar != null && lugar.length() >= 10 && lugar.length() <= 50;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarOrigen(String origen) {
        try {
            return origen == null || origen.length() <= 100;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarConsecuencias(String consecuencias) {
        try {
            return consecuencias == null || consecuencias.length() <= 100;
        } catch (Exception e) {
            return false;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------

    //https://www.techiedelight.com/es/ validate-date-java/
    // Programa Java para validar una fecha en Java
    private static final String Date_REGEX =
            "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|" +
                    "(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))" +
                    "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3" +
                    "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
                    "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
                    "^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|" +
                    "2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final Pattern Date_PATTERN = Pattern.compile(Date_REGEX);

    public static boolean dateValidator(String date)
    {
        Matcher matcher = Date_PATTERN.matcher(date);
        return matcher.matches();
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------------

    //https://stackoverflow.com/questions/7536755/regular-expression-for-matching-hhmm-time-format
    //Regular expression for matching HH:MM time format
    private static final String Time_REGEX =
            "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$";
    private static final Pattern Time_PATTERN = Pattern.compile(Time_REGEX);

    public static boolean timeValidator(String date)
    {
        Matcher matcher = Time_PATTERN.matcher(date);
        return matcher.matches();
    }


}
