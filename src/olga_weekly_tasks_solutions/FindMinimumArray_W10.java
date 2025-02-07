package olga_weekly_tasks_solutions;

public class FindMinimumArray_W10 {

     /*
    Write a function that can find the minimum number from an int Array
     */

    // Function to find the minimum number in an int array
    public static int findMin(int[] arr) {
        // Assume the first element is the minimum
        int min = arr[0];

        // Loop through the array to find the minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {5, 3, 8, 1, 4};
        System.out.println("The minimum number is: " + findMin(numbers));
    }


    // Grisha is volunteer
}
