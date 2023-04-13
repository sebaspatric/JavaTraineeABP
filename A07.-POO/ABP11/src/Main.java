import Clases.Trabajador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Cree tres instancias (objetos) de la clase Trabajador,
        // usando el controlador respectivo para este caso
        Trabajador tr1, tr2, tr3;
        tr1 = new Trabajador("Carlos", "Montes",
                "16200916-8", 99969854, 25);
        tr2 = new Trabajador("Benjamin", "Perez", "8200916-2",
                9969885, 27);
        tr3 = new Trabajador("Matias", "Escobar",
                "15300916-8", 88869854, 35);

        //Despliegue por consola el contenido de cada objeto usando el método toString().
        System.out.println(tr1.toString());
        System.out.println(tr2.toString());
        System.out.println(tr3.toString());

        System.out.println(tr2.nombreCompleto());

        System.out.println(tr2.descomponerRUN());



    }
}