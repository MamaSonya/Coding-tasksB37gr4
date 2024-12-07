package grishaTasksSolutions;

public class Number_ReverseNegative_W4 {

        public static int reverseNegative(int num) {

            if (num >= 0) return num;         // Check if the number is negative

                                             // Convert to positive, reverse using StringBuilder, and make it negative again
            String reversedString = new StringBuilder(String.valueOf(-num)).reverse().toString();
            return -Integer.parseInt(reversedString);
        }

        public static void main(String[] args) {
            int number = -123;
            int reversed = reverseNegative(number);
            System.out.println("Reversed number: " + reversed);              // Output: -321
        }
    }

/*   Explanation:

          1. Check the Number:
                We would Start by checking if the number is negative. If it’s not,
                just return it as is because this method only works for negative numbers.
	      2. Convert to String:
	            If the number is negative, we remove the negative sign by taking its absolute value.
	            Then, we convert the number to a string so that we can easily reverse it.
	      3. Reverse the Digits:
	            We Use a tool called StringBuilder, which has a built-in function to reverse strings.
	            This will give us the digits in reverse order.
	      4. Convert Back to a Number:
	            Then we Take the reversed string and convert it back into an integer.
	      5. Make It Negative Again:
	            Finally, we have to add the negative sign back to the reversed number and return it.



 /*   Write a return method that can reverse negative number and return it as int

             Example:
                input => -456
                output => -654

     Grisha is volunteer and Marina will help him...

 */