package pdp.lesson6;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);

        //todo: example one
        System.out.print("n: ");
        int n=scInt.nextInt(),a=0,b=0;
        String A[][]=new String[10][10],yangi="";
        for (int i = 0; i < 10; i++) {
            for(int y=0; y<n; y++) {
                for (int j = 0; j < 10; j++) {
                    if(i==0 || j==9 || j==0 || i==9) {
                        for (int k = 0; k < n; k++) {
                                System.out.print("|||");
                                yangi += "|||";
                        }
                    }else if ((j % 2 == 0 && i % 2 == 0) || (j % 2 != 0 && i % 2 != 0)) {
                        for (int k = 0; k < n; k++) {
                                System.out.print("   ");
                                yangi+="   ";
                        }
                    } else {
                        for (int k = 0; k < n; k++) {
                                System.out.print("*  ");
                                yangi+="*  ";
                        }
                    }
                }
                yangi+="\n";
                System.out.print("\n");
            }
            yangi+="\n";
            System.out.print("\n");
        }
        System.out.println("\n"+yangi);

        //todo: example two
//        String a="*  *  *  ",b="         ";
//        String A[][]=new String[8][8];
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
//                    A[i][j]=b;
//                }else{
//                    A[i][j]=a;
//                }
//            }
//        }
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(A[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(A[1][4]);
    }
}
