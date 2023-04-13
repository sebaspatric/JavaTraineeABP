package CLASES;

public class Main {
    //Por último, debe crear una clase adicional que contenga un método main(),
    // a través del cual se cree
    //una instancia de cada clase,
    // y se desplieguen sus datos a través del método toString().
    public static void main(String[] args) {
        Capacitacion capacitacion = new Capacitacion();
        System.out.println(capacitacion.toString());

        Cliente cliente = new Cliente();
        System.out.println(cliente.toString());

        Usuario usuario = new Usuario();
        System.out.println(usuario.toString());
    }
}
