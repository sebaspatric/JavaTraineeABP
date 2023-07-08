package Models;

import static Validation.ValProf.esTituloValido;
import static Validation.Validation.dateValidator;

public class Profesional extends Usuario {
    //atributos
    private String titulo;
    private String fechaIngreso;

    //constructores
    public Profesional() {
    }

    public Profesional(String nombre, String fechaNacimiento, int RUN, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, RUN);
        //this.titulo = titulo;
        //this.fechaIngreso = fechaIngreso;
        setTitulo(titulo);
        setFechaIngreso(fechaIngreso);
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

    //public void setTitulo(String titulo) {
    //    this.titulo = titulo;
    //}

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    //public void setFechaIngreso(String fechaIngreso) {
    //    this.fechaIngreso = fechaIngreso;
    //}

    // Setters
    public void setTitulo(String titulo) {
        if (!esTituloValido(titulo)) {
            System.out.println("Título inválido");
        } else {
            this.titulo = titulo;
        }
    }

    public void setFechaIngreso(String fechaIngreso) {
        if (dateValidator(fechaIngreso)) {
            this.fechaIngreso = fechaIngreso;
        } else {
            System.out.println("La fecha no es valida");
        }
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
