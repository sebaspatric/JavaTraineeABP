package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Validation.ValVisT.*;

public class VisitaTerreno {
    private int id;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;
    private List<Revision> revisiones;

    public VisitaTerreno(int id, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
        this.revisiones = new ArrayList<>();
    }

    public void agregarRevision(Revision revision) {
        revisiones.add(revision);
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

    public String getComentarios() {
        return comentarios;
    }

    public void setIdentificador(int id) {
        try {
            if (validarIdentificador(id)) {
                this.id = id;
            } else {
                System.out.println("Identificador de visita en terreno inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el identificador de visita en terreno");
        }
    }

    public void setRutCliente(int rutCliente) {
        try {
            if (validarRutCliente(rutCliente)) {
                this.rutCliente = rutCliente;
            } else {
                System.out.println("RUT cliente inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el RUT cliente");
        }
    }



    public void setDia(String dia) {
        try {
            if (dateValidator(dia)) {

                this.dia = dia;
            } else {
                System.out.println("Día inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el día");
        }
    }

    public void setHora(String hora) {
        try {
            if (timeValidator(hora)) {
                this.hora = hora;
            } else {
                System.out.println("Hora inválida");
            }
        } catch (Exception e) {
            System.out.println("Error al validar la hora");
        }
    }



    public void setLugar(String lugar) {
        try {
            if (validarLugar(lugar)) {
                this.lugar = lugar;
            } else {
                System.out.println("Lugar inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el lugar");
        }
    }

    public void setComentarios(String comentarios) {
        try {
            if (validarComentarios(comentarios)) {
                this.comentarios = comentarios;
            } else {
                System.out.println("Comentarios inválidos");
            }
        } catch (Exception e) {
            System.out.println("Error al validar los comentarios");
        }
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitaTerreno that = (VisitaTerreno) o;
        return id == that.id && rutCliente == that.rutCliente && Objects.equals(dia, that.dia) && Objects.equals(hora, that.hora) && Objects.equals(lugar, that.lugar) && Objects.equals(comentarios, that.comentarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rutCliente, dia, hora, lugar, comentarios);
    }
}
