package grishaTasksSolutions;

public class RemoveDuplicates_W5 {

        public static String removeDuplicates(String str) {
            String result = "";  // This will store the final string without duplicates.
            for (char ch : str.toCharArray()) {
                if (!result.contains(ch + "")) result += ch;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(removeDuplicates("AAABBCDD")); // Output: ABCD
        }
    }


/*
1.	Initialize result: Start with an empty string. This is where we’ll build the string without duplicates.

2.	Convert String to Characters: Use a for-each loop to go through each character (ch) in the input string.
    The toCharArray() method breaks the string into individual characters.

3.	Check for Duplicates:
	•	The contains method checks if the current character (ch) is already in the result string.
	•	ch + "" converts the character into a string since contains works with strings, not characters.
	•	If the character is not already in the result, proceed to add it.

4.	Add Unique Characters: If the character is not a duplicate, append it to the result string using +=.

5.	Return Result: Once the loop finishes processing all characters,
    return the result string, which now contains only unique characters.

	6.	Test the Method: The main method calls removeDuplicates with a sample string and prints the result.

Example Walkthrough:

Input: "AAABBCDD"
	•	Step 1: Start with result = "".
	•	Step 2: Process each character:
	•	A: Not in result. Add it → result = "A".
	•	A: Already in result. Skip.
	•	A: Already in result. Skip.
	•	B: Not in result. Add it → result = "AB".
	•	B: Already in result. Skip.
	•	C: Not in result. Add it → result = "ABC".
	•	D: Not in result. Add it → result = "ABCD".
	•	D: Already in result. Skip.
	•	Final Output: "ABCD".

 */


