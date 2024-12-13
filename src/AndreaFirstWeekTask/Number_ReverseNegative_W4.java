package AndreaFirstWeekTask;

public class Number_ReverseNegative_W4 {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654


      Grisha is volunteer and Marina will help him...

     */

    public static void main(String[] args) {
        int number = -456;
        System.out.println(number);
        System.out.println(reverseNumber(number));
    }

    public static int reverseNumber(int num) {
        if (num < 0) {
            String numStr = Integer.toString(num);
            String reversedStr = new StringBuilder(numStr.substring(1)).reverse().toString();
            return -Integer.parseInt(reversedStr);
        } else {
            return num;
        }


    }
}

