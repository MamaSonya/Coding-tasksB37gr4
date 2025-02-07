package BeyzaFirstWeekSolution;

public class FindMinArray_Week10 {

     /*
    Write a function that can find the minimum number from an int Array
     */

    // Grisha is volunteer


    public static void main(String[] args) {

        int [] arrayOfNumbers = {50,48,37,60,28,59,100};
        int min = minimumNumber(arrayOfNumbers);
        System.out.println("Minimum number in this array is: " +min);



    }

    public static int minimumNumber(int [] ar ){
        int minimum = ar[0];

        for(int num : ar){
            if(num < minimum){
                minimum = num;
            }
        }
        return minimum;
    }




}
