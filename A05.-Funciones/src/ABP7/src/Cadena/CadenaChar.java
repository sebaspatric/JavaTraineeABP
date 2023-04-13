package ABP7.src.Cadena;

import javax.swing.*;

/***
 *Desarrolle un programa en lenguaje Java tal que,
 * al ingresar una cadena de texto o String por teclado,
 * tome dicha cadena y la lea carácter por carácter,
 * y los despliegue por consola.
 * Al finalizar el programa,
 * debe ser indicar la cantidad de vocales y la cantidad de consonantes.
 * Nota 1: Se debe validar que la cadena ingresada no esté vacía;
 * si eso sucede, debe pedirlo nuevamente.
 * Nota 2: Recuerde que para obtener un carácter de un String
 * puede usar el método CharAt.
 */

public class CadenaChar {
    public static void main(String[] args) {

        System.out.println("-------TEXTO--------");
        String texto = "";
        texto = JOptionPane.showInputDialog("Ingresa un texto");
        texto = compruebaTexto(texto);
        //System.out.println(texto);

        System.out.println("----------VOCALES------------");
        //cantidad de vocales -----------------------------------
        int countVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            //countVocales=0;
            char c = texto.charAt(i);
            if (c == 'a'|| c=='e'|| c=='i'||c=='o'||c=='u'||
            c == 'A'|| c=='E'|| c=='I'||c=='O'||c=='U'){
                countVocales++;
            }
            //System.out.println(countVocales);
        }
        System.out.println("cantidad de vocales: "+countVocales);

        //con metodo cantidad de vocales -----------------------------------
        int cuentaV;
        cuentaV = cuentaVocales(texto);
        System.out.println("cantidad de vocales: "+cuentaV);

        //----------------------------------------------------------

        System.out.println("----------CONSONANTES------------");
        //cantidad de consonantes
        int contConsonants = 0;
        for (int i = 0; i < texto.length(); i++) {
            //countVocales=0;
            char c = texto.charAt(i);
            if (c != 'a'&& c!='e'&& c!='i'&&c!='o'&&c!='u'&&
                    c != 'A'&& c!='E'&& c!='I'&&c!='O'&&c!='U'){
                contConsonants++;
            }
            //System.out.println(countVocales);
        }
        System.out.println("cantidad de Consonants: "+contConsonants);


        //con metodo cantidad de consonantes -----------------------------------

        int cuentaC;
        cuentaC = cuentaConsonant(texto);
        System.out.println("cantidad de consonantes: "+cuentaC);
        //----------------------------------------------------------



    }
    //método comprueba texto vacío----------------------------------------
    public static String compruebaTexto(String text){
        while (text.isEmpty()){
            System.out.println("El texto esta vacío");
            text = JOptionPane.showInputDialog("Ingresa un texto");
        }
        System.out.println("El texto es: "+text);
        return text;
    }


    //con metodo cantidad de vocales -----------------------------------
    public static int cuentaVocales(String text) {
        int countVocales = 0;
        for (int i = 0; i < text.length(); i++) {
            //countVocales=0;
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                countVocales++;
            }
            //return countVocales;
            //System.out.println(countVocales)
        }
        return countVocales;
    }

    //con metodo cantidad de consonantes -----------------------------------
    public static int cuentaConsonant(String text) {
        int contConsonants = 0;
        for (int i = 0; i < text.length(); i++) {
            //countVocales=0;
            char c = text.charAt(i);
            if (c != 'a'&& c!='e'&& c!='i'&&c!='o'&&c!='u'&&
                    c != 'A'&& c!='E'&& c!='I'&&c!='O'&&c!='U'){
                contConsonants++;
            }
            //System.out.println(countVocales);
        }
        return contConsonants;
    }




}
