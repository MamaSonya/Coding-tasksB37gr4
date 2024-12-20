package grishaTasksSolutions;

public class FrequencyOfCaracters_W5 {

    public static String frequencyOfChars(String str) {

        String result = "";                             // To store the result
            for (char ch : str.toCharArray()) {
                if (result.indexOf(ch) == -1) {         // Check if character is not already in result
                    int count = 0;
                    for (char c : str.toCharArray()) {
                        if (c == ch) count++;           // Count occurrences
                    }
                    result += ch + "" + count;          // Append character and count
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(frequencyOfChars("AAABBCDD"));       // Output: A3B2C1D2
        }
    }


/*

    Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    Andrea is volunteering
*/




