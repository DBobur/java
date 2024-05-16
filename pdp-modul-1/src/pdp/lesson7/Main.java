package pdp.lesson7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        //todo: example one
        System.out.print(" A_M qatorlar soni n: ");
        int n=scInt.nextInt();
        System.out.print(" A_M (va bu B_M ni qatorlari soni) ustunlar soni m: ");
        int m=scInt.nextInt();
        System.out.print(" B_M ustunlar soni g: ");
        int g=scInt.nextInt();
        int[][] A=new int[n][m];
        int[][] B=new int[m][g];
        int[][] C=new int[n][g];
        kiritQaytarRandom(A);
        kiritQaytarRandom(B);
        System.out.println();
        matritsaKopaytirish(A,B,C);
        //dioganalXY(A);
//        max(A);

        //todo: example two
//        shakl1(8);

        //todo: example three
        borigaBaraka();

    }
    public static void kiritQaytar(int[][] A){
        Scanner scInt=new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print("A["+i+"]["+j+"]=");
                A[i][j]=scInt.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                //System.out.print("A["+i+"]["+j+"]="+A[i][j]+"\t");
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public static void dioganalXY(int A[][]) {
        int dioganal1Sum=0;
        int dioganal2Sum=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(j==i){
                    dioganal1Sum+=A[i][j];
                } else if (j== A[0].length-i-1) {
                    dioganal2Sum+=A[i][j];
                }
            }
        }
        System.out.println(dioganal1Sum+"\t"+dioganal2Sum);
    }
    public static void shakl1(int n) {
        if(n%2==0){
            n+=1;
        }
        for (int i = n/2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if(((i==j || j==n-(i+1)) && i>=n/2) || i==n-1){
                        System.out.print("* ");
                    }else if(i>=n/2){
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
    public static void kiritQaytarRandom(int[][] A) {
        Scanner scInt = new Scanner(System.in);
        Random random=new Random();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = (int) (Math.random() * 5);
            }
            System.out.println();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void max(int[][] A) {
        int max=A[0][0];
        int min=A[0][0];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(max<A[i][j]){
                    max=A[i][j];
                }
                if(min>A[i][j]){
                    min=A[i][j];
                }
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
    public static void matritsaKopaytirish(int[][] A,int[][] B,int[][] C) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                        C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
    public static void borigaBaraka() {
        Scanner scInt=new Scanner(System.in);
        Random random=new Random();

        String A[]={"2 xonali uy","maleboo","spark","gugurt","haladinnik","bankrot","velosaped","yangi do'st"};
        a:
        while(true){
            System.out.println("0=> tugatish\t1=> o'ynash");
            System.out.print("kiriting: ");
            int halQil=scInt.nextInt();
            if(halQil==1) {
                int randomQiymat = (int) (Math.random() * 8);
                switch (randomQiymat) {
                    case 0 -> System.out.println(A[0]);
                    case 1 -> System.out.println(A[1]);
                    case 2 -> System.out.println(A[2]);
                    case 3 -> System.out.println(A[3]);
                    case 4 -> System.out.println(A[4]);
                    case 5 -> System.out.println(A[5]);
                    case 6 -> System.out.println(A[6]);
                    case 7 -> System.out.println(A[7]);
                }
            } else if (halQil==0) {
                break a;
            }
        }
    }
}
