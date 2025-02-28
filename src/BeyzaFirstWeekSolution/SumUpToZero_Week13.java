package BeyzaFirstWeekSolution;

import java.util.Arrays;

public class SumUpToZero_Week13 {
     /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    // Beyza  is volunteer

    public static int[] sumZero(int n) {  //method returns an array of n unique int summing to 0
        int[] result = new int[n];   // result array with size of size n
        int value = -n / 2;   //starting the sequence from neg number to balance the sum

        for (int i = 0; i < n; i++) {    //iterate n times
            if (n % 2 == 0 && value == 0) {   //if n is even, skip 0 so array can stay unique
                value++;
            }
            result[i] = value;   //assign value to array, then move to next num
            value++;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 5;
        int number3 = 10;
        System.out.println(Arrays.toString(sumZero(number)));
        System.out.println(Arrays.toString(sumZero(number3)));



    }







}
