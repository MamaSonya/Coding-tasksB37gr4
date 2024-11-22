package BeyzaFirstWeekSolution;

import java.security.PublicKey;

public class OddOrEven {
    public static void main(String[] args) {

          /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

        System.out.println("5 is " + evenOrOdd(5) + " number");
        System.out.println("6 is " + evenOrOdd(6) + " number");



    }


    public static String evenOrOdd(int num) {
        if(num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


}
