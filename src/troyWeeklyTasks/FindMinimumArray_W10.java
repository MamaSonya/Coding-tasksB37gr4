package troyWeeklyTasks;

public class FindMinimumArray_W10 {

     /*
    Write a function that can find the minimum number from an int Array
     */


    // Grisha is volunteer

    public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;
        // OR
        //int min = n[0];

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }

    public static void main(String[] args) {
        int [] arr = {1, 5, 8, 3, 2, 11, -1};

        System.out.println(minValue(arr));
    }

}
