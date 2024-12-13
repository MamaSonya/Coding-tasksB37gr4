package BeyzaFirstWeekSolution;

public class FrequencyOfChars_W5 {

     /*
        Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        Andrea is volunteer
    */

    public class FrequencyOfChars {

        public static String frequencyOfChars(String s) {

            int[] frequent = new int[26];  //will store frequency of chars A-Z


            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                frequent[currentChar - 'A']++;
            }


            String result = "";
            for (int i = 0; i < 26; i++) {
                if (frequent[i] > 0) {
                    result += (char) (i + 'A') + "" + frequent[i];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            System.out.println(frequencyOfChars("AAABBCDD"));  //gives me A3B2C1D2
        }
    }





}
