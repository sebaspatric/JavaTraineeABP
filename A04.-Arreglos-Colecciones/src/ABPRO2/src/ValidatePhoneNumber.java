package ABPRO2.src;

/**
 * Java Example Program to validate phone number
 */
//https://purocode.com/java-validar-numero-de-telefono/
public class ValidatePhoneNumber {

    public static void main(String[] args) {
        isValidPhoneNumber("754-3010");
        isValidPhoneNumber("75 3010");
        isValidPhoneNumber("001-541-754-3010");
        isValidPhoneNumber("755-253-3010");
        isValidPhoneNumber("9876543210");

        isValidPhoneNumber("7533010");
        System.out.println(isValidPhoneNumber("7533010"));
    }




    /**
     * Method to validate phone number of format NNNNNNNNNN, example 9876543210
     *
     * @param phone_number
     * @return true if phone_number is valid, false if not
     */

    //"\\d{3}-\\d{4}"
    //\d{3}-\d{3}-\d{3}-\d{4}
    //\d{10}
    static String countryCodeRegex = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
    // con números de teléfono de 10 dígitos.

    public static boolean isValidPhoneNumber(String phone_number){
        boolean isValid = phone_number.matches(countryCodeRegex);
        System.out.println(phone_number+" : "+isValid);
        return isValid;
    }


}