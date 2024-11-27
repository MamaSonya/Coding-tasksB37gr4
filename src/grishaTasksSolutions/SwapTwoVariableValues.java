package grishaTasksSolutions;

public class SwapTwoVariableValues {

    public static void main(String[] args) {

       // Swap two variable values without using a third variable

        int a = 5;
        int b = 7;

        System.out.println("a = " + a); //=> a = 7
        System.out.println("b = " + b); //=> b = 5


        a = a + b;   // 12
        b = a - b;   // 12 - 7 = 5
        a = a - b;   // 12 - 5 = 7

        System.out.println("a = " + a + ", b =  " + b);
    }
}
 /*           OUTPUT
              a = 5
              b = 7
              a = 7, b = 5
/*
    Explanation
	1.	Addition and Subtraction Method:
	•	First,  we add the two variables and store the result in one of them (a = a + b).
	•	Then,   we subtract the second variable from the result to get the initial value of the first variable (b = a - b)
	•	Lastly, we subtract the new value of the second variable from the result to get
	    the initial value of the second variable ( a  = a - b)
 */