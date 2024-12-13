package BeyzaFirstWeekSolution;

public class ReverseNumberNegative {
    public static void main(String[] args) {

        /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654


      Grisha is volunteer and Marina will help him...

     */

        int number = 456;

        System.out.println("number before reversing to negative " +number);
        System.out.println("reverseToNegative(number) = " + reverseToNegative(number));


    }


    public static int reverseToNegative(int num){
        int reversedNumber = 0;  //added as temporary

        num = Math.abs(num);

        while (num != 0){
            int lastDigit = num % 10;

            reversedNumber = reversedNumber * 10 +lastDigit;
            num /= 10;



        }

        return -reversedNumber;

    }




}
