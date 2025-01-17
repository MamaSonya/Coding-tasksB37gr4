package grishaTasksSolutions;

public class FindUniqueChar_W7 {

        public static String FindUniqueChars(String str) {
            String unique = "";
            for (char ch : str.toCharArray())
                if (str.indexOf(ch) == str.lastIndexOf(ch)) unique += ch;
            return unique;
        }

        public static void main(String[] args) {
            System.out.println(FindUniqueChars("AAABBCDD")); // Output: C
        }
    }


/*
    1.	Compact Logic:
	    •	Directly checks if a character is unique (indexOf == lastIndexOf) in a single condition.
	2.	Eliminated Braces:
	    •	Uses single-line if and for statements for conciseness.
	3.	Minimal Variables:
	    •	No additional variables, just unique to store the result.


 */
