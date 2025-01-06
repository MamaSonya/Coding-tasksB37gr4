package AseyarWeeklyTasksRecent.ViraWeeklyTasks;

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

        System.out.println("Origin = " + removeDuplicates("AAABBBCCC"));


    }


}


