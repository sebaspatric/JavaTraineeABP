import javax.swing.*;

public class Validacion {

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

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		//- RUT: corresponde a un número menor a 99.999.999
	
	
		String cadena=JOptionPane.showInputDialog("1.0 	Ingresa un rut: ");
		
		//validar que sea numerico
		while(isNumeric(cadena) == false) {
			cadena=JOptionPane.showInputDialog("1.1 Ingresa un rut numero entero: ");
		}
		//condicion para ciclo si es numerico
		boolean stop = false;	
		while(stop == false) {
			int rut=Integer.parseInt(cadena);
			if(rut >= 99999999) {
				cadena=JOptionPane.showInputDialog("1.2	Ingresa un rut numero menor sin digito verificador	: ");
				while(isNumeric(cadena) == false) {
					cadena=JOptionPane.showInputDialog("1.3 Ingresa un rut 	numero entero: ");
				}
			}
			else{
				System.out.println("El rut es: "+rut);
				stop = true;}
		}	
				
		//- Nombres: campo obligatorio
			
		String str1 =JOptionPane.showInputDialog("if 	Ingresa un nombre: ");
				
        while(str1.isEmpty() || str1 == null) {
        	str1 =JOptionPane.showInputDialog("while 	Ingresa un nombre: "); 	
        }
        System.out.println("The name is: "+str1);	
        
        
		//- Apellidos: campo obligatorio
        String str2 =JOptionPane.showInputDialog("if 	Ingresa un Apellido: ");
        while(str2.isEmpty() || str1 == null) {
        	str2	 =JOptionPane.showInputDialog("while 	Ingresa un Apellido: "); 	
        }
        System.out.println("The second name	 is: "+str1);	
        		
		
		
		//- Teléfono: no más de 15 caracteres
		
    	String fono=JOptionPane.showInputDialog("1.0 	Ingresa un telefono: ");
		//validar que sea numerico	
    
		while(isNumeric(fono) == false|| fono.length()> 	15) {
			fono=JOptionPane.showInputDialog("1.1 Ingresa un telefono numero entero menos o = a 15 digitos: ");
		}    	
		System.out.println("El rut es: "+fono);
		
		//- AFP: campo obligatorio	
		
		String afp =JOptionPane.showInputDialog("if 	Ingresa una AFP: ");
        while(afp.isEmpty() || str1 == null) {
        	afp	=JOptionPane.showInputDialog("while 	Ingresa una AFP: "); 	
        }
        System.out.println("The AFP is: "+afp);
		
		//- Sistema de salud: 1 (Fonasa) o 2 (Isapre), solo puede ser uno //de ambos valores
		
        String salud =JOptionPane.showInputDialog("Ingresa Sistema Salud: ");
        while(isNumeric(salud) == false|| salud == null) {
        	salud =JOptionPane.showInputDialog("Ingresa Sistema Salud: "); 	
        }
        
        stop = false;		
		while(stop == false) {
			int numsalud=Integer.parseInt(salud);
			if(numsalud> 2 ||numsalud <1) {
				salud=JOptionPane.showInputDialog("1.2	Ingresa sistema correspondiente numero 1 o 2: ");
				while(isNumeric(salud) == false) {
					salud=JOptionPane.showInputDialog("1.3 Ingresa un numero entero: ");
				}	
			}
			else{
				if(numsalud==1) {
					System.out.println("The salud sistem is: Fonasa");
				}
				else if(numsalud==2) {
					System.out.println("The salud sistem is: Isape");
				}
				stop = true;}
		}	
        
		
		//- Dirección: texto no superior a 50 caracteres
		
        String dire =JOptionPane.showInputDialog("Ingresa una direccion: ");
        while(dire.length()> 	50) {
        	dire	 =JOptionPane.showInputDialog("Ingresa un texto menor a 50 caracteres: "); 	
        }
        System.out.println("The direccion is: "+dire);	
        				
		
		//- Comuna: campo obligatorio
		
		
        String comuna =JOptionPane.showInputDialog("Ingresa una Comuna: ");
        while(comuna.isEmpty() || comuna == null) {
        	comuna =JOptionPane.showInputDialog("while Ingresa una Comuna: "); 	
        }
        System.out.println("The comuna name	is: "+comuna);	
        							
		
		//- Edad: menor a 120 años
		
        String Edad =JOptionPane.showInputDialog("Ingresa una edad: ");
        while(isNumeric(Edad) == false) {
        	Edad =JOptionPane.showInputDialog("Ingresa un numero entero: "); 	
        }
        
        stop = false;		
		while(stop == false) {
			int numedad=Integer.parseInt(Edad);
			if(numedad>=120) {
				Edad=JOptionPane.showInputDialog("1.2	Ingresa una edad menor a 120: ");
				while(isNumeric(Edad) == false) {
					Edad=JOptionPane.showInputDialog("1.3 Ingresa un numero entero: ");
				}	
			}
			else{
				System.out.println("The edad is: "+numedad);
				stop = true;}
		}
		

	}

}
