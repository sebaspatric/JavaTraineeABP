package CLASES;

import java.time.LocalDate;

/*
* //- Kromis: Tienen un largo de tres metros cada una,
// y son utilizadas para transportar efectivos de la PKS.
* */

public class Kromi extends Carro{
    int largo = 3;
    //atributos
    private String fabricacionYear;
    private String marca;

 // static {
 //     int largo = 3;
 // }

    //metodo constructor
    public Kromi() {
    }

    public Kromi(int cantidadOcupantes, String fechaIngreso, String institucion, Integer fila, Integer columna, int largo, String fabricacionYear, String marca) {
        super(cantidadOcupantes, fechaIngreso, institucion, fila, columna);
        this.largo = largo;
        this.fabricacionYear = fabricacionYear;
        this.marca = marca;
    }

    //  public Kromi(int cantidadOcupantes, LocalDate fechaIngreso, String institucion, Integer fila, Integer columna, LocalDate fabricacionYear, String marca) {
 //      super(cantidadOcupantes, fechaIngreso, institucion, fila, columna);
 //      this.fabricacionYear = fabricacionYear;
 //      this.marca = marca;
 //  }

    //metodos getter and setter
    public String getFabricacionYear() {
        return fabricacionYear;
    }

    public void setFabricacionYear(String fabricacionYear) {
        this.fabricacionYear = fabricacionYear;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //toString


    @Override
    public String toString() {
        return "Kromi{" +
                "largo=" + largo +
                ", fabricacionYear=" + fabricacionYear +
                ", marca='" + marca + '\'' +
                "} " + super.toString();
    }
}
