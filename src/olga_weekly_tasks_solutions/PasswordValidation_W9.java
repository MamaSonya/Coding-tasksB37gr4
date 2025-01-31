package olga_weekly_tasks_solutions;

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
    public static boolean isValidPassword(String password) {
        // Check if password length is at least 6 and contains no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check for at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check for at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check for at least one special character
        if (!password.matches(".*[\\W_].*")) {  // \\W matches non-word characters (special characters)
            return false;
        }

        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // If all checks pass, return true
        return true;
    }

    public static void main(String[] args) {
        // Test the method
        String password = "Example@123";
        System.out.println(isValidPassword(password));  // This will print true if the password is valid
    }


}
