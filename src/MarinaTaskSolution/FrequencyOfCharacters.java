package MarinaTaskSolution;

public class FrequencyOfCharacters {

    /*

    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    *Andrea is a volunteer.*
*/


    public class FrequencyOfChars {

        public static String findFrequency(String input) {
            String result = "";

            for (char ch : input.toCharArray()) {
                if (!result.contains(String.valueOf(ch))) {
                    int count = 0;
                    for (char each : input.toCharArray()) {
                        if (each == ch) {
                            count++;
                        }
                    }
                    result += ch + "" + count;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            System.out.println(findFrequency("AAABBCDD"));
        }
    }
}