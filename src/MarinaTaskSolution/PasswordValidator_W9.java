package MarinaTaskSolution;

public class PasswordValidator_W9 {
/*


    Write a function that can verify if a password is valid or not. requirements:
            1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false


 */


        public static boolean isValidPassword(String password) {
            // Check length and space requirement
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            // Define special characters
            String specialCharacters = "!@#$%^&*()-+=<>?/{}[]|\\;:'\",.";

            // Iterate through each character in the password
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpperCase = true;
                else if (Character.isLowerCase(ch)) hasLowerCase = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else if (specialCharacters.contains(String.valueOf(ch))) hasSpecialChar = true;
            }

            // Check all conditions
            return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(isValidPassword("Passw1@"));  // true
            System.out.println(isValidPassword("password")); // false (no uppercase, digit, or special char)
            System.out.println(isValidPassword("PASSWORD1")); // false (no lowercase, special char)
            System.out.println(isValidPassword("Pass word1@")); // false (contains space)
            System.out.println(isValidPassword("Short1!")); // true
        }
    }

