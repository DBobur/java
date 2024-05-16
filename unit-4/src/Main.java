import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Obektlar soni: ");
        int n= sc.nextInt();
        Banks objects[]=new Banks[n];
        for (int i = 0; i < n; i++) {
            Banks obj=new Banks();
            objects[i]=obj;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("===== "+(i+1)+"-Obyect =====");
            objects[i].setMain();
        }
        sc=new Scanner(System.in);
        String id="";
        while (true && id=="next"){
            System.out.print("Connected objects setId: ");
            id=sc.nextLine();
            for (int i = 0; i < n; i++) {
                if(id.equals(objects[i].getId())){
                    System.out.println(objects[i].toString());
                    break;
                }else if(i==n-1){
                    System.out.println("IdName Error!");
                }
            }
        }
    }
}