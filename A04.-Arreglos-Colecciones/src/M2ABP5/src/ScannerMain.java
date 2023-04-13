package M2ABP5.src;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Introduce un 1er número: ");
        int a = scanner.nextInt();
        System.out.println("Introduce un 2do número: ");
        int b = scanner.nextInt();
        System.out.println("""
                Introduce un signo operador\s
                • Suma (+)
                • Resta (-)
                • Multiplicación (x)
                • División (:)
                • Módulo (/)""");
       //String letra = scanner.nextLine();
        scanner.nextLine();
        String signo = scanner.nextLine();
        int result;
        switch(signo){
           case "+":
               result =a+b;
               System.out.printf("%d + %d = %d", a, b, result);
               break;
           case "-":
               result = a-b;
               System.out.printf("%d - %d = %d", a, b, result);
               break;
           case "x":
               result= a*b;
               System.out.printf("%d x %d = %d", a,b,result);
               break;
           case ":":
               result = a/b;
               System.out.printf("%d : %d = %d", a, b, result);
               break;
           case "/":
               result = a%b;
               System.out.printf("%d / %d = %d", a, b, result);
               break;
           default:
               //scanner.nextLine();
               System.out.println("No es valido");
        }



    }


}
