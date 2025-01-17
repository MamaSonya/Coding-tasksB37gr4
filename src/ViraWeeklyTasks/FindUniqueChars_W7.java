package AseyarWeeklyTasksRecent.ViraWeeklyTasks;

public class FindUniqueChars_W7 {

     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static String findUniqueChars(String str) {

        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                uniqueChars += ch;
            }
        }
        return uniqueChars;

    }

    public static void main(String[] args) {
        System.out.println("Unique chars: " + findUniqueChars("AAABBBCCCDEF"));
    }
}
