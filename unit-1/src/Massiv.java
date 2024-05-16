import javax.swing.*;

public class Massiv {
    public static void main(String[] args) {
        String num= JOptionPane.showInputDialog("Massiv elementlari soni: ");
        int n=Integer.parseInt(num);
        int a[] = new int [n];
        for (int i = 0; i < a.length; i++) {
            String num1=JOptionPane.showInputDialog("A["+(i+1)+"]=");
            int n1=Integer.parseInt(num1);
            a[i]=n1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("A["+(i+1)+"]="+a[i]);
        }
        System.exit(0);
    }
}
