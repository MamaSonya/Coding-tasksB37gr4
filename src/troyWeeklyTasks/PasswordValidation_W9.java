package troyWeeklyTasks;

public class PasswordValidation_W9 {



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

    public static boolean passwordIsValid(String password) {

        boolean hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                hasDigits = password.matches("(.*[0-9].*)"),
                hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

        if(password.length() >= 6 && !password.contains(" ")) {
            if (hasLowerCaseChar && hasUpperCaseChar && hasDigits && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }


    public static boolean passwordIsValid2(String password){
        boolean hasLowerCase =false,
                hasUpperCase=false,
                hasDigit=false,
                hasSpecialCh = false;

        if(password.length() >= 6 && !password.contains(" ")){
            for (int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                }else if(Character.isLowerCase(password.charAt(i))){
                    hasLowerCase = true;
                }else if(Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                }else if(!Character.isLetterOrDigit(password.charAt(i))) {
                    hasSpecialCh = true;
                }
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCh;
    }


}
