package home.one;

import java.util.Scanner;

public class Shaxmat {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        int A[][]=new int[9][9];
        String ishchilar[]={"shox","vazir","tora","ot","fil","piyoda"};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j==0){
                    A[i][0]=(8-i);
                } else if (i==9-1) {
                    if(j==0){
                        A[9-1][0]=0;
                    }else {
                        A[9 - 1][j] = ((j-1) + 1);
                    }
                }else if((j+i)%2==0){
                    A[i][j]=1;
                }else{
                    A[i][j]=0;
                }
                if(j==0 && i!=8){
                    System.out.print(A[i][j]);
                } else if (i==8) {
                    System.out.print(A[i][j]+"\t \t");
                } else if(j==9-1){
                    System.out.print("\t|\t"+A[i][j]+"\t|\t");
                }else {
                    System.out.print("\t|\t" + A[i][j]);
                }
            }
            System.out.println("\n");
        }

    }
}
