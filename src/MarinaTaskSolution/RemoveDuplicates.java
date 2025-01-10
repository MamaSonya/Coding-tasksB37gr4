package MarinaTaskSolution;

public class RemoveDuplicates {
//    Write function that can remove the duplicated values from String
//    Ex: removeDup("AAABBBCCC") ==> ABC



        public static String removeDup(String input) {
            String result = ""; // To store the final result without duplicates

            for (char ch : input.toCharArray()) {
                if (!result.contains(String.valueOf(ch))) {
                    result += ch; // Add the character only if it's not already in the result
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "AAABBBCCC";
            System.out.println("After removing duplicates: " + removeDup(input)); // Output: ABC
        }
    }

