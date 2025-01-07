package AseyarWeeklyTasksRecent.ViraWeeklyTasks;

public class SwapTwoNumbers {
    /*
    Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

   System.out.println("a = " + a); //=> a = 7
   System.out.println("b = " + b); //=> b = 5

     */

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a + b; // a = 12
        b = a - b; // b = 5
        a = a - 5; // a = 7

        System.out.println("a = " + a); //=> a = 7
        System.out.println("b = " + b); //=> b = 5
    }

   /*
   OPTION 2
   Swap two variable values with a third variable
        int a = 5;
        int b = 7;
        int temp;

        temp = a;  // temp = 5, a = 5
        a = b;     // a = 7, b = 7
        b = temp;  // a = 7, b = 5
        System.out.println("a = " + a); //=> a = 7
        System.out.println("b = " + b); //=> b = 5
    */

}
