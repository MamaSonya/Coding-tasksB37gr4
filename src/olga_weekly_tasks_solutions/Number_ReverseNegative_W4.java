package olga_weekly_tasks_solutions;

public class Number_ReverseNegative_W4 {
    /*
    Write a return method that can reverse
negative number and return it as int

Ex: input => -456
    output => -654
   */
 public static int reverseNegativeNumber(int num){

     if (num >= 0){
         return num;
     }

     int reverseNum = 0;
     num = Math.abs(num);

     while (num != 0){
         int digit = num % 10;
         reverseNum = reverseNum * 10 +digit;
         num /=10;
     }
     return reverseNum;
 }
    public static void main(String[] args) {
        int input = -456;
        int output = reverseNegativeNumber(input);

        System.out.println("Reversed number: " + output);
    }


}
