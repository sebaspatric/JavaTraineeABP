package Models;

import static Validation.ValRev.*;

public class Revision {

    private int id;
    private int idVisita;
    private String nombre;
    private String detalle;
    private int estado;

    public Revision(int id, int idVisita, String nombre, String detalle, int estado) {
        this.id = id;
        this.idVisita = idVisita;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setId(int id) {
        try {
            if (validarIdentificador(id)) {
                this.id = id;
            } else {
                System.out.println("Identificador de revisión inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el identificador de revisión");
        }
    }

    public void setIdentificadorVisita(int idVisita) {
        try {
            if (validarIdentificadorVisita(idVisita)) {
                this.idVisita = idVisita;
            } else {
                System.out.println("Identificador de visita en terreno inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el identificador de visita en terreno");
        }
    }

    public void setNombre(String nombre) {
        try {
            if (validarNombre(nombre)) {
                this.nombre = nombre;
            } else {
                System.out.println("Nombre alusivo a la revisión inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el nombre alusivo a la revisión");
        }
    }

    public void setDetalle(String detalle) {
        try {
            if (validarDetalle(detalle)) {
                this.detalle = detalle;
            } else {
                System.out.println("Detalle para revisar inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el detalle para revisar");
        }
    }

    public void setEstado(int estado) {
        try {
            if (validarEstado(estado)) {
                this.estado = estado;
            } else {
                System.out.println("Estado inválido");
            }
        } catch (Exception e) {
            System.out.println("Error al validar el estado");
        }
    }



}
