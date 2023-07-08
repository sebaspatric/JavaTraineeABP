package CLASES;

import java.sql.Time;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Capacitacion {
    private int id;
    private int rutCliente;
    private LocalDate dia;
    private Time hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    //constructor
    public Capacitacion() {
    }

    public Capacitacion(int id, int rutCliente, LocalDate dia, Time hora, String lugar, int duracion, int cantidadAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }


    //metodo mostrarDetalle
    public String mostrarDetalle() {
        String edadMensaje = null;
        int numberDays;
        numberDays = (int) diffDays();
        edadMensaje = "La capacitación será en: "+numberDays+" dias, a las "+getHora()+" del día "+getDia()+", y durará "+getDuracion()+" minutos";
        return edadMensaje;
    }
    public long diffDays () {
        LocalDate myDate = getDia();
        LocalDate currentDate = LocalDate.now();
        long numberOFDays = DAYS.between(currentDate, myDate);
        return numberOFDays;
    }


    //metodos accesadores y mutadores
    //metodos getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
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
