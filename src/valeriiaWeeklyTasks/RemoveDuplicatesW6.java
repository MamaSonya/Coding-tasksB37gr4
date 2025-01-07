package valeriiaWeeklyTasks;

/*
 Write function that can remove the duplicated values from String
         Ex: removeDup("AAABBBCCC") ==> ABC
  */
public class RemoveDuplicatesW6 {

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (j == i) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
}



