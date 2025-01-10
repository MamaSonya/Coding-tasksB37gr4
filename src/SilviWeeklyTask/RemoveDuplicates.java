package SilviWeeklyTask;

public class RemoveDuplicates {

    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        String origin = "";

        for (int i = 0; i < str.length(); i++) {
            if (origin.indexOf(str.charAt(i)) == -1) {
                origin += str.charAt(i);
            }
        }
        return origin;



    }

    public static void main(String[] args) {

        System.out.println("Origin = " + removeDuplicates("AAABBBCCCDDDDFFFFEEEE"));


    }


    /*
     public static String removeDuplicated(String inputStr) {
        StringBuilder result = new StringBuilder();
        for (char a : inputStr.toCharArray()) {
            if (result.indexOf(String.valueOf(a)) == -1) {
                result.append(a);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        System.out.println(removeDuplicated(input));  // Output: ABC
    }
     */


    /*
     public static String removeDuplicates(String str) {
            String result = "";
            for (char ch : str.toCharArray()) {
                if (!result.contains(ch + "")) result += ch;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(removeDuplicates("AAABBCDD")); // Output: ABCD
        }
     */


    /*
     public static String removeDup(String str) {
        // Variable to hold the result
        String result = "";

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char currentChar = str.charAt(i);

            // If the result does not contain the current character, add it
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        // Return the result string
        return result;
    }

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = removeDup(str);
        System.out.println("Result: " + result); // Expected Output: ABC

    }
     */
}
