package BeyzaFirstWeekSolution;

public class CharFrequency_W5 {

    /*
        Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        Andrea is volunteer
    */


    public static String FrequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();

        while (str.length() > 0) {
            char ch = str.charAt(0);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {  // Counting how many times this character appears
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            result.append(ch).append(count);

            str = str.replace(String.valueOf(ch), "");
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(FrequencyOfChars(input));  //A3B2C1D2
    }
}



