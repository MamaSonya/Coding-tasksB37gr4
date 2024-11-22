package MarinaTaskSolution;

public class OddOrEven {

    public static String result (int num){

        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(result(5));
        System.out.println(result(6));
    }
}




     /*
    Write  a method which can identify given number is even or odd:
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */


