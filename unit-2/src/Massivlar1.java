import java.util.*;
import javax.swing.*;

public class Massivlar1 {
    public static void main(String[] args) {
        System.out.print("massiv elementlari soni: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
//            System.out.print("A["+(i+1)+"]=");
            int n1=(int)(Math.random()*100);
            a[i]=n1;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println("A["+(i+1)+"]="+a[i]);

        }
//        192 535 8226
    }
}
