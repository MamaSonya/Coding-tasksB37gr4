package SilviWeeklyTask;

import java.util.Scanner;

public class OddOrEven {

     /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    //Mitra will share the solution

    public  static  String  identify( int  n ) {

        return  n % 2==0 ? "Even" : "odd";

    }

    //-----------------------------------------------------------------------

    public static void identify1(){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number to see if it is odd or even: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }

    //----------------------------------------------------------------------------------------

    public static void identify2(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
    }

    //-------------------------------------------------------------------------

    public static void main(String[] args) {


        //System.out.println(identify(5));

        //identify(5);

        identify1();


    }

}
