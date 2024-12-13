package yassine_shares;


//Write a return method that can reverse
//negative number and return it as int
//
//      Ex:
//      input => -456
//      output => -654
public class Number_Reverse_Negative {

    public static void main(String[] args) {
        System.out.println(negativeReverser(-456));
    }
    public static int negativeReverser(int num){
        int rev = 0;

        num = Math.abs(num);
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return -rev;
    }
}
