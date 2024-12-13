package troyWeeklyTasks;

public class Number_ReverseNegative_W4 {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654


      Grisha is volunteer and Marina will help him...

     */

    public static int reverseNum(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while ( number !=0 ) {
            result = result * 10 + number % 10;
            //           0       +   456  %  10 = 6
            //           60        +  45  % 10  =  65
            //          650         +   4 %  10 = 654
            number /= 10; //45 / 4 /  0

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(reverseNum(-456));


    }



}
