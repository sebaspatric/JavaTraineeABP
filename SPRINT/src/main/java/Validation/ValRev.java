package Validation;

public class ValRev {

    public static boolean validarIdentificador(int id) {
        try {
            return id > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarIdentificadorVisita(int idVisita) {
        try {
            return idVisita > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarNombre(String nombre) {
        try {
            return nombre != null && nombre.length() >= 10 && nombre.length() <= 50;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarDetalle(String detalle) {
        try {
            return detalle == null || detalle.length() <= 100;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarEstado(int estado) {
        try {
            return estado >= 1 && estado <= 3;
        } catch (Exception e) {
            return false;
        }

    }
}
