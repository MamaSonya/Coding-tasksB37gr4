package olga_weekly_tasks_solutions;

public class ReverseString_W8 {

    /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Yassine is volunteer

    public  static String stringRevers(String str){

        String revers = "";

        for (int i = str.length() - 1; i >=0 ; i--) {

            revers += str.charAt(i);
        }
        return revers;
    }

    public static void main(String[] args) {

        String string = "Hello!";
        String result = stringRevers(string);
        System.out.println("result = " + result);

    }
}