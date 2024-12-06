package olga_weekly_tasks_solutions;

public class SwapTwoNumbers {
     /*
    Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

    a = 7;
    b = 5;
     */

         public static void main(String[] args) {
             int a = 5;
             int b = 7;

             // Print initial values
             System.out.println("Before swap: a = " + a + ", b = " + b);

             // Swap the values without using a third variable
             a = a + b; // a becomes 12 (5 + 7)
             b = a - b; // b becomes 5 (12 - 7)
             a = a - b; // a becomes 7 (12 - 5)

             // Print swapped values
             System.out.println("After swap: a = " + a + ", b = " + b);
         }
     }

