package SilviWeeklyTask;

import java.util.Scanner;

public class Number_FINRA_DivisibleBy3_5 {

    public static void main(String[] args) {

        for (int i = 1; i <=30; i++) {
            if (i%3==0&&i%5==0){
                System.out.print("FINRA"+" ");
            } else if (i%3==0) {
                System.out.print("FIN"+" ");
            } else if (i%5==0) {
                System.out.print("RA"+" ");
            }else{
                System.out.print(i+" ");
            }

        }


        //Finra(30);

        //FinraArray();
        //FinraScanner();
        //FinraSwitch(30);

    }
    public static void Finra(int num){
        for (int i = 1; i <=num; i++) {
            if (i%3==0&&i%5==0){
                System.out.print("FINRA"+" ");
            } else if (i%3==0) {
                System.out.print("FIN"+" ");
            } else if (i%5==0) {
                System.out.print("RA"+" ");
            }else{
                System.out.print(i+" ");
            }

        }
    }
    //---------------------------------------------------
    //array and for each loop
    public static void FinraArray(){
        int[] num={1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};
        for(int each:num){
         if(each%3==0&&each%5==0){
             System.out.print("FINRA"+" ");
         }else if(each%3==0){
             System.out.print("FIN"+" ");
         }else if(each%5==0){
             System.out.print("RA"+" ");
         }else {
             System.out.print(each+" ");
         }
     }
    }
    //---------------------------------------------------
    //scanner
    public static void FinraScanner(){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number for FINRA game:");
        int input=reader.nextInt();

        if(input%3==0&&input%5==0){
            System.out.print("FINRA"+" "+"Your number is divisible by 3 and 5.");
        }else if(input%3==0){
            System.out.print("FIN"+" "+"Your number is divisible by 3.");
        }else if(input%5==0){
            System.out.print("RA"+" "+"Your number is divisible by 5.");
        }else {
            System.out.print(input+" "+"Your number is not divisible by 3 or 5 or both.");
        }

    }

    //-----------------------------------------------------
    //using switch
    public static void FinraSwitch(int num){
        for (int i = 1; i <=num ; i++) {
            String result="";
            if(i%3==0&&i%5==0){
                result="FINRA";
            } else if (i%3==0) {
                result="FIN";
            } else if (i%5==0) {
                result="RA";
            }
            switch (result){
                case "FINRA":
                    System.out.print("FINRA"+" ");
                    break;
                case "FIN":
                    System.out.print("FIN"+" ");
                    break;
                case "RA":
                    System.out.print("RA"+" ");
                    break;
                default:
                    System.out.print(i+" ");
                    break;
            }
        }
    }
}

 /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

//Silvi is volunteer
// 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA