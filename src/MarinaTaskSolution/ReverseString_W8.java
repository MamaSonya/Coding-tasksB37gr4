package MarinaTaskSolution;

public class ReverseString_W8 {

   /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

        public static void main(String[] args) {
            String original = "Hello World";
            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);
            }

            System.out.println("Reversed String: " + reversed);
        }
    }

