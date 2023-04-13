package CLASES;

import java.sql.Time;
import java.util.Date;

public class Capacitacion {
    private int id;
    private int rutCliente;
    private Date dia;
    private Time hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    //constructor
    public Capacitacion() {
    }

    public Capacitacion(int id, int rutCliente, Date dia, Time hora, String lugar, int duracion, int cantidadAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    //metodos tostring


    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
