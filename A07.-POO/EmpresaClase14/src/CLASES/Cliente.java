package CLASES;

public class Cliente {
    //Atributos
    private Integer RUT;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String AFP;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    //constructores
    //Un constructor que no reciba parámetros
    public Cliente() {
    }


    //Un constructor que reciba todos los atributos de la clase como parámetros

    public Cliente(Integer RUT, String nombres, String apellidos, int telefono, String AFP, int sistemaSalud, String direccion, String comuna, int edad) {
        this.RUT = RUT;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
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

    public void setRUT(Integer RUT) {
        this.RUT = RUT;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //Método toString()


    @Override
    public String toString() {
        return "Cliente{" +
                "RUT=" + RUT +
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
}
