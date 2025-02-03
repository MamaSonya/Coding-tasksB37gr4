package grishaTasksSolutions;

public class FindMinimumArray_W10 {

        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 9, 3};        // Step 1
            int min = numbers[0];                      // Step 2
            for (int num : numbers)                    // Step 3
                if (num < min)
                    min = num;
            System.out.println(min);                   // Step 4

        }

 }

   /*       Explanation:

            We create the main method class, which will allow us to execute our solution
  	step1   We create an integer array named numbers and initialize it with some values.
    step2  	We assume the first element of the array is the smallest value and store it in min.
    step3   This is a for-each loop, which iterates over each element in the array:
	     	If num (the current value) is smaller than min, we update min to that value.
	    	This ensures that by the end of the loop, min holds the smallest number in the array.
	step4	Finally, we print the smallest value found in the array.
    */
	




















/*Given numbers = {5, 2, 8, 1, 9, 3}, the loop will work as follows:
	1.	Start with min = 5
	2.	Compare 2 < 5 -→ Update min = 2
	3.	Compare 8 < 2 -→ No change
	4.	Compare 1 < 2 -→ Update min = 1
	5.	Compare 9 < 1 -→ No change
	6.	Compare 3 < 1 -→ No change
	7.	Print 1, which is the minimum value.
  */




