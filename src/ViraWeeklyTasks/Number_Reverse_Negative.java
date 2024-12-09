package AseyarWeeklyTasksRecent.ViraWeeklyTasks;

public class Number_Reverse_Negative {
     /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654

     */
     public static void main(String[] args) {
         System.out.println(reverseNegative(-456));
     }

     public static int reverseNegative(int x) {

        int reversed = 0;
        int lastDigit;



         while (x != 0){

             //1 store last digit
             lastDigit = x % 10; //-6   -5   -4

             //2 store the last number to reversed number
             reversed = reversed * 10 + lastDigit; // -654

             //3 remove last digit
             x /= 10; // 45   4   0


         }
        return reversed;
     }
}
