package MarinaTaskSolution;

public class SwapTwoNumbers {

     /*
    Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

    a = 7;
    b = 5;
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 13;

        a = a + b; // 10 + 13 = 23 (a)
        b = a - b; // 23 - 13 = 10 (b)
        a = a - b; // 23 - 10 = 13 (a)

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

