package CLASES;

import java.time.LocalDate;

/*
*
- Trupallas: Corresponden a efectivos cibernéticos con tecnología de punta,
* cada uno ocupando en total un metro cuadrado de espacio, preparados para hacer
* entrar en razón a los manifestantes con la fuerza de sus ideas.
* */


public class Trupalla extends Carro{
    //atributos
    int largo = 1;
    private int nivelArmadura; //nivel de armadura (entero entre 1 a 5)
    private String nombrePersona;

    //metodo constructor

    public Trupalla() {
    }

    public Trupalla(int cantidadOcupantes, String fechaIngreso, String institucion, Integer fila, Integer columna, int largo, int nivelArmadura, String nombrePersona) {
        super(cantidadOcupantes, fechaIngreso, institucion, fila, columna);
        this.largo = largo;
        this.nivelArmadura = nivelArmadura;
        this.nombrePersona = nombrePersona;
    }

    //metodo getter and setter

    public int getNivelArmadura() {
        return nivelArmadura;
    }

    public void setNivelArmadura(int nivelArmadura) {
        this.nivelArmadura = nivelArmadura;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    //metodo toString


    @Override
    public String toString() {
        return "Trupalla{" +
                "largo=" + largo +
                ", nivelArmadura=" + nivelArmadura +
                ", nombrePersona='" + nombrePersona + '\'' +
                "} " + super.toString();
    }
}
