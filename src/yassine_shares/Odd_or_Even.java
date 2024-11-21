package yassine_shares;

/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
public class Odd_or_Even {

    public static String oddOrEvenIdentifier(int num) {

        if (num % 2 == 0)
            return "even";
        else {
            return "odd";
        }

    }

    public static void main(String[] args) {
        System.out.println(oddOrEvenIdentifier(5));
        System.out.println(oddOrEvenIdentifier(6));
    }

}
