package pdp.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        //todo: example one
//        int n=scInt.nextInt(),fact=1,i1=1;
//        for (int i = 1; i <=n; i++) {
//            fact*=i;
//        }

        //todo: example two
//        int n=scInt.nextInt(),fact=1,i1=1;
//        while(i1<=n){
//            fact*=i1;
//            i1++;
//        }
//        System.out.println(fact);

        //todo: example three
//        System.out.println(faktt(6));

        //todo: example four
//        tubNumber(scInt.nextInt());

        //todo: example five
//        fibanachi(scInt.nextInt());

        //todo: example six
//        System.out.println(kopaytma(10));

        //todo: example seven
//        polindrom(200);

        //todo: example eight
//        System.out.println(polindromTrue(45546));

        //todo: example ten
//        karaJadval();
//        System.out.println();
//        teskariKaraJadval();
//        shakllar(20);
//        shakllar1(10);
        shaklla3(20);
        shakllar2(20);
        System.out.println();
        shakllar4(20);

    }


    public static int faktt(int n){
        int fakt=1,i=1;
        while(i<=n){
            fakt*=i;
            i++;
        }
        return fakt;
    }
    public static void tubNumber(int n){
        int i=2;
        while (i<=n){
            int j=1;
            while (j<i){
                if(i%j==0 && j!=1){
                    break;
                } else if (j==i-1 || i==2) {
                    System.out.print(i+" ");
                }
                j++;
            }
            i++;
        }
    }
    public static void fibanachi(int n){
        int a=1,b=0,c=a+b;
        while(c<=n){
            System.out.println(c);
            a=b;b=c;
            c=a+b;
        }
    }
    public static void polindrom(int n){
        int i=11;
        while(i<=n){
            int j=i;
            int raqam=0,m=i;
            while(m>=10){
                raqam++;
                m=m/10;
            }
            while(true) {
                if (j % 10 != j / (int) (Math.pow(10, raqam))) {
                    break;
                } else if(j==0){
                    System.out.println(i);
                    break;
                }
                j = j / (int) (Math.pow(10, raqam));
                j = j / 10;
                }
            i++;
            }
        }
    public static int kopaytma(int n){
        int kop=1;
        for (int i = 1; i <= n; i++) {
            if(i%2==1){
                kop*=i;
            }
        }
        return kop;
    }
    public static boolean polindromTrue(int n){
        boolean truee=false;
        while(true) {
            int raqam=0,m=n;
            while(m>=10){
                raqam++;
                m=m/10;
            }
            if (n % 10 != n / (int) (Math.pow(10, raqam))) {
                break;
            } else if(n==0){
                truee=true;
                break;
            }
            n = n / (int) (Math.pow(10, raqam));
            n = n / 10;
        }
        return truee;
    }
    public static void karaJadval(){
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t\t");

            }
            System.out.print("\n");

        }
    }
    public static void teskariKaraJadval(){
        System.out.println();
        for(int i=10; i>=1; i--){
            for(int j=10; j>=1; j--){
                System.out.print(i*j+":"+j+"="+(i*j)/j+"\t\t");
            }
            System.out.println();
        }
    }
    public static void shakllar(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void shaklla3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1 || i==n-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void shakllar1(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void shakllar2(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1 || i==n-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void shakllar4(int n){
        int m=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==i || j==m || j==0 || i==n-1 || i==0 || j==0 || j==n-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            m--;
            System.out.println();
        }
    }
}
