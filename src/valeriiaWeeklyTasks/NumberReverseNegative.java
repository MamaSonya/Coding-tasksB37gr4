package valeriiaWeeklyTasks;

public class NumberReverseNegative {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654

     */

    public static void main(String[] args) {
        int number = -456;
        int result = reverse(number);
        System.out.println("Reversed: " + result); //


        System.out.println("---------------------");
    }




    public static int reverse(int number) {
        if (number >= 0) {
            System.out.println(number + " must be negative");
            return number;
        }

        String str = Integer.toString(Math.abs(number));
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Parse the reversed string back to an integer and apply the negative sign
        int reversedResult = Integer.parseInt(reversed);
        return -reversedResult;
    }
}
