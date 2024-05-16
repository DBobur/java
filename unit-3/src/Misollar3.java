import java.util.*;

public class Misollar3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        System.out.print("n: ");/////////////// 1
//         int n = sc.nextInt(), A[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("A["+i+"]=");
//            int a= sc.nextInt();
//            A[i]  = a;
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(A[i]<A[j]){
//                    A[i]=A[i]+A[j];
//                    A[j]=A[i]-A[j];
//                    A[i]=A[i]-A[j];
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(A[i]+"  ");
//        }
//        System.out.println();
//        System.out.print("\nSiz qidiryotgan son: ");
//        int q_son= sc.nextInt();
//        int begin = 0,end=n-1;
//        while (begin<=end){
//            int index=(begin+end)/2;
//            int natija=A[index];
//            if(natija==q_son){
//                System.out.println(index+" : "+natija);
//                break;
//            } else if (natija>q_son) {
//                begin=index+1;
//            }else {
//                end=index-1;
//            }
//        }

        System.out.print("n: ");////////////// 2
        int n= sc.nextInt();
        int A[]=new int[String.valueOf(n).length()];
        int C[]=new int[2*String.valueOf(n).length()];
        String A1[]={"bir","ikki","uch","to'rt","besh","olti","yetti","sakkiz","to'qqiz"};
        String B[]={"o'n","yigirma","o'ttiz","qirq","ellik","oltmish","yetmish","sakson","to'qson","yuz","ming","million"};
        String B1[]=new String[2*String.valueOf(n).length()];
        int str=0,i1=0,cc=0;
        do{
            A[i1]=(n/(int)(Math.pow(10,String.valueOf(n).length()-1)))*(int)(Math.pow(10,String.valueOf(n).length()-1));
            i1++;
            n=n%(int)(Math.pow(10,String.valueOf(n).length()-1));
        }while(n>0);
        for (int i = 0; i < i1; i++) {
            System.out.print(A[i]+"  ");
        }
        for (int i = 0; i < i1; i++) {
           if(A[i]>=10000 && A[i]<1000000){
               C[cc]=A[i]/1000; cc++;
           } else if (A[i]>=10000000 && A[i]<1000000000) {
               C[cc]=A[i]/1000000; cc++;
           } else {
               C[cc]=A[i]; cc++;
           }
        }
        System.out.println();
        for (int i = 0; i < cc; i++) {
            int nol=String.valueOf(C[i]).length()-1;
            int son=C[i]/(int)(Math.pow(10,nol));
            if(String.valueOf(C[i]).length()==2){
                switch (C[i]){
                    case 10: { B1[str]=B[0]; str++; } break;
                    case 20: { B1[str]=B[1]; str++; } break;
                    case 30: { B1[str]=B[2]; str++; } break;
                    case 40: { B1[str]=B[3]; str++; } break;
                    case 50: { B1[str]=B[4]; str++; } break;
                    case 60: { B1[str]=B[5]; str++; } break;
                    case 70: { B1[str]=B[6]; str++; } break;
                    case 80: { B1[str]=B[7]; str++; } break;
                    case 90: { B1[str]=B[8]; str++; } break;
                }
            } else{
            switch (son){
                case 1: {B1[str]=A1[0]; str++;} break;
                case 2: {B1[str]=A1[1]; str++; } break;
                case 3: {B1[str]=A1[2]; str++; } break;
                case 4: {B1[str]=A1[3]; str++; } break;
                case 5: {B1[str]=A1[4]; str++; } break;
                case 6: {B1[str]=A1[5]; str++; } break;
                case 7: {B1[str]=A1[6]; str++; } break;
                case 8: {B1[str]=A1[7]; str++; } break;
                case 9: {B1[str]=A1[8]; str++; } break;
            }
            if(nol>0)
                switch (nol){
                    case 2: { B1[str]=B[9]; str++; } break;
                    case 3: { B1[str]=B[10]; str++; } break;
                    case 6: { B1[str]=B[11]; str++; } break;
                }
            }
        }
        for (int i = 0; i < str; i++) {
            System.out.print(B1[i]+" ");
        }

//        System.out.print("Yilni kiriting: ");
//        int year=sc.nextInt();
//        System.out.print("Oyni kiriting: ");
//        int math=sc.nextInt();
//        System.out.print("Kunni kiriting: ");
//        int day=sc.nextInt(),kuni=day;
//        int A[]={31,28,31,30,31,30,31,31,30,31,30,31};
//        String oy=" ";
//        switch (math){
//            case 1: oy="Yanvar"; break;
//            case 2: oy="Fevral"; break;
//            case 3: oy="Mart"; break;
//            case 4: oy="Aprel"; break;
//            case 5: oy="May"; break;
//            case 6: oy="Iyun"; break;
//            case 7: oy="Iyul"; break;
//            case 8: oy="Avgust"; break;
//            case 9: oy="Sentabr"; break;
//            case 10: oy="Oktabr"; break;
//            case 11: oy="Noyabr"; break;
//            case 12: oy="Dekabr"; break;
//        }
//        if(year%4==0){
//            if(year%100==0){
//                if(year%400==0){
//                    A[1]=29;
//                }
//            }else{
//                A[1]=29;
//            }
//        }
//        for (int i = 0; i < math-1; i++) {
//            day+=A[i];
//        }
//        for (int i = 1902; i < year; i++) {
//            if(i%4==0){
//                if(i%100==0){
//                    if(i%400==0){
//                        day+=366;
//                    }else {
//                        day+=365;
//                    }
//                }else{
//                    day+=366;
//                }
//            }else{
//                day+=365;
//            }
//        }
//        day=day%7;
//        switch (day){
//            case 1:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Chorshanba"); break;
//            case 2:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Payshanba"); break;
//            case 3:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Juma"); break;
//            case 4:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Shanba"); break;
//            case 5:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Yakshanba"); break;
//            case 6:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Dushanba"); break;
//            case 0:
//                System.out.println("Javob: "+year+"-yil "+kuni+"-"+oy+" --> Seshanba"); break;
//        }
        System.out.println();
        main(new String[5]);
    }
}
