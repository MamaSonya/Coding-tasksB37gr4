package valeriiaWeeklyTasks;

import java.util.Arrays;

public class SortArrayAcs_W12 {

       /*
    Write a method that can sort an int array in Ascending order without using the sort method


     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    public void sortArray(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 4, 7, 9};
        SortArrayAcs_W12 sort = new SortArrayAcs_W12();
        sort.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
