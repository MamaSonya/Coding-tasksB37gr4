package yassine_shares;

public class reverseString {

    public static String reverseString(String input) {

        StringBuilder reservedStr = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {

            reservedStr.append(input.charAt(i));
        }

        return reservedStr.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseString("troy"));
    }
}