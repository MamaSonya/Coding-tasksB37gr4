package grishaTasksSolutions;

public class Odd_or_Even {


        public static String determine (int number) {
            // Check if the number is even or odd and return the result
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        public static void main(String[] args) {
            // Test the method with different numbers
            System.out.println(determine(5)); // Output: Odd
            System.out.println(determine(6)); // Output: Even
        }
    }



    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

