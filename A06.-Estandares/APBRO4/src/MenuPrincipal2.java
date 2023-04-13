// import java.awt.Robot;
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
		menuPrincipal(Main.lista);
	}

	//----------------------------------------------------

	static void menuPrincipal(String[][] lista) {
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
			System.out.println("1. Registrar usuario");
					System.out.println("2. Mostrar usuarios");
			System.out.println("3. Contar usuarios por categoría");
			System.out.println("4. Modificar usuarios");
			System.out.println("5. Eliminar usuario");
			System.out.println("6. Salir");
			System.out.println("Elija su opcion (1-6)");
			var=sc.nextInt();
			var2="";
			switch (var) {
				case 1 -> {
					System.out.println("Registrar usuario");
					Main.registroUsuario(lista);
					MostrarUsuarioPrueba.mostrarUsuarios1(lista);
				}
				case 2 -> {
					System.out.println("Generando Listados");
					//String muestra;
					muestra = Main.mostrarUsuarios(lista);
					System.out.println(muestra);
				}
				case 3 -> {
					System.out.println("Contar usuarios por categoría");
					//String cuenta;
					cuenta = Main.contarUsuariosPorCategoria(lista);
					System.out.println(cuenta);
				}
				case 4 -> {
					System.out.println("Modificar usuarios");
					//modificar RUT
					Main.modificarUsuario(lista);
				}
				case 5 -> {
					System.out.println("Eliminar usuario");
					Main.eliminarUsuario(lista);
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
