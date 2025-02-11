package MarinaTaskSolution;

import java.util.Arrays;
public class MoveZerosToEnd_W11 {

   /* write a program that can move all the zeros to the end of an int array
    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]
    */

    public static void moveZeros(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 5, 0, 6, 9};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//	•	i iterates through the array.
//	•	j tracks where the next nonzero element should go.
//	•	When a nonzero is found, it swaps with the element at j and increments j.