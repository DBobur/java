package pdp.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);

        //todo: example one
//        int a=scInt.nextInt();
//        if(a%15!=0){
//            System.out.println(a/15+1);
//        }else
//            System.out.println(a/15);

        //todo: example two
//        int  number1=scInt.nextInt();
//        int  number2=scInt.nextInt();
//        int  number3=scInt.nextInt();
//        int  number4=scInt.nextInt();
//        int  number5=scInt.nextInt();
//        System.out.println("max: "+max(max(max(number1,number2),max(number3,number4)),number5));

        //todo: example three
        int a=scInt.nextInt();
        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    System.out.println("this is a leap year");
                }else{
                    System.out.println("this is not a leap year");
                }
            }else{
                System.out.println("this is a leap year");
            }
        }else{
            System.out.println("this is not a leap year ");
        }

    }

    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}

