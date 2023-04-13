package CLASES;

import java.time.LocalDate;

/*
* - Caguanos: Cada uno mide dos metros de largo,
* y su misión es lanzar confetis
* y dulces a quienes protestan.
* */

public class Caguano extends Carro {
    //atributos
    int largo = 2;
    private Integer alcanceTiro;
    private Integer colorConfeti;

    //metodo constructor


    public Caguano() {
    }

    public Caguano(int cantidadOcupantes, String fechaIngreso, String institucion, Integer fila, Integer columna, int largo, Integer alcanceTiro, Integer colorConfeti) {
        super(cantidadOcupantes, fechaIngreso, institucion, fila, columna);
        this.largo = largo;
        this.alcanceTiro = alcanceTiro;
        this.colorConfeti = colorConfeti;
    }

    //metodo getter and setter

    public Integer getAlcanceTiro() {
        return alcanceTiro;
    }

    public void setAlcanceTiro(Integer alcanceTiro) {
        this.alcanceTiro = alcanceTiro;
    }

    public Integer getColorConfeti() {
        return colorConfeti;
    }

    public void setColorConfeti(Integer colorConfeti) {
        this.colorConfeti = colorConfeti;
    }

    // metodo toString


    @Override
    public String toString() {
        return "Caguano{" +
                "largo=" + largo +
                ", alcanceTiro=" + alcanceTiro +
                ", colorConfeti=" + colorConfeti +
                "} " + super.toString();
    }
}
