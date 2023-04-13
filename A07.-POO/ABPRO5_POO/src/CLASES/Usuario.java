package CLASES;

import java.util.Date;

public class Usuario {
    private String nombre;
    private Date fechaNacimiento;
    private int RUN;

    //constructor
    public Usuario() {
    }

    public Usuario(String nombre, Date fechaNacimiento, int RUN) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.RUN = RUN;
    }


    //metodos ToString

    public static void main(String[] args) {

    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", RUN=" + RUN +
                '}';
    }
}

