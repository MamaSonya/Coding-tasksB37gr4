package grishaTasksSolutions;

import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3}; // Example array

        Arrays.sort(numbers); // Sort the array in ascending order

        System.out.println("Sorted Array: " + Arrays.toString(numbers)); // Print the sorted array
    }
}
/*
 1. import java.util.Arrays;   // Import Arrays class for utility functions

public class SortArray {
    public static void main(String[] args) {
	•	import java.util.Arrays;
	•	This imports the Arrays class, which contains utility methods for working with arrays.

	•	public class SortArray
	•	Defines a class named SortArray.

	•	public static void main(String[] args)
	•	This is the main method, the entry point of the Java program.

2. int[] numbers = {5, 2, 8, 1, 3};       // Example array

	•	Creates an integer array named numbers with values {5, 2, 8, 1, 3}.

3.Arrays.sort(numbers);            // Sort the array in ascending order

	•	Uses Arrays.sort(numbers); to sort the array in ascending order.
	•	After sorting, the array changes from {5, 2, 8, 1, 3} to {1, 2, 3, 5, 8}.

4.	System.out.println("Sorted Array: " + Arrays.toString(numbers));
	•	Arrays.toString(numbers) converts the array into a readable string format.
	•	Prints the sorted array as:
        Sorted Array: [1, 2, 3, 5, 8]

        OUTPUT:
        Sorted Array: [1, 2, 3, 5, 8]

        Why Use Arrays.sort()?
	•	It sorts elements efficiently using Dual-Pivot Quicksort (for primitives).
	•	Time Complexity:
	•	O(n log n) in average and worst cases.
	•	O(n) in best case (already sorted array).
 */

