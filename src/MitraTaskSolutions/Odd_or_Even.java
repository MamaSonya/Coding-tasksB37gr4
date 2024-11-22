package MitraTaskSolutions;
/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
public class Odd_or_Even {

        public static String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        public static void main(String[] args) {

            System.out.println(identify(5)); // Output: Odd
            System.out.println(identify(6)); // Output: Even
        }
    }




