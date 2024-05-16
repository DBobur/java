import javax.swing.*;
import java.util.Arrays;

public class Kiritish {
    public static void main(String[] args) {
        String print= JOptionPane.showInputDialog("What is your name: ");
        String age=JOptionPane.showInputDialog("How old are you: ");
        String age1=JOptionPane.showInputDialog("How old are you1: ");
        String age2=JOptionPane.showInputDialog("How old are you2: ");
        int a=Integer.parseInt(age);
        double a1=Double.parseDouble(age1);
        float a2=Float.parseFloat(age2);
        System.out.println(print+" "+a+" "+a1+" "+a2);
    }
}
