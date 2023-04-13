import Clases.Trabajador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Trabajador tr;
        tr = new Trabajador("Carlos", "Montes",
                "16200916-8", 99969854, 25);
        System.out.println(tr);

        System.out.println(tr.nombreCompleto());

        System.out.println(tr.descomponerRUN());



    }
}