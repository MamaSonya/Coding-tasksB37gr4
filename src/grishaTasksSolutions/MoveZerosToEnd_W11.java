package grishaTasksSolutions;

import java.util.Arrays;

public class MoveZerosToEnd_W11 {

     /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */

        //  Marina is volunteer
        public static void moveZerosToEnd(int[] arr) {
            int index = 0;      // Index to place non-zero elements

            // Traverse array and move non-zero elements forward
            for (int num : arr) {
                if (num != 0) {
                    arr[index++] = num;
                }
            }

            // Fill remaining positions with zeros
            while (index < arr.length) {
                arr[index++] = 0;
            }
        }

        public static void main(String[] args) {
            int[] input = {1, 2, 0, 0, 5, 0, 6, 9};
            moveZerosToEnd(input);
            System.out.println(Arrays.toString(input));
        }

    }

