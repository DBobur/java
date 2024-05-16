package home.one;

import java.util.Scanner;

public class Misol1 {

    public static void tubNumbers(int n){
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if(i%j==0 && i!=2 ){
                    break;
                }else if(j==i-1 || i==2){
                    System.out.print(i+"  ");
                }
            }
        }
    }

    public static void nowNumber(String str){
        String a[]={"0","1","2","3","4","5","6","7","8","9","+","/","*","-",",",".","'","\""};
            for (int j = 0; j < a.length; j++) {
                str=str.replace(a[j],"");
            }
        System.out.println(str);
    }

    public static void main(String[] args) {

        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        //todo: example one
//        System.out.print("n: ");
//        int n=scInt.nextInt(),m=1;
//        for (int i = 0; i < m; i++) {
//            if(Math.pow(3,i)==n){
//                System.out.println("Bu son 3 ni darajasi");
//                break;
//            }
//            if(Math.pow(3,i)<n){
//                m++;
//            }else{
//                System.out.println("bu son 3 ni darajasi emas!");
//            }
//        }

        //todo: example two
//        System.out.print("a: ");
//        int a=scInt.nextInt();
//        System.out.print("n: ");
//        int n=scInt.nextInt();
//        System.out.println(a+"^"+n+" = "+(int)Math.pow(a,n));

        //todo: example three
//        System.out.print("n: ");
//        int n=scInt.nextInt();
//        tubNumbers(n);

        //todo: example four
//        String str1="salom";
//        String str2="salomlar"+str1;

        //todo: example five
        System.out.print("Belgi, son va harflardan iborat satr kiriting: ");
        String str=scStr.nextLine();
        nowNumber(str);

        //todo: example six
//        String a="salom";
//        String b="dunyo";
//        System.out.println(a+"\t"+b);

        //todo: example seven
//        System.out.println("salom \f ishlar yaxshimi!");

        //todo: example eight


    }
}
