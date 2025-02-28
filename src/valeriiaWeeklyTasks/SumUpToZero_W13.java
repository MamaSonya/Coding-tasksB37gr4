package valeriiaWeeklyTasks;

import java.util.ArrayList;
import java.util.List;

public class SumUpToZero_W13 {

       /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
        The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */

    public static List<Integer> sumUptoZero(int n) {
        List<Integer> result = new ArrayList<>(); // List to store unique numbers
        int sum = 0; // Variable to keep track of the running sum

        // Generate the first (n-1) unique numbers
        for (int i = 1; i < n; i++) {
            result.add(i); // Add number to the list
            sum += i; // Update the sum
        }

        // Adjust the last number to ensure the total sum equals `n`
        result.add(n - sum);

        return result;
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(sumUptoZero(5)); // Example output: [1, 2, 3, 4, -5] (Sum = 5)
        System.out.println(sumUptoZero(3)); // Example output: [1, 2, 0] (Sum = 3)
        System.out.println(sumUptoZero(7)); // Example output: [1, 2, 3, 4, 5, 6, -14] (Sum = 7)
    }
}