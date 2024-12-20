package troyWeeklyTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCars_W5 {

    /*
        Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        Andrea is volunteer
    */

    public static String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {//aaabbbcccdddEEEFFF
            int count = 0;
            for (int i = 0; i < str.length(); i++) {//aaabbbcccdddEEEFFF
                if (str.charAt(i) == str.charAt(j)) {
                    count++;//3
                }
            }
            expectedResult += str.charAt(j) + "" + count;//a3b3
            str = str.replace("" + str.charAt(j), "");
            System.out.println(str);

        }
        return expectedResult;
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfChars1("aaabbbcccdddEEEFFF"));
    }

}
