package olga_weekly_tasks_solutions;

public class SortArrayAcs_W12 {
    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */
    // Olga is volunteer
    public static void main(String[] args) {

        int[]arr = {1,3,5,7,9,2,4,6,8};
        int[] sortedArr = sortArrayWithReturnType(arr);

        for (int eachNum : sortedArr) {
            System.out.print(eachNum+" ");
        }
        System.out.println();
        sortArray(arr);
        for (int each : arr) {
            System.out.print(each+" ");
        }
    }
    public static int[] sortArrayWithReturnType(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 ; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void sortArray(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
