package SilviWeeklyTask;

public class FrequencyOfCars_W5 {
    /*

    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    Andrea is volunteer
*/
    public static String FrequencyOfChars(String input){
        String output = "";
        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;
            //count consecutive characters
            while (i + 1 < input.length() && input.charAt(i + 1) == currentChar) {
                i++;
                count++;
            }
            //Concatenate the count and character to the result string
            output += count + "" + currentChar+" ";
        }
        return output;
        }
        public static void main(String[] args) {
            String input = "AAAABBBCDDDDEEEF";
            System.out.println(FrequencyOfChars(input));
    }
}
