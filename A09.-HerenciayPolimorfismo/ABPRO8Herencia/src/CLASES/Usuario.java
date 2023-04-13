package CLASES;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Usuario implements Asesoria {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int RUN;

    //constructor
    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNacimiento, int RUN) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.RUN = RUN;
    }

    //metodo mostrar edad
    public String mostrarEdad() {
        LocalDate localDate2 = fechaNacimiento;
        //LocalDate localDate2 = LocalDate.of(2020, 02, 20);
        ZonedDateTime zonedDateTime = localDate2.atStartOfDay(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        Date date = Date.from(instant);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        //int dia, anio, mes;
        //Date fechaActual = new Date();
        //DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        //formatoFecha.format(fechaActual);
        //Calendar fecha = Calendar.getInstance();
        //int anio = fecha.get(Calendar.YEAR);
        //int mes = fecha.get(Calendar.MONTH) + 1;
        //int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int edad = 0;
        edad = calcularEdad(dia, mes, anio);
        String edadMensaje = null;
        edadMensaje = "El usuario tiene: "+edad+" años";
        return edadMensaje;
    }

    static int calcularEdad(int dia, int mes, int anio) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        Period periodo = Period.between(fechaNacimiento, fechaHoy);

        return periodo.getYears();
    }


    //metodos accesadores y mutadores
    //metodos getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRUN() {
        return RUN;
    }

    public void setRUN(int RUN) {
        this.RUN = RUN;
    }




    //public static void main(String[] args) {

    //}

    //metodos ToString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", RUN=" + RUN +
                '}';
    }

    //metodo analizarUsuario()
    @Override
    public String analizarUsuario() {
        return getNombre();
    }
}

