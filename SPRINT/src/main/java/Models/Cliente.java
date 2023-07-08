package Models;

import java.util.ArrayList;
import java.util.List;

import static Validation.ValCliente.*;

public class Cliente extends Usuario {
    //Atributos
    private Integer RUT;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String AFP;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    private List<Capacitacion> capacitaciones;
    private List<Accidente> accidentes;
    private List<VisitaTerreno> visitasTerreno;

    //constructores
    //Un constructor que no reciba parámetros
    public Cliente() {
    }


    //Un constructor que reciba todos los atributos de la clase como parámetros


    public Cliente(String nombre, String fechaNacimiento, int run, Integer RUT, String nombres, String apellidos, String telefono, String AFP, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        /*
        this.RUT = RUT;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
        * */
        setRUT(RUT);
        setNombres(nombres);
        setApellidos(apellidos);
        setTelefono(telefono);
        setAFP(AFP);
        setSistemaSalud(sistemaSalud);
        setDireccion(direccion);
        setComuna(comuna);
        setEdad(edad);
        this.capacitaciones = new ArrayList<>();
        this.accidentes = new ArrayList<>();
        this.visitasTerreno = new ArrayList<>();

    }

    public void tomarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void registrarAccidente(Accidente accidente) {
        accidentes.add(accidente);
    }

    public void agregarVisitaTerreno(VisitaTerreno visitaTerreno) {
        visitasTerreno.add(visitaTerreno);
    }


    //metodo analizarUsuario()
    @Override
    public String analizarUsuario() {
        return "Cliente{"+"Super usuario='" +super.analizarUsuario()+"|"+ '\'' +
                ", RUT=" + RUT +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", AFP='" + AFP + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    ///metodos obtenerNombre()
    public String obtenerNombre() {
        String nombreCompleto = nombres+" "+apellidos;
        return nombreCompleto;
    }

    //metodos obtenerSistemaSalud()
    public String obtenerSistemaSalud() {
        //codigo obtener sistema salud--------------------

        String sistemaSalud = null;
        int numsalud = getSistemaSalud();

        if(numsalud> 2 ||numsalud <1) {
            //------------------------------
            sistemaSalud = "Sistema salud debe ser 1 o 2 ";
        }
        else{
            if(numsalud==1) {
                System.out.println("The salud sistem is: Fonasa");
                sistemaSalud = "Fonasa";
            }
            else if(numsalud==2) {
                System.out.println("The salud sistem is: Isapre");
                sistemaSalud = "Isapre";
            }
        }
        //-------------------------------------
        return sistemaSalud;
    }


    //metodos accesadores y mutadores
    //metodos getter and setter

    public Integer getRUT() {
        return RUT;
    }

   // public void setRUT(Integer RUT) {
   //     this.RUT = RUT;
   // }

    public String getNombres() {
        return nombres;
    }

   // public void setNombres(String nombres) {
   //     this.nombres = nombres;
    //}

    public String getApellidos() {
        return apellidos;
    }

    //public void setApellidos(String apellidos) {
    //    this.apellidos = apellidos;
    //}

    public String getTelefono() {
        return telefono;
    }

    //public void setTelefono(int telefono) {
    //    this.telefono = telefono;
    //}

    public String getAFP() {
        return AFP;
    }

    //public void setAFP(String AFP) {
    //    this.AFP = AFP;
    //}

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    //public void setSistemaSalud(int sistemaSalud) {
    //    this.sistemaSalud = sistemaSalud;
    //}

    public String getDireccion() {
        return direccion;
    }

    //public void setDireccion(String direccion) {
    //    this.direccion = direccion;
    //}

    public String getComuna() {
        return comuna;
    }

    //public void setComuna(String comuna) {
    //    this.comuna = comuna;
    //}

    public int getEdad() {
        return edad;
    }

    //public void setEdad(int edad) {
    //    this.edad = edad;
    //}

    // Setters
    // Setters
    public void setRUT(int RUT) {
        if (!validarRut(RUT)) {
            System.out.println("RUT inválido");
        } else {
            this.RUT = RUT;
        }
    }

    public void setNombres(String nombres) {
        if (!sonNombresValidos(nombres)) {
            System.out.println ("Nombres inválidos");
        } else {
            this.nombres = nombres;
        }
    }

    public void setApellidos(String apellidos) {
        if (!sonApellidosValidos(apellidos)) {
            System.out.println ("Apellidos inválidos");
        } else {
            this.apellidos = apellidos;
        }
    }

    public void setTelefono(String telefono) {
        if (!esTelefonoValido(telefono)) {
            System.out.println("Teléfono inválido");
        } else {
            this.telefono = telefono;
        }
    }

    public void setAFP(String AFP) {
        if (!esAfpValido(AFP)) {
            System.out.println("AFP inválido");
        } else {
            this.AFP = AFP;
        }
    }

    public void setSistemaSalud(int sistemaSalud) {
        if (!esSistemaSaludValido(sistemaSalud)) {
            System.out.println("Sistema de salud inválido");
        } else {
            this.sistemaSalud = sistemaSalud;
        }
    }

    public void setDireccion(String direccion) {
        if (!esDireccionValida(direccion)) {
            System.out.println("Dirección inválida");
        } else {
            this.direccion = direccion;
        }
    }

    public void setComuna(String comuna) {
        if (!esComunaValida(comuna)) {
            System.out.println("Comuna inválida");
        } else {
            this.comuna = comuna;
        }
    }

    public void setEdad(int edad) {
        if (!esEdadValida(edad)) {
            System.out.println ("Edad inválida");
        } else {
            this.edad = edad;
        }
    }

    //Método toString()


    @Override
    public String toString() {
        return "Cliente{" +
                "RUT=" + RUT +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", AFP='" + AFP + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
    }
}
