package Validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValProf {

    // Validaciones
    public static boolean esTituloValido(String titulo) {
        return titulo != null && titulo.length() >= 10 && titulo.length() <= 50;
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------
    // validacion para la fecha
    //https://www.lawebdelprogramador.com/codigo/Java/3902-Comprobar-que-una-fecha-sea-correcta.html#:~:text=Para%20que%20una%20fecha%20sea%20correcta%20es%20necesario%3A&text=El%20a
    public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
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


    //--
}
