package MarinaTaskSolution;

import java.util.Arrays;

public class SortArraysAcs_W12 {

        public static void sortAscending(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        // Swap arr[i] and arr[j] if they are out of order
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] input = {1, 2, 0, 5, 4, 7, 9};

            sortAscending(input);

            System.out.println(Arrays.toString(input));
        }
    }
/*
	1.	Start with the first element and compare it to all others.
	2.	If any smaller element is found, swap it.
	3.	Move to the next element and repeat.

 */