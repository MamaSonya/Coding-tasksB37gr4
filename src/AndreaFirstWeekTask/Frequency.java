package AndreaFirstWeekTask;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    /*
        Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        Andrea is volunteer
    */

    public static void main(String[] args) {
        String string = "AAABBCDD";

        Map<Character, Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char key = string.charAt(i);

            if (counter.containsKey(key)) {
                counter.put(key, counter.get(key) + 1);
            } else
                counter.put(key, 1);
        }

        System.out.println("counter = " + counter);

    }


}










