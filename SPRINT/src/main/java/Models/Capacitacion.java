package Models;

import static Validation.ValCap.*;

public class Capacitacion {
    private int id;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    //constructor
    public Capacitacion() {
    }

    public Capacitacion(int id, int rutCliente, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
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

        edadMensaje = "La capacitación será en: "+getLugar()+", a las "+getHora()+" del día "+getDia()+", y durará "+getDuracion()+" minutos";
        return edadMensaje;
    }



    //metodos accesadores y mutadores
    //metodos getter and setter

    public int getId() {
        return id;
    }

    //public void setId(int id) {
        //    this.id = id;
        //}

    public int getRutCliente() {
        return rutCliente;
    }

    // public void setRutCliente(int rutCliente) {
        //    this.rutCliente = rutCliente;
        //}

    public String getDia() {
        return dia;
    }

        //public void setDia(String dia) {
        //this.dia = dia;
        //}

    public String getHora() {
        return hora;
    }

    //public void setHora(String hora) {
    //    this.hora = hora;
    //}

    public String getLugar() {
        return lugar;
    }

   // public void setLugar(String lugar) {
   //     this.lugar = lugar;
   // }

    public int getDuracion() {
        return duracion;
    }

    //public void setDuracion(int duracion) {
    //    this.duracion = duracion;
    //}

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    //public void setCantidadAsistentes(int cantidadAsistentes) {
    //    this.cantidadAsistentes = cantidadAsistentes;
    //}

        public void setId(int id) {
            if (validarIdentificador(id)) {
                this.id = id;
            } else {
                System.out.println("Identificador inválido");
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
            if (validarDia(dia)) {
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

        public void setDuracion(int duracion) {
            if (validarDuracion(duracion)) {
                this.duracion = duracion;
            } else {
                System.out.println("Duración inválida");
            }
        }

        public void setCantidadAsistentes(int cantidadAsistentes) {
            if (validarCantidadAsistentes(cantidadAsistentes)) {
                this.cantidadAsistentes = cantidadAsistentes;
            } else {
                System.out.println("Cantidad de asistentes inválida");
            }
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
