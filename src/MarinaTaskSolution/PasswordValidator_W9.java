package MarinaTaskSolution;

public class PasswordValidator_W9 {


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

