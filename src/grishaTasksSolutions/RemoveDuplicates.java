package grishaTasksSolutions;

public class RemoveDuplicates {

        public static String removeDuplicates(String str) {
            String result = "";
            for (char ch : str.toCharArray()) {
                if (!result.contains(ch + "")) result += ch;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(removeDuplicates("AAABBCDD")); // Output: ABCD
        }
    }

