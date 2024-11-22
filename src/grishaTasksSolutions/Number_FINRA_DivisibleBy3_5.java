package grishaTasksSolutions;

public class Number_FINRA_DivisibleBy3_5 {

 /* Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
  */
// 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
// Silvia is a volunteer


    public static void printFinRa() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFinRa();
    }
}





/*
       EXPLANATION:

      1. Here we implement a "for" loop to iterate through numbers from 1 to 30.
      2. For each number, it checks:
         "If"  the number is divisible by both 3 and 5 (using the modulo operator %), it prints "FINRA".
         "Else if"  the number is divisible by 3, it prints "FIN".
         "Else if"  the number is divisible by 5, it prints "RA".
         If none of the above conditions are met, it prints the number itself.

     This output meets all the requirements we specified:
        Numbers from 1 to 30 are being processed.
        Multiples of 3 (but not 5) instead of a number will print "FIN".
        Multiples of 5 (but not 3) instead of a number will print "RA".
        Multiples of both 3 and 5 instead  of  a number  will print "FINRA".
        All other numbers are printed as is.

 */