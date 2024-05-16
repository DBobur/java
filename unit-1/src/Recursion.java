import java.util.Scanner;

public class Recursion {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("n=");
        num=sc.nextInt();
        System.out.println(factorial(num));
    }
}
