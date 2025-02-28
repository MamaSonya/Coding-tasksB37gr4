package troyWeeklyTasks;

import java.util.Arrays;
import java.util.Random;

public class SumUpToZero_W13 {

     /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    // Beyza  is volunteer




    //Solution 1
    public static int[] sumUpToZero(int N) {

        if (N < 1 || N > 100) {
            //throw new IllegalArgumentException("N must be between 2 and 99 inclusive.");
            System.err.println("N must be between 2 and 99 inclusive.");// will print in red colour
            System.exit(0);
        }

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum;//0, 1, 2, 3, -6 = 0

        return result;
    }

    //Solution 2
    public static int[] sumUpToZero2(int N) {
        if (N < 1 || N > 100) {
            //throw new IllegalArgumentException("N must be between 2 and 99 inclusive.");
            System.err.println("N must be between 2 and 99 inclusive.");// will print in red colour
            System.exit(0);
        }

        Random random = new Random();
        int[] result = new int[N];
        int sum = 0;

        // Generate N-1 unique random integers
        for (int i = 0; i < N - 1; i++) {
            int randomNumber;
            boolean isUnique;

            // Keep generating random numbers until a unique one is found
            do {
                randomNumber = random.nextInt(); // Any random integer
                isUnique = true;

                // Check if the number is already in the array
                for (int j = 0; j < i; j++) {
                    if (result[j] == randomNumber) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            result[i] = randomNumber;
            sum += randomNumber;
        }

        // Set the last element to the negative of the sum to ensure the total sum is 0
        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int N = 9;
        int[] result = sumUpToZero2(N);
        System.out.println(Arrays.toString(result));
    }




}
