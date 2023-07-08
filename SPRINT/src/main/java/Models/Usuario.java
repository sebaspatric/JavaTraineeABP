package Models;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import static Validation.Validation.*;


public class Usuario implements Asesoria{
    private String nombre;
    private String fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    //metodo mostrar edad
    public String mostrarEdad() {
        String fechaNacimientoStr = fechaNacimiento;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse(fechaNacimientoStr, formatter);
        //LocalDate localDate2 = fechaNacimiento;
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


    // Setters
    public void setNombre(String nombre) {
        if (validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            System.out.println("ingresa unn nombre mínimo 10 caracteres, máximo 50");
        }
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (dateValidator(fechaNacimiento)) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("La fecha no es valida");
        }
    }


    public void setRun(int run) {
        if (validarRun(run)) {
            this.run = run;
        } else {
            System.out.println("Ingresa un run");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", fechaNacimiento='").append(fechaNacimiento).append('\'');
        sb.append(", run=").append(run);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return run == usuario.run && Objects.equals(nombre, usuario.nombre) && Objects.equals(fechaNacimiento, usuario.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaNacimiento, run);
    }

    @Override
    public String analizarUsuario() {
        return "Usuario{"+"\n"+"nombre='"+ nombre + '\'' +"\n"+
                "run='" + run + '\'' +
                '}'+"\n";
    }
}
