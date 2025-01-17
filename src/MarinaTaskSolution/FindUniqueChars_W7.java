package MarinaTaskSolution;

public class FindUniqueChars_W7 {

        public static String unique(String input) {
            StringBuilder uniqueChars = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                // Count occurrences of the current character in the string
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == currentChar) {
                        count++;
                    }
                }

                // If the character occurs only once, add it to the result
                if (count == 1) {
                    uniqueChars.append(currentChar);
                }
            }

            return uniqueChars.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBBCCCDEF";
            System.out.println("Unique characters: " + unique(input)); // Output: "DEF"
        }
    }
