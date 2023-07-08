package Models;

import java.util.Objects;

import static Validation.ValAcc.*;

public class Accidente {
    private int id;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int id, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getId() {
        return id;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setId(int id) {
        if(validarIdentificador(id)) {
            this.id = id;
        } else {
            System.out.println("rut invalido");
        }
    }

    public void setRutCliente(int rutCliente) {
        if (validarRutCliente(rutCliente)) {
            this.rutCliente = rutCliente;
        } else {
            System.out.println("RUT cliente inválido");
        }
    }

    public void setDia(String dia) {
        if (dateValidator(dia)) {
            this.dia = dia;
        } else {
            System.out.println("Día inválido");
        }
    }
    public void setHora(String hora) {
        if (timeValidator(hora)) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida");
        }
    }

    public void setLugar(String lugar) {
        if (validarLugar(lugar)) {
            this.lugar = lugar;
        } else {
            System.out.println("Lugar inválido");
        }
    }
    public void setOrigen(String origen) {
        if (validarOrigen(origen)) {
            this.origen = origen;
        } else {
            System.out.println("Origen inválido");
        }
    }

    public void setConsecuencias(String consecuencias) {
        if (validarConsecuencias(consecuencias)) {
            this.consecuencias = consecuencias;
        } else {
            System.out.println("Consecuencias inválidas");
        }
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accidente accidente = (Accidente) o;
        return id == accidente.id && rutCliente == accidente.rutCliente && Objects.equals(dia, accidente.dia) && Objects.equals(hora, accidente.hora) && Objects.equals(lugar, accidente.lugar) && Objects.equals(origen, accidente.origen) && Objects.equals(consecuencias, accidente.consecuencias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rutCliente, dia, hora, lugar, origen, consecuencias);
    }
}
