package AndreaFirstWeekTask;

public class Odd_or_Even {

    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify(6));

    }

    public static String identify(int number){
        if (number%2==0){
            return number + " is EVEN";
        }else {
            return number + " is ODD";
        }
    }

}
 /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"
     */