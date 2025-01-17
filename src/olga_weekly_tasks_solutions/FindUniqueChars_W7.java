package olga_weekly_tasks_solutions;

public class FindUniqueChars_W7 {

     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static String unique(String str) {
        String uniqueChars = "";

        // Traverse the string to find unique characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character appears only once in the remaining part of the string
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                uniqueChars += ch;  // Append character to result string
            }
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = unique(input);
        System.out.println("Unique characters: " + result);  // Output: DEF
    }

    //Valeria is volunteer
}
