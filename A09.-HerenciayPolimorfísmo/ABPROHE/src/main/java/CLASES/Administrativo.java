package CLASES;

import java.time.LocalDate;

public class Administrativo extends Usuario {
    //atributos
    private String area;
    private String experienciaPrevia;

    //constructores
    //CONSTRUCTOR VACIO
    public Administrativo() {
    }

    public Administrativo(String nombre, LocalDate fechaNacimiento, int RUN, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, RUN);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    //METODO analizarUsuario()
    @Override
    public String analizarUsuario() {
        return "Administrativo{"+"Super usuario='" + super.analizarUsuario()+
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }


    //metodos getter and setter
    //metodos getter and setter

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }


    //metodo TOSTRING

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
