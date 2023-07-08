package Validation;

import static Validation.Validation.isNumeric;

public class ValCliente {

    // Validaciones
    public static boolean validarRut(int rut) {
                return (rut > 0 && rut < 99999999);
    }

    public static  boolean sonNombresValidos(String nombres) {
        return nombres != null && nombres.length() >= 5 && nombres.length() <= 30;
    }

    public static  boolean sonApellidosValidos(String apellidos) {
        return apellidos != null && apellidos.length() >= 5 && apellidos.length() <= 30;
    }

    public static  boolean esTelefonoValido(String telefono) {
        return telefono != null && !telefono.isEmpty() && isNumeric(telefono) ;
    }

    public static  boolean esAfpValido(String afp) {
        return afp == null || afp.length() >= 4 && afp.length() <= 30;
    }

    public static  boolean esSistemaSaludValido(int sistemaSalud) {
        return sistemaSalud == 1 || sistemaSalud == 2;
    }

    public static  boolean esDireccionValida(String direccion) {
        return direccion == null || direccion.length() <= 70;
    }

    public static  boolean esComunaValida(String comuna) {
        return comuna == null || comuna.length() <= 50;
    }

    public static  boolean esEdadValida(int edad) {
        return edad >= 0 && edad < 150;
    }
}
