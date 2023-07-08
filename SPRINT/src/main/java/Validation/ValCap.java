package Validation;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValCap {

    public static boolean validarIdentificador(int identificador) {
        return identificador > 0;
    }

    public static boolean validarRutCliente(int rutCliente) {
        try {
            if ( rutCliente > 0 && rutCliente < 99999999) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el RUT cliente a número");
        }
        return false;
    }

    public static boolean validarDia(String dia) {
        String diaLowerCase = dia.toLowerCase();
        return diaLowerCase.equals("lunes") ||
                diaLowerCase.equals("martes") ||
                diaLowerCase.equals("miércoles") ||
                diaLowerCase.equals("jueves") ||
                diaLowerCase.equals("viernes") ||
                diaLowerCase.equals("sábado") ||
                diaLowerCase.equals("domingo");
    }
    public static boolean validarHora(String hora) {
        String[] partes = hora.split(":");
        if (partes.length != 2) {
            return false;
        }
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        return horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
    }

    public static boolean validarLugar(String lugar) {
        return lugar != null && lugar.length() >= 10 && lugar.length() <= 50;
    }

    public static boolean validarDuracion(int duracion) {
        try {
            if (duracion >= 0 && duracion <= 70) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean validarCantidadAsistentes(int cantidadAsistentes) {
        try {
            if (cantidadAsistentes > 0 && cantidadAsistentes < 1000) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
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

    public static void main(String[] args) {
        boolean res;
        //hora
        //res=false;
        System.out.println("Dame la hora");
        //fecha=leer.next();
        String hora= JOptionPane.showInputDialog("1.0 	Ingresa la hora formato hh:mm ");
        res=timeValidator(hora);
        while (!res){
            System.out.println("La hora no es valida");
            res=timeValidator(hora);
        }
        System.out.println("La hora es valida");
        System.out.println("La hora es: "+hora+"hrs");

    }

}
