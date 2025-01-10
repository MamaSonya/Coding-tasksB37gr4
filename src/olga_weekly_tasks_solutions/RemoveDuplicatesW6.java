package olga_weekly_tasks_solutions;

public class RemoveDuplicatesW6 {

     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    //Vira is volunteer

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
}
