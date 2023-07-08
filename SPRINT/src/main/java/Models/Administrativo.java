package Models;

import static Validation.ValAdm.esAreaValida;

public class Administrativo extends Usuario {
    //atributos
    private String area;
    private String experienciaPrevia;

    //constructores
    //CONSTRUCTOR VACIO
    public Administrativo() {
    }

    public Administrativo(String nombre, String fechaNacimiento, int RUN, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, RUN);
        //this.area = area;
        //this.experienciaPrevia = experienciaPrevia;
        setArea(area);
        setExperienciaPrevia(experienciaPrevia);
    }

    //METODO analizarUsuario()
    @Override
        public String analizarUsuario() {
            return "Administrativo{"+"Super usuario='" + super.analizarUsuario()+
                    "area='" + area + '\'' +
                    ", experienciaPrevia='" + experienciaPrevia + '\'' +
                    '}';
        }


    //metodos getter and setter
    //metodos getter and setter

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (!esAreaValida(area)) {
            System.out.println("Área inválida");
        } else {
            this.area = area;
        }
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }


    //metodo TOSTRING

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
