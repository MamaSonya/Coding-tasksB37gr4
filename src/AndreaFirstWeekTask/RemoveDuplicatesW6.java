package AndreaFirstWeekTask;

public class RemoveDuplicatesW6 {

     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    //Vira is volunteer

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
}
