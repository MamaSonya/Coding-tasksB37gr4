package troyWeeklyTasks;

import java.util.Arrays;

public class SortArrayAcs_W12 {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method


     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    // Olga is volunteer

    public static int[] sortingArrayAsc(int[] arr) {



        System.out.println(Arrays.toString(arr)); // before sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;//swapping
                }
            }

        }

        return arr;


    }



    public static void main(String[] args) {

        int [] arr = {1, 5, 8, 3, 2, 11, -1};

        System.out.println(Arrays.toString(sortingArrayAsc(arr)));



    }

}
