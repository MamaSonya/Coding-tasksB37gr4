package valeriiaWeeklyTasks;

public class FindUniqueChars_W7 {

     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */


    public static String FindUniqueChars(String str) {

        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {//12 characters in str "AAABBBCCCDEF"

            // retrieve each character from string "A" "B"...
            char currentChar = str.charAt(i);

            //comparing index of first occurrence from the left and the first occurrence from the right
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString();
    }

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String result = FindUniqueChars(str);
        System.out.println(result); //"DEF"
    }






}


