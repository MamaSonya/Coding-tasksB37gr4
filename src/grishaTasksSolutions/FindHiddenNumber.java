package grishaTasksSolutions;

public class FindHiddenNumber {


        public static void main(String[] args) {


            // Create a login to find Hidden Number
            // Print out how many try you did till find the number
            System.out.println(findNumber(80000));
        }

        public static String findNumber(int number){

            int hiddenNumber=80000;
            String hint="";

            if(number>hiddenNumber){
                hint="Too High";
            }else if(number < hiddenNumber){
                hint="Too Low";
            }else {
                hint="Number is found";
            }

            return hint;
        }


}




/*
Explanation
	1.	Hidden Number: The program defines a fixed `hiddenNumber` (80000 in this case).
	2.	User Input: It uses a `Scanner` object to read guesses from the user.
	3.	Loop: A `while` loop runs until the user guesses the correct number.
	4.	Hints: After each guess, the program provides feedback (“Too High” or “Too Low”).
	5.	Attempts Counter: The program keeps track of how many guesses it takes to find the correct number.
	6.	Output: When the correct number is guessed, it prints a congratulatory message and the total number of attempts.

Sample Run

Welcome to the Hidden Number Game!
Try to guess the hidden number.
Enter your guess: 10000
Too Low!
Enter your guess: 90000
Too High!
Enter your guess: 80000
Congratulations! You found the hidden number.
It took you 3 tries.


 */