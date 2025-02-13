package valeriiaWeeklyTasks;

import java.util.Arrays;

public class MoveZerosToEnd_W11 {

    /*
write a program that can move all the zeros to the end of an int array

input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
output = [ 1, 2, 5, 6, 9, 0, 0, 0]

 */
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 5, 0, 6, 9};
        int[] result = moveZeroes(nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] moveZeroes(int[] nums) {
        int[] newArray = new int[nums.length];
        int index = 0;


        for (int num : nums) {
            if (num != 0) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }


//    public static String moveZeroes(int[] nums) {
//
//        int l = nums.length;
//        String reversed = "";
//        String zeros = "";
//
//
//        for (int i = 0; i < l; i++) {
//            if (nums[i] != 0) {
//                reversed += nums[i] + " ";
//
//            } else if (nums[i] == 0) {
//                zeros += nums[i] + " ";
//            }
//        }
//        return reversed + zeros;
//    }

}
