package ABPRO2.src;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M4ABPRO2 {

    //----------------------------------------------------------------------------------------------------------------------------------------------------
	//validacion de si es numérico o string
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RUT del cliente, 
		//su nombre, 
		//dirección, 
		//comuna y 
		//número de teléfono.
		
		//capacitacion
		//día, 
		//hora, 
		//lugar, 
		//duración y 
		//cantidad de asistentes.
		
		//debe mostrar por pantalla 
		//los datos de la empresa que pidió la capacitación, 
		//los datos de la capacitación misma, y 
		//la cantidad de personas menores a 25 años, 
		//entre 26 y 35 años y 
		//mayores a 35 años.


        //---------------------------------------------------
		//- RUT: corresponde a un número menor a 99.999.999
		
		System.out.println("CLIENTE ");
		
		String cadena=JOptionPane.showInputDialog("1.0 	Ingresa un rut: ");
		//validar que sea numerico
				while(!isNumeric(cadena)) {
					cadena=JOptionPane.showInputDialog("1.1 Ingresa un rut numero entero: ");
				}

        //---------------------------------------------------
		//condicion para ciclo si es numerico
		int rut =0;
        boolean stop;
                stop = false;
		while(!stop) {
			rut=Integer.parseInt(cadena);
			if(rut >= 99999999) {
				cadena=JOptionPane.showInputDialog("1.2	Ingresa un rut numero menor sin digito verificador	: ");
				while(!isNumeric(cadena)) {
					cadena=JOptionPane.showInputDialog("1.3 Ingresa un rut 	numero entero: ");
				}
			}
			else{
				System.out.println("El rut es: "+rut);
                //rut1 = rut;
				stop = true;}
		}

        //---------------------------------------------------
		//- Nombres: campo obligatorio
		
		String str1 =JOptionPane.showInputDialog("if 	Ingresa un nombre: ");
				
        while(str1.isEmpty() || str1 == null) {
        	str1 =JOptionPane.showInputDialog("while 	Ingresa un nombre: "); 	
        }
        System.out.println("The name is: "+str1);


        //---------------------------------------------------
		//- Dirección: texto no superior a 50 caracteres
		
        String dire =JOptionPane.showInputDialog("Ingresa una direccion: ");
        while(dire.length()> 	50) {
        	dire	 =JOptionPane.showInputDialog("Ingresa un texto menor a 50 caracteres: "); 	
        }
        System.out.println("The direccion is: "+dire);

        //---------------------------------------------------
		//- Comuna: campo obligatorio
		
        String comuna =JOptionPane.showInputDialog("Ingresa una Comuna: ");
        while(comuna.isEmpty() || comuna == null) {
        	comuna =JOptionPane.showInputDialog("while Ingresa una Comuna: "); 	
        }
        System.out.println("The comuna name	is: "+comuna);

        //---------------------------------------------------
        //- Teléfono: no más de 15 caracteres
        //con expr regulares
        //https://comoprogramar.club/java-regex-para-validar-el-numero-de-telefono/
    	String fono=JOptionPane.showInputDialog("1.0 	Ingresa un telefono: ");
		//validar que sea numerico
		while(isNumeric(fono) == false|| fono.length()> 15) {
			fono=JOptionPane.showInputDialog("1.1 Ingresa un telefono numero entero menos o = a 15 digitos: ");
		}    	
		System.out.println("El fono es: "+fono);


        //----------------------------CAPACITACION----------------------------------------------------------//
		System.out.println("---------------- ");
		System.out.println("----------------------------CAPACITACION-------------------------------------- ");


        //---------------------------------------------------
		//fecha
        //String fecha;
        //Scanner leer=new Scanner(System.in);
        boolean res;
        //res =true;
        System.out.println("Dame la fecha");
        //fecha=leer.next();
        String fecha;
        fecha =JOptionPane.showInputDialog("1.0 	Ingresa fecha en formato dd/MM/yyyy: ");
        res=dateValidator(fecha);
        while (!res) {
            System.out.println("La fecha no es valida");
            fecha =JOptionPane.showInputDialog("2.0 	Ingresa fecha en formato dd/MM/yyyy: ");
            res=dateValidator(fecha);
        }
        System.out.println("La fecha es valida");
        System.out.println("La fecha es: "+fecha);
        /*
        if(res==true){
            System.out.println("La fecha es valida");
            System.out.println("La fecha es: "+fecha);
             }else
                 System.out.println("La fecha no es valida");
        * */


        //---------------------------------------------------
        //hora
        //res=false;
        System.out.println("Dame la hora");
        //fecha=leer.next();
        String hora=JOptionPane.showInputDialog("1.0 	Ingresa la hora formato hh:mm ");
        res=timeValidator(hora);
        while (!res){
            System.out.println("La hora no es valida");
            res=timeValidator(hora);
        }
        System.out.println("La hora es valida");
        System.out.println("La hora es: "+hora+"hrs");


        /*
        if(res==true){
            System.out.println("La hora es valida");
            System.out.println("La hora es: "+hora);
        }else
            System.out.println("La hora no es valida");
        */



        //---------------------------------------------------
        //lugar
        String lugar;
        lugar=JOptionPane.showInputDialog("Ingresa el lugar de la capacitacion: ");
        while(lugar.isEmpty() || lugar == null) {
            lugar =JOptionPane.showInputDialog("while Ingresa el lugar: ");
        }
        System.out.println("The lugar name	is: "+lugar);
        //---------------------------------------------------
        //duración y
        String duracion;
        duracion=JOptionPane.showInputDialog("1.0 	Ingresa la duracion: ");
        //validar que sea numerico
        while(!isNumeric(duracion)) {
            duracion=JOptionPane.showInputDialog("1.1 Ingresa una duracion de numero entero: ");
        }
        System.out.println("The duracion is: "+duracion);
        //---------------------------------------------------
        //cantidad de asistentes.

        String cantAsistentes;
        cantAsistentes=JOptionPane.showInputDialog("1.0 	Ingresa cantidad de asistentes: ");
        //validar que sea numerico
        while(!isNumeric(cantAsistentes)) {
            cantAsistentes=JOptionPane.showInputDialog("1.1 Ingresa cantidad de asistentes de numero entero: ");
        }
        System.out.println("The cantidad asistentes es: "+cantAsistentes);


        //----------------------------ASISTENTES----------------------------------------------------------//
        System.out.println("----------------------------ASISTENTES---------------------------------------- ");

        //De acuerdo con la cantidad de asistentes anteriormente ingresada,
        // se debe solicitar y el nombre y edad de los asistentes.
        int cantidad;
        cantidad=Integer.parseInt(cantAsistentes);
        String[] nombres = new String[cantidad];
        String[] edades = new String[cantidad];


        //---------------------------------------------------
        //- Nombres: campo obligatorio

        String nombreAasistente;
        String edad;

        for (int i = 0; i < cantidad; i++){
            //-------------------------nombres-----------------
            nombreAasistente=JOptionPane.showInputDialog("if 	Ingresa un nombre del asistente: "+(i+1));
            while(nombreAasistente.isEmpty() || str1 == null) {
                nombreAasistente =JOptionPane.showInputDialog("while 	Ingresa un nombre del asistente: "+(i+1));
            }
            //System.out.println("The name is: "+nombreAasistente);
            nombres[i] = nombreAasistente;

            //-------------------------edad--------------
            //- Edad
            edad=JOptionPane.showInputDialog("1.0 	Ingresa la edad del asistente: "+(i+1));
            //validar que sea numerico
            while(!isNumeric(edad)) {
                edad=JOptionPane.showInputDialog("1.1 Ingresa una edad de numero entero: "+(i+1));
            }
            //System.out.println("The edad is: "+edad);
            edades[i] = edad;
            //System.out.println(edad);
        }

        // muestra las 2 listas
        System.out.println(Arrays.toString(nombres));

        for (int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i]);
            System.out.println(" - "+edades[i]);
        }

        //---------------------------------------------------

        /*
        * Finalizado este proceso, debe mostrar por pantalla los datos de la empresa que pidió la capacitación,
        * los datos de la capacitación misma,
        * y la cantidad de personas menores a 25 años,
        * entre 26 y 35 años
        * y mayores a 35 años
        * */


        //debe mostrar por pantalla
        //los datos de la empresa que pidió la capacitación,
        System.out.println("--------DATOS CLIENTE---------------");
        System.out.println("El rut es: "+rut+"\n"+
                "The name is: "+str1+"\n"+
                "The direccion is: "+dire+"\n"+
                "The comuna name	is: "+comuna+"\n"+
                "El fono es: "+fono);

        //los datos de la capacitación misma, y
        System.out.println("--------CAPACITACION---------------");
        System.out.println("La fecha es: "+fecha+"\n"+
                "La hora es: "+hora+"\n"+
                "The lugar name	is: "+lugar+"\n"+
                "The duration is: "+duracion+"\n"+
                "The cantidad asistentes es: "+cantAsistentes);
        //la cantidad de personas menores a 25 años,
        int menores25;
        int edades25;
        menores25 = 0;

        for (String edade : edades) {
            edades25 = Integer.parseInt(edade);
            if (edades25 < 25) {
                menores25++;
            }
        }
        System.out.println("La cantidad de menores de 25 es: "+menores25);

        //entre 26 y 35 años y
        int entre26y35;
        int edades26;
        entre26y35 = 0;
        for (String edade : edades) {
            edades26 = Integer.parseInt(edade);
            if (edades26 > 25 & edades26<36) {
                entre26y35++;
            }
        }
        System.out.println("La cantidad entre 26 y 35 años es: "+entre26y35);


        //mayores a 35 años.

        int mayores35;
        int edades35;
        mayores35 = 0;
        for (String edade : edades) {
            edades35 = Integer.parseInt(edade);
            if (edades35 > 35){
                mayores35++;
            }
        }
        System.out.println("La cantidad de asistentes mayores a 35 es: "+mayores35);






    }
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------
	// validacion para la fecha
	//https://www.lawebdelprogramador.com/codigo/Java/3902-Comprobar-que-una-fecha-sea-correcta.html#:~:text=Para%20que%20una%20fecha%20sea%20correcta%20es%20necesario%3A&text=El%20a
	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------

    //https://www.techiedelight.com/es/ validate-date-java/
    // Programa Java para validar una fecha en Java
    private static final String Date_REGEX =
            "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|" +
                    "(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))" +
                    "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3" +
                    "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
                    "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
                    "^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|" +
                    "2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final Pattern Date_PATTERN = Pattern.compile(Date_REGEX);

    public static boolean dateValidator(String date)
    {
        Matcher matcher = Date_PATTERN.matcher(date);
        return matcher.matches();
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------------

    //https://stackoverflow.com/questions/7536755/regular-expression-for-matching-hhmm-time-format
    //Regular expression for matching HH:MM time format
    private static final String Time_REGEX =
            "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$";
    private static final Pattern Time_PATTERN = Pattern.compile(Time_REGEX);

    public static boolean timeValidator(String date)
    {
        Matcher matcher = Time_PATTERN.matcher(date);
        return matcher.matches();
    }





}




















