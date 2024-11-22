package olga_weekly_tasks_solutions;

public class Odd_or_Even {
    public static void main(String[] args) {

        System.out.println("oddOrEven(10) = " + oddOrEven(10));
        System.out.println("oddOrEven(33) = " + oddOrEven(33));
        System.out.println("oddOrEven(41) = " + oddOrEven(41));

    }
    public static String oddOrEven(int num){
        if (num % 2 != 0){
            return "odd";
        }else {
            return "even";
        }


    }

}
    /*
     Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

