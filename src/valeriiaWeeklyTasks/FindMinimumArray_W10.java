package valeriiaWeeklyTasks;

import java.util.Arrays;

public class FindMinimumArray_W10 {

     /*
    Write a function that can find the minimum number from an int Array
     */

     public static Integer FindMinimumArray(int [] str) {
         Arrays.sort(str);
         return str[0];
     }

     public static void main(String[] args) {
         int [] str = {12,28,56,4,50,6,71,8,9,19};
         System.out.println(FindMinimumArray(str));
     }
}
