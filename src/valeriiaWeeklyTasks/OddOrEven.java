package valeriiaWeeklyTasks;

public class OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    public static String evenOrOdd(int number) {
        String result = (number % 2 == 0) ? "Even" : (number % 2 == 1) ? "Odd" : "Invalid input";
        return result;
    }

    public static void main(String[] args) {
        String resultOfNumber = evenOrOdd(5);
        System.out.println(resultOfNumber);

        String resultOfNumber2 = evenOrOdd(6);
        System.out.println(resultOfNumber2);
    }


}
