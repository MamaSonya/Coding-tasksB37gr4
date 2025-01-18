package grishaTasksSolutions;

 /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

public class ReverseString_W8 {


        public static String reverse(String str) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--)
                reversed += str.charAt(i);
            return reversed;
        }

        public static void main(String[] args) {
            System.out.println(reverse("Hello")); // Output: olleH
        }
    }

/*

public class ReverseString {
    public static String reverse(String str) {




1.	Start with an Empty String:
      The reversed variable will hold the final reversed string.

       String reversed = "";      // Step 1: Initialize an empty string to store the reversed result




2.	Loop Backwards:


	•	str.length() - 1: Start at the last character of the string.
	•	i >= 0: Keep looping until the first character is reached.
	•	i--: Decrease i after each iteration to move backward.

	        for (int i = str.length() - 1; i >= 0; i--) {

3.	Append Characters:

	•	str.charAt(i): Gets the character at position i.
	•	reversed += ...: Adds the character to the end of the reversed string.

            reversed += str.charAt(i); // Step 3: Add each character to the reversed string


4.	Return the Reversed String:
	   After the loop, the reversed string contains all the characters in reverse order.

        }
        return reversed; // Step 4: Return the final reversed string



5.	Call and Test:
	•	Pass the input string "Hello" to the reverse function.
	•	Print the reversed string, which is "olleH".

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));         // Output: olleH
    }
}


Example Walkthrough:

Input: "Hello"
	•	Start with reversed = "".
	•	Loop through "Hello" from the last character to the first:
	•	i = 4: reversed = "o".
	•	i = 3: reversed = "ol".
	•	i = 2: reversed = "oll".
	•	i = 1: reversed = "olle".
	•	i = 0: reversed = "olleH".
	•	Output: "olleH".

This step-by-step process makes the function easy to understand!
 */