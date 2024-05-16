import java.util.Random;
import java.util.Scanner;

public class Misollar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.print("massiv elementlari soni: ");/////////////// 1
//        int n=sc.nextInt(),A[]=new int[n],index1=0,index2=0;
//        int index3=0,index4=0,index5=0,index6=0;
//        for (int i = 0; i < n; i++) {
//            int a=sc.nextInt();
//            A[i]=a;
//        }
//        int min=A[0],max=A[0],min1=A[0],max1=A[0],max2=A[1],min2=A[1];
//        for (int i = 0; i < n; i++) {
//            if(A[i]<min) {
//                min = A[i];
//                index1=i;
//            }
//            if(A[i]>max){
//                max=A[i];
//                index2=i;
//            }
//            if(A[i]<min1 && i%2==1){
//                min1=A[i];
//                index3=i;
//            }
//            if(A[i]>max1 %% i%2==1){
//                max1=A[i];
//                index4=i;
//            }
//            if(A[i]<min2 %% i%2==0){
//                min2=A[i];
//                index5=i;
//            }
//            if(A[i]>max2 i%2==0){
//                max2=A[i];
//                index6=i;
//            }
//        }
//        System.out.println("1. Min: "+index1+" --> "+min);
//        System.out.println("2. Max: "+index2+" --> "+max);
//        System.out.println("3. Min: "+index3+" --> "+min1);
//        System.out.println("4. Max: "+index4+" --> "+max1);
//        System.out.println("5. Min: "+index5+" --> "+min2);
//        System.out.println("6. Max: "+index6+" --> "+max2);

//        System.out.print("massiv elementlari soni: ");/////////////// 2
//        int n=sc.nextInt(),A[]=new int[n],B[]=new int[n];
//        for (int i = 0; i < n*2; i++) {
//            if(i>n-1){
//                System.out.print("B["+((i+1)-n)+"]=");
//                int a=sc.nextInt();
//                B[(i-n)]=a;
//            }
//            else{
//                System.out.print("A["+(i+1)+"]=");
//                int a=sc.nextInt();
//                A[i]=a;
//            }
//        }
//        for (int i = 0; i < n*2; i++) {
//            if(i>n-1)
//                System.out.print(B[(i-n)]+"  ");
//            else
//                System.out.print(A[i]+"  ");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            if(i%2==1){
//                A[i]=A[i]+B[i];
//                B[i]=A[i]-B[i];
//                A[i]=A[i]-B[i];
//            }
//            else{
//                A[i]=A[i]+B[i];
//                B[i]=A[i]-B[i];
//                A[i]=A[i]-B[i];
//            }
//        }
//        for (int i = 0; i < n*2; i++) {
//            if(i>n-1)
//                System.out.print(B[(i+-n)]+"  ");
//            else
//                System.out.print(A[i]+"  ");
//        }

//        int n=sc.nextInt(),A[]=new int[n],B[]=new int[n],C[]=new int[n];/////////////// 3
//        for (int i = 0; i < n*2; i++) {
//            if(i>n-1){
//                System.out.print("B["+((i+1)-n)+"]=");
//            }else{
//                System.out.print("A["+(i+1)+"]=");
//            }
//            int a=sc.nextInt();
//            if(i>n-1){
//                B[i-n]=a;
//            }else{
//                A[i]=a;
//            }
//        }
//        for (int i = 0; i < n*2; i++) {
//            if(i==n)
//                System.out.println();
//            if(i>n-1){
//                System.out.print(B[(i+-n)]+"  ");
//            }else{
//                System.out.print(A[i]+"  ");
//                C[i]=A[i]*B[i];
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(C[i]+"  ");
//        }

//        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),A[]=new int[n];/////////////// 4
//        for (int i = 0; i < n; i++) {
//            A[i]=a-(i*b);
//            System.out.print(A[i]+"  ");
//        }

//     int n=sc.nextInt(),A[]=new int[n];/////////////// 5
//        for (int i = 0; i < n; i++) {
//            A[i]=i+2;
//        }
//        for (int i = 0; i < n; i++) {
//            int a=0;
//            for (int j = 2; j < A[i]; j++) {
//                if(A[i]%j==0)
//                    a++;
//            }
//            if(a==0)
//                System.out.println(A[i]);
//        }

//        int n=sc.nextInt(),A[][]=new int[n][n],B[]=new int[n*n],C[]=new int[n*n];//////////////// 5
//        int a=0,a1=0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                A[i][j]=(int)(Math.random()*100);
//                if(A[i][j]%2==0){
//                    B[a]=A[i][j];
//                    a++;
//                }
//                if(A[i][j]%2==1){
//                    C[a1]=A[i][j];
//                    a1++;
//                }
//            }
//        }
//        for (int i = 0; i < a; i++) {
//            System.out.print(B[i]+"  ");
//        }
//        System.out.println();
//        for (int i = 0; i < a1; i++) {
//            System.out.print(C[i]+"  ");
//        }

        String A[]=new String[4];
        char B[]={'a','o','u','v','e','i'};
        for (int i = 0; i < 4; i++) {
            String a=sc.nextLine();
            A[i]=a;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(A[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int ar=0;
            for (int j = 0; j < A[i].length(); j++) {
                char cr=A[i].charAt(j);
                for (int k = 0; k < 6; k++) {
                    if(cr==B[k]) {
                        ar++;
                        break;
                    }
                }
            }
            System.out.print(ar+"\t");
            ar=0;
        }
    }
}
