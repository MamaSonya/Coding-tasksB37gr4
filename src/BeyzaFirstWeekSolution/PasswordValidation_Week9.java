package BeyzaFirstWeekSolution;

public class PasswordValidation_Week9 {



    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */

    //Beyza is volunteer

    public static boolean validPassword(String password){

       boolean isUpperCaseLetter = password.matches(".*[A-Z].*");    //at least one uppercase
       boolean isLowerCaseLetter = password.matches(".*[a-z].*");   //at least one lowercase
       boolean isSpecialCharacters = password.matches(".*[^a-zA-Z0-9].*");
       boolean isContainDigit = password.matches(".*\\d.*");  //at least one digit
        //   \\d --> for any digit  .* .* before and after any

        /*
        The caret ^ at the beginning means it will match any character that is not in the ranges a-z, A-Z, or
        0-9 (which are lowercase letters, uppercase letters, and digits).
     Therefore, [^a-zA-Z0-9] matches any character that is not a letter or digit, which is what you define as a "special character".
         */



        if(password.length() >=6 && !password.contains(" ") ){
            if(isLowerCaseLetter  && isUpperCaseLetter && isSpecialCharacters && isContainDigit ) {
                return true;
            }
        }

        return false;

    }






    public static void main(String[] args) {

        String b = "Beyza.125";
        System.out.println("validPassword(b) = " + validPassword(b));

        String invalid = "100";
        System.out.println("validPassword(invalid) = " + validPassword(invalid));


    }














}
