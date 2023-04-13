package CLASES;

import java.time.LocalDate;

public class Carro {
    // clase padre

    //atributos
    private int cantidadOcupantes;
    private String fechaIngreso; //LocalDate
    private String institucion;
    private Integer fila;
    private Integer columna;

    //metodo constructor


    public Carro() {
    }

    public Carro(int cantidadOcupantes, String fechaIngreso, String institucion, Integer fila, Integer columna) {
        this.cantidadOcupantes = cantidadOcupantes;
        this.fechaIngreso = fechaIngreso;
        this.institucion = institucion;
        this.fila = fila;
        this.columna = columna;
    }


    //metodos getter and setter

    public int getCantidadOcupantes() {
        return cantidadOcupantes;
    }

    public void setCantidadOcupantes(int cantidadOcupantes) {
        this.cantidadOcupantes = cantidadOcupantes;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }


    //metodo toString
    @Override
    public String toString() {
        return "Carro{" +
                "cantidadOcupantes=" + cantidadOcupantes +
                ", fechaIngreso=" + fechaIngreso +
                ", institucion='" + institucion + '\'' +
                ", fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
