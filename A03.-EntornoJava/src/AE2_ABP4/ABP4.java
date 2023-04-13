package AE2_ABP4;

/**

 a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10)) ----> TRUE
            v                10           =  10
            v			+		          v  = v
 
 b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3)) ----> TRUE
 			No(7 < 7)	&&  No(F +         V    &&   F )	
 				No(F)	&&   No(F +            F)
 				V		&&    V	=    V
 
 c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)  ----> TRUE
 		 (   3           >   14 ) +        (  5 < 20   )
 		 				F          + 			V       = V 
 
 * */

public class ABP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a;
		boolean b;
		boolean c;
	    String frase = "Hola mundo";
		a = (('A' > 'B') || frase.length()==10);
		System.out.println("El valor de a is: "+a);
		System.out.println("'A' > 'B' is: "+('A' > 'B'));
		System.out.println("frase.length()==10 is: "+(frase.length()==10));
		
		b=!((5 + 2) < 7) && !((7 > 9) || (3 < 5) && (4 == 3));
		System.out.println("El valor de b is: "+b);
		
		c = ((2 * 3 + 5 -7) > (2 * (2 + 5)) || ((10 - 5) < 20));
		System.out.println("El valor de c is: "+c);
	}
}
