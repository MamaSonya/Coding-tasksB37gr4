package MarinaTaskSolution;

public class FindMinArray_W10 {

    public static int findMin(int[] numbers) {
        int min = numbers[0]; // Start with the first element

        for (int num : numbers) {
            if (num < min) {
                min = num; // Update min if a smaller number is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, -2, 19, 0};
        System.out.println("Minimum value: " + findMin(numbers)); // Output: -2
    }
}

/*
//OPTION 2:


import java.util.Arrays;
public class FindMinArray_W10 {

    public static int findMin(int[] numbers) {
        Arrays.sort(numbers); // Sort the array in ascending order
        return numbers[0]; // The first element is the minimum
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, -2, 19, 0};
        System.out.println("Minimum value: " + findMin(numbers)); // Output: -2
    }
      }
 */
