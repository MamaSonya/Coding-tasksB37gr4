package yassine_shares;

public class Frequency_of_Cars {
//    /*
//        Write function that can find the frequency of characters
//        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
//        Andrea is volunteer
//    */

    public static String frequencyOfChars(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!result.contains("" + ch)) {
                int count = 0;
                for (char c : str.toCharArray()) {
                    if (c == ch) count++;
                }
                result += ch + count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));

    }
}



