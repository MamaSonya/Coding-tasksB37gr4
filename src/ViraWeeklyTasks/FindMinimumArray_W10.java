package AseyarWeeklyTasksRecent.ViraWeeklyTasks;

public class FindMinimumArray_W10 {

    public static int findMinimumArray(int[] arr) {
        int min = 50;

        for (int each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;



    }

    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(findMinimumArray(arr));

    }


}
