package CLASES;// import java.awt.Robot;
// import java.awt.event.KeyEvent;
// import java.io.IOException;
//import java.util.ArrayList;
import java.util.Scanner;


public class MenuPrincipal2 {
	
	// clase para limpiar pantalla	
	public static void cls(){
		//https://es.stackoverflow.com/questions/529856/limpiar-la-consola-en-java
		try { 
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
		} catch (Exception e) { 
			/*No hacer nada*/ 
		} 
			/*Introduce tu código desde aquí*/ 
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var;
		String var2;
		Scanner sc = new Scanner(System.in);
		menuPrincipal(Tablero.matriz);
	}

	//----------------------------------------------------

	static void menuPrincipal(char[][] matriz) {
		int var;
		String var2;
		Scanner sc = new Scanner(System.in);
		String muestra;
		String cuenta;
		//while(opcion != 5) {

		//}
		do{///inicio do while
			cls();
			//System.out.flush();
			System.out.println("MENU PRINCIPAL");
			System.out.println("1. Crear tablero con carros");
			System.out.println("2. Mostrar tablero");
			System.out.println("3. Calcular Puntaje");
			System.out.println("4. Lanzar huevo");
			System.out.println("5. Hacer varios lanzamientos");
			System.out.println("6. Salir");
			System.out.println("Elija su opcion (1-6)");
			var=sc.nextInt();
			var2="";
			switch (var) {
				case 1 -> {
					System.out.println("Crear tablero con carros");
					Tablero.crearCarro();
				}
				case 2 -> {
					System.out.println("Mostrar tablero");
					//String muestra;
					Tablero.mostrarMatriz();

				}
				case 3 -> {
					System.out.println("Calcular Puntaje");
					//String cuenta;
					Tablero.calcularPuntaje();
				}
				case 4 -> {
					System.out.println("Lanzar huevo");
					//modificar RUT
					Tablero.lanzarHuevo();
				}
				case 5 -> {
					System.out.println("Hacer varios lanzamientos");
					Lanzamientos.lanzamiento();
				}
				case 6 -> System.out.println("Esta a punto de salir del sistema");
				default -> System.out.println("Opcion no valida");
			}
			System.out.println("Presione Cualquier tecla para continuar");
			var2=sc.nextLine();
			var2=sc.nextLine();

		}while(var!=6);//fin while
	}
}
