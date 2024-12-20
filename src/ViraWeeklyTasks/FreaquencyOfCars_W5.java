package AseyarWeeklyTasksRecent.ViraWeeklyTasks;

import java.util.HashMap;
import java.util.Map;

public class FreaquencyOfCars_W5 {

    /*

    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

*/

    public static void main(String[] args) {
        freaquencyOfCars("AAABBCDD");

    }

    public static void freaquencyOfCars(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (map.get(ch) == null ) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        map.forEach((k, v) ->{
            System.out.print(k + "" + v);
        } );

        System.out.println();

    }














}
