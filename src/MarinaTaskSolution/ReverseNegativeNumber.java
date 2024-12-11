package MarinaTaskSolution;

public class ReverseNegativeNumber {

      /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654


      Grisha is volunteer and Marina will help him...

     */

        public static int reverseNegative(int number) {
            int reversed = 0;
            for (int n = Math.abs(number); n > 0; n /= 10) {
                reversed = reversed * 10 + n % 10;
            }
            return -reversed;
        }

        public static void main(String[] args) {
            System.out.println(reverseNegative(-321)); // Output: -123
        }
    }




