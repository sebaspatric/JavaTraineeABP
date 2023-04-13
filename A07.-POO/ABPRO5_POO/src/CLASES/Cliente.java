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

    //metodos getter and setter



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
