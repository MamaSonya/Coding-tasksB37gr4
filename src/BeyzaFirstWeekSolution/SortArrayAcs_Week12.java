package BeyzaFirstWeekSolution;

public class SortArrayAcs_Week12 {


    public static void sortAscOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumIndex = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[minimumIndex]) {
                    minimumIndex = k;
                }
            }
            // Swapping without using any temporary variable
            if (minimumIndex != i) {
                arr[i] = arr[i] + arr[minimumIndex];
                arr[minimumIndex] = arr[i] - arr[minimumIndex];
                arr[i] = arr[i] - arr[minimumIndex];
            }
        }


    }


    public static void main(String[] args) {

        int[] input = {1, 2, 0, 5, 4, 7, 9};

        System.out.print("Original array is: ");
        for (int num : input) System.out.print(num + " ");
        System.out.println();

        sortAscOrder(input);

        System.out.print("Sorted array is: ");
        for (int num : input) System.out.print(num + " ");
    }


    }




/*
    Write a method that can sort an int array in Ascending order without using the sort method


     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

        // Olga is volunteer





























