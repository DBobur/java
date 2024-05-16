import java.util.*;

public class Misollar4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.print("Nechta sonni EKUB qiymati kerak n: ");/////////////// 1
//        int n=sc.nextInt(),A[]=new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("son "+(i+1)+": ");
//            int a= sc.nextInt(); A[i]=a;
//        }
//        int EKUB=A[0],oson=0,B[]=new int[EKUB/2],m=0;
//        for (int i = 0; i < n; i++) {
//            if(A[i]<EKUB)
//                EKUB=A[i];
//        }
//        for (int i = 1; i <= (EKUB/2)+1; i++) {
//            if(EKUB%i==0){
//                B[m]=i;
//                m++;
//            }
//        }
//        while (oson!=n){
//            oson=0;
//            for (int i = 0; i < n; i++) {
//                if(A[i]%EKUB==0){
//                    oson++;
//                }
//            }
//            if(oson!=n && m>0){
//                EKUB=B[(m-1)];
//                m--;
//            }
//        }
//        System.out.println(EKUB);

//        System.out.print("Nechta sonni EKUK qiymati kerak n: ");/////////////// 2
//        int n=sc.nextInt(),A[]=new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("son "+(i+1)+": ");
//            int a= sc.nextInt(); A[i]=a;
//        }
//        int EKUK=A[0],oson=0,B[]=new int[EKUK/2],m=0;
//        for (int i = 0; i < n; i++) {
//            if(A[i]>EKUK)
//                EKUK=A[i];
//        }
//        for (int i = 1; i <= (EKUK/2)+1; i++) {
//            if(EKUK%i==0){
//                B[m]=i;
//                m++;
//            }
//        }
//        while (oson!=n){
//            oson=0;
//            for (int i = 0; i < n; i++) {
//                if(EKUK%A[i]==0 || A[i]%EKUK==0){
//                    oson++;
//                }
//            }
//            if(oson!=n && m>0){
//                EKUK=B[(m-1)];
//                m--;
//            }
//        }
//        System.out.println(EKUK);

        System.out.print("n: ");
        int n= sc.nextInt();
        int A[]=new int[n];
        for (int i = 0; i < n; i++) {
            int a= sc.nextInt();
            A[i]=a;
        }
        int maxA,maxsum=0;
        int minA,minsum=0,n1=n;
        System.out.print("(m<n) m: ");
        int m= sc.nextInt();
        for (int i = 0; i < m; i++) {
            maxA=A[0];
            int index=0;
            for (int j = 0; j < n; j++) {
                if(A[j]>maxA){
                    maxA=A[j]; index=j;
                }
            }
            maxsum+=maxA;
            int c=A[index];
            A[index]=A[n-1];
            A[n-1]=c;
            n--;
        }
        for (int i = 0; i < n1; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            minA=A[0];
            int index=0;
            for (int j = 0; j < n1; j++) {
                if(A[j]<minA){
                    minA=A[j]; index=j;
                }
            }
            minsum+=minA;
            int c=A[index];
            A[index]=A[n1-1];
            A[n1-1]=c;
            n1--;
        }
        System.out.println("MaxSum: "+maxsum+"\nMinSum: "+minsum);
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
