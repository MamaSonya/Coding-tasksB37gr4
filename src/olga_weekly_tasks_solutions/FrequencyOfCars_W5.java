package olga_weekly_tasks_solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCars_W5 {

    /*
        Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        Andrea is volunteer
    */

    public static void main(String[] args) {
        // Example string input
        String input = "AAABBCDD";

        // Call the function to calculate the frequency
        String result = frequencyOfChars(input);

        // Print the result
        System.out.println(result);  // Output: A3B2C1D2
    }

    // Function to calculate the frequency of characters in the string
    public static String frequencyOfChars(String str) {
        // Step 1: Create a Map to store the frequency of each character
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Step 2: Loop through each character in the string
        for (char c : str.toCharArray()) {
            // Step 3: Update the frequency count for each character
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 4: Initialize an empty result string
        String result = "";

        // Step 5: Loop through the map to create the output string
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            result += entry.getKey();   // Append the character
            result += entry.getValue(); // Append the frequency
        }

        // Step 6: Return the final result string
        return result;
    }

}
