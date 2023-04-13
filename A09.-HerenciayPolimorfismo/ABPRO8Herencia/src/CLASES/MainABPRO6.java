package CLASES;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;
//import java.sql.Timestamp;

public class MainABPRO6 {
    //Por último, debe crear una clase adicional que contenga un método main(),
    // a través del cual se cree
    //una instancia de cada clase,
    // y se desplieguen sus datos a través del método toString().
    public static void main(String[] args) throws ParseException {
        Capacitacion capacitacion = new Capacitacion();
        System.out.println(capacitacion.toString());

        Cliente cliente = new Cliente();
        System.out.println(cliente.toString());

        Usuario usuario = new Usuario();
        System.out.println(usuario.toString());

        System.out.println("-----------------------------------------------------------------------");

       // - Cree dos instancias de cada clase, usando los dos constructores y mutadores existentes

        Capacitacion capacitacion1 = new Capacitacion();
        Capacitacion capacitacion2 = new Capacitacion();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

       //- Debe desplegar los datos de los objetos a través del método toString().
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(capacitacion1.toString());
        System.out.println(capacitacion2.toString());




        // - Modifique un atributo a elección de cada clase

        usuario1.setNombre("marcelo");
        cliente1.setComuna("maipu");
        capacitacion1.setLugar("valparaiso");

       //- Despliegue los datos de cada objeto, esta vez usando métodos accesores.
        String u1, cl1, ca1;
        u1 = usuario1.getNombre();
        System.out.println(u1);

        cl1 = cliente1.getComuna();
        System.out.println(cl1);

        ca1 = capacitacion1.getLugar();
        System.out.println(ca1);
        System.out.println(cliente1.toString());

        //
        // Procure asimismo desplegar el resultado de los métodos recién creados.
        //cliente1    = new Cliente(1515151, "asadasd", "asda", 151, "asda", 1, "äsd", "asd", 18);

        String f1, f2, f3, f4;
        cliente1.setNombres("Rodolfo");
        cliente1.setApellidos("Pelluco");
        f1 = cliente1.obtenerNombre();
        System.out.println("El nombre es: "+f1 );

        cliente1.setSistemaSalud(1);
        f2 = cliente1.obtenerSistemaSalud();
        System.out.println("El sistema salud es: "+f2 );

        LocalDate localDate2 = LocalDate.of(2020, 02, 20);


        usuario1.setFechaNacimiento(localDate2);
        f3 = usuario1.mostrarEdad();
        System.out.println(f3);

        Date fecha1 = new Date(2021,01, 20);
        //SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        // Conversion de string a date
        //String Dateinicio     = request.getParameter("addtimeinicio");
        String  requestDate = "2023-04-15";
        LocalDate myDate = LocalDate.parse(requestDate);
        LocalDate currentDate = LocalDate.now();
        System.out.println(myDate);

        long numberOFDays = DAYS.between(currentDate, myDate);

        System.out.println(String.format("The diff of days is %d",numberOFDays));

        Time t = new Time(11, 15, 5);

        capacitacion1.setDuracion(10);
        capacitacion1.setHora(t);

        capacitacion1.setDia(myDate);

        f4 = capacitacion1.mostrarDetalle();
        System.out.println("detalle: "+f4 );

        System.out.println("---------------------");
        //https://www.lawebdelprogramador.com/foros/Java/1539642-Introducir-Fecha.html
        String entrada = "12/03/2016"; // Entrada recogida como sea (scanner)
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
        Date fecha = format.parse(entrada); // Creamos un date con la entrada en el formato especificado
        System.out.println(fecha);





    }
}
