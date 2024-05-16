import java.util.Scanner;

public class Matritsalar1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j]=(int)(Math.random()*100);
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
