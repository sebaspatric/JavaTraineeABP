import java.util.Scanner;

public class ABP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean readmanual;
		boolean procedseg;
		boolean acc;
		
		//lectura de datos y llenar el array
		System.out.println("Si layo el manual ingrese true sino ingrese false ");
		readmanual=sc.nextBoolean();
		System.out.println("Si siguió los procedimientos ngrese true sino ingrese false ");
		procedseg=sc.nextBoolean();
		
		if (readmanual==false || procedseg==false) {
			acc=true;
		} else {acc=false;}	
			
		if (acc==true) {
			System.out.println(acc+" hay accidentes");
		} else {
			System.out.println(acc+" no hay accidentes");
		}

	}

}
