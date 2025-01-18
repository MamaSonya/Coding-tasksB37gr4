package SilviWeeklyTask;

public class FindUniqueChars_W7 {

    public static void main(String[] args) {
        String original="aaaabbbcdddefffg";
        String result=FundUniqueChar(original);
        System.out.println("Unique Chars in Original String = "+result);
    }

    public static String FundUniqueChar(String original){
        String result="";
        for (int i = 0; i <= original.length()-1; i++) {
            char a=original.charAt(i);
            if(original.indexOf(a)==original.lastIndexOf(a)){
                result+=a;
            }
        }
        return result;
    }
}

/*
I am using a simple for loop to iterate over each character in the original string
Checking if the original character appears only once in the String with the condition:
original.indexOf(a)==original.lastOfIndex(a)
If the character is unique is added to the result string
 */