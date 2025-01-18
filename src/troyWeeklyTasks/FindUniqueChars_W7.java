package troyWeeklyTasks;

public class FindUniqueChars_W7 {

     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    //Valeria is volunteer

    public static String uniqueChar(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) { // AAABBBCCCDEF
            int num = 0;
            for (int i = 0; i < arr.length; i++) { // AAABBBCCCDEF
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) { // if it is unique
                unique1 += arr[j];
            }
        }

        return unique1;
    }


    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABBBCCCDEF"));

    }




}
