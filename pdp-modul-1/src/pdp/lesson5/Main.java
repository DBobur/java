package pdp.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);

//        System.out.println("3 ta son ko'paymasi: "+plus3(2,6,8));
//        System.out.println("sonni verguldan keyingi qismi: "+qismFloat(4));
//        plus3(3,5,7);
//        System.out.println(max3(5,6,8));
//        System.out.println(arifmetik());
//        System.out.println(factarial(5));
//        System.out.println(numberPlus(123));
//        System.out.println(uchburchak(4,5,6));
//        System.out.println(tubNumber(6));
//        println(15);
        System.out.println(tubNumber(9,0));
        System.out.println(tubNumber(13,0));
//        System.out.println(plus(5));


    }
    static int plus3(int a, int b, int c){
        System.out.println("hello number!");
        return a*b*c;
    }
    static float qismFloat(float a){
        return a%1;
    }
    static int max3(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }
    }
    static float arifmetik(){
        Scanner scInt=new Scanner(System.in);

        int a=scInt.nextInt();
        int b=scInt.nextInt();
        int c=scInt.nextInt();
        return (a+b+c)/3;
    }
    static int factarial(int n){
        if(n==1){
            return 1;
        }else
            return n*factarial(n-1);
    }
    static int numberPlus(int n){
        if(n==1){
            return 1;
        }else
            return (n % 10) + numberPlus(n / 10);
    }
    static int tubNumbers(int n){
        return 0 ;
    }
    //todo: shu misolni ishlayolmadim
    static int tubNumber(int n,int qoshiluvchi){
        int boluvchi=n-1;
        if(n!=2 && (n+qoshiluvchi)%boluvchi==0){
            return 0;
        }else if(boluvchi==1){
            return 1;
        }else{
            return tubNumber(n-1,++qoshiluvchi);
        }
    }
    static float uchburchak(int a, int b, int c){
        float yarm=(a+b+c)/2;
        return (float)(Math.sqrt(yarm*(yarm-a)*(yarm-b)*(yarm-c)));
    }
    static void println(int n){
        if(n>=1){
            println(n-1);
            System.out.println(n);
        }
    }
    static int plus(int n){
        if(n>0)
            return n+plus(n-1);
        else
            return 0;
    }
}
