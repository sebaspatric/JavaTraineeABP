package Clases;

/***
 * Sebastian Menares
 */
public class Trabajador {

    // atributos
    private String nombres;
    private String apellidos;
    private  String RUN;
    private int telefono;
    private int edad;



    //Constructor vacio
    public Trabajador() {
        
    }

    //Constructor con atributos

    public Trabajador(String nombres, String apellidos, String RUN, int telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.RUN = RUN;
        this.telefono = telefono;
        this.edad = edad;
    }


    //metodos getter and setter

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

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trabajador{");
        sb.append("nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", RUN='").append(RUN).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    //metodo nombre completo
    public String nombreCompleto() {
        /***
         * debe retornar la concatenación de los nombres y apellidos del usuario.
         */
        String nombreCompleto;
        nombreCompleto = nombres+" "+apellidos;
        return nombreCompleto;
    }

    //descomponer RUN
    public int descomponerRUN() {
        /***
         * debe retornar un número entero correspondiente a todo
         * lo que está en el RUN antes del guion y del dígito verificador.
         */
        String RUN1;
        RUN1 = "";
        for (int i = 0; i <RUN.length(); i++) {
            char c = RUN.charAt(i);
            if (c != '-') {
                RUN1 += c;
            } else {
                break;
            }
        }
        int RUNout;
        //assert RUN1 != null;
        RUNout = Integer.parseInt(RUN1);
        //return RUNout;
        return RUNout;
    }




}
