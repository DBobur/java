package pdp.lesson5;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);

        //todo: example one
//        System.out.println(printfN(3));

        //todo: example two
//        System.out.println(sumN(5));

        //todo: example three
//        System.out.println(maxN(5));

        //todo: example four
//        System.out.println(arifmetikN(5,5));

        //todo: example five
//        System.out.println(raqamlarSum(234));

        //todo: example six
//        System.out.println(raqamlarSoni(12345));

        //todo: example seven
//        System.out.println(teskariSon(12345));

        //todo: example eight
//        System.out.println(fibanachi(25));

        //todo: example nine
        qator(10);

    }

    public static int maxN(int n){
        Scanner scInt=new Scanner(System.in);
        int a=scInt.nextInt();
        if(n>1){
            return a>maxN(--n) ? a:maxN(--n);
        }else{
            return a;
        }
    }

    public static String printfN(int n){
        Scanner scInt=new Scanner(System.in);
        int a=scInt.nextInt();
        if(n>1){
            return a+" "+printfN(--n);
        }else{
            return a+"";
        }
    }

    public static int sumN(int n){
        Scanner scInt=new Scanner(System.in);
        int a=scInt.nextInt();
        if(n>1){
            return a+sumN(--n);
        }else{
            return a;
        }
    }

    public static float arifmetikN(int n,int m){
        Scanner scInt=new Scanner(System.in);
        float a=scInt.nextInt();
        if(n>1){
            return (a/m+arifmetikN(--n,m));
        }else{
            return a/m;
        }
    }

    public static int raqamlarSum(int n){
        if(n>0){
            return n%10+raqamlarSum(n/10);
        }else{
            return n;
        }
    }

    public static int raqamlarSoni(int n){
        if(n>0){
            return 1+raqamlarSoni(n/10);
        }else{
            return 0;
        }
    }

    public  static int teskariSon(int n){
        int m=raqamlarSoni(n)-1;
        if(n>0){
            return (n%10)*(int)Math.pow(10,m)+teskariSon(n/10);
        }else{
            return n;
        }
    }

    public static int fibanachi(int n){
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(c);
        a=b;b=c;
        return 0;//todo: shu misolni qilolmadim
    }
    public static void qator(int n){
        if(n==0){
            System.out.print(n);
        }else{
            qator(n-1);
            System.out.print(n);//todo: afsuski bu misolni ishlayolmadim
        }
    }
}
