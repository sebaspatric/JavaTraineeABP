package Models;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(int run) {
        int index = -1; // Índice inicializado en -1 para verificar si se encontró el usuario
        for (int i = 0; i < asesorias.size(); i++) {
            Asesoria asesoria = asesorias.get(i);
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (usuario.getRun() == run) {
                    index = i;
                    break; // Termina el bucle una vez que se encuentra el usuario
                }
            }
        }

        if (index != -1) {
            asesorias.remove(index);
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("No se encontró un usuario con el RUN especificado.");
        }
    }

    public void listarUsuarios() {
        System.out.println("Lista de Usuarios:");
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario usuario) {
                System.out.println(usuario);
            }
        }
    }

    public void listarUsuariosPorTipo(String tipoUsuario) {
        System.out.println("Lista de " + tipoUsuario + "s:");
        for (Asesoria asesoria : asesorias) {
            if (esTipoUsuario(asesoria, tipoUsuario)) {
                System.out.println(asesoria);
            }
        }
    }

    private boolean esTipoUsuario(Asesoria asesoria, String tipoUsuario) {
        if (tipoUsuario.equalsIgnoreCase("Cliente") && asesoria instanceof Cliente) {
            return true;
        } else if (tipoUsuario.equalsIgnoreCase("Administrativo") && asesoria instanceof Administrativo) {
            return true;
        } else if (tipoUsuario.equalsIgnoreCase("Profesional") && asesoria instanceof Profesional) {
            return true;
        }
        return false;
    }


    public void listarCapacitaciones() {
        System.out.println("Lista de Capacitaciones:");
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println("Capacitación ID: " + capacitacion.getId());
            System.out.println("Cliente: " + encontrarClientePorRut(capacitacion.getRutCliente()));
            // Mostrar otros detalles de la capacitación si es necesario
            System.out.println("---------------------");
        }
    }

    private String encontrarClientePorRut(int rutCliente) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Cliente && ((Cliente) asesoria).getRUT() == rutCliente) {
                return asesoria.toString();
            }
        }
        return "Cliente no encontrado";
    }





}





        // Resto de métodos de la clase Contenedor.
