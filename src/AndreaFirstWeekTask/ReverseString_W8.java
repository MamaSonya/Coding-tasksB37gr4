package AndreaFirstWeekTask;

public class ReverseString_W8 {

    /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Yassine is volunteer

    public static void main(String[] args) {
        String str = "ABCD";
        String reversedStr = "";
        System.out.println("String = " + str);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversedStr);
    }

}

