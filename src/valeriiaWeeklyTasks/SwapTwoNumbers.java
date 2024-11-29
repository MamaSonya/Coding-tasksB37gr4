package valeriiaWeeklyTasks;
  /*
    Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

    a = 7;
    b = 5;
     */

public class SwapTwoNumbers {

    public static void main(String[] args) {
        swap_twoNumbers(5,7);
    }


    public static void swap_twoNumbers(int a, int b) {
        System.out.println("Before swap are a= " + a + ", b= " + b);
       a=a+b; //12 (a=12)
       b=a-b; //12-7=5 (b=5)
       a=a-b;//12-5=7 (a=7)
       System.out.println("After swap are a= " + a + ", b= " + b);

    }

}
