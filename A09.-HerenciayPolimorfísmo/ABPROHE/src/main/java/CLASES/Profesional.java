package CLASES;

import java.time.LocalDate;

public class Profesional extends Usuario{
    //atributos
    private String titulo;
    private LocalDate fechaIngreso;

    //constructores
    public Profesional() {
    }

    public Profesional(String nombre, LocalDate fechaNacimiento, int RUN, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, RUN);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //metodo analizar usuario
    @Override
    public String analizarUsuario() {
        return "Profesional{"+super.analizarUsuario() +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }

    //metodos getter & setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //toString

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
