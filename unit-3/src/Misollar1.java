import java.util.Scanner;
import java.util.Date;

public class Misollar1 {

//    public enum Days{
//        1,2,3,4,5,6,0
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Uzunlik kiriting (sm): ");/////////////// 1
//        int sm=sc.nextInt();
//        float m=(float) sm/100;
//        System.out.println(sm+" sm--m "+m);

//        System.out.print("og'irlik kiriting (kg): ");/////////////// 2
//        int a=sc.nextInt();
//        float t=(float) a/1000;
//        System.out.println(a+" kg--t "+t);

//        System.out.print("o'lcham kiriting (bayt): ");/////////////// 3
//        int byt=sc.nextInt();
//        int bit=(int) byt*8;
//        System.out.println(byt+" bayt--bit "+bit);

//        System.out.print("kesma kiriting: ");/////////////// 4
//        int a=sc.nextInt(),b= sc.nextByte();
//        int c;
//        if(a>b){
//            c=a/b;
//            System.out.println("a kesmani ichiga b kesmadan max:"+c+" ta joylash mumkin!");
//        }
//        else{
//            c=b/a;
//            System.out.println("b kesmani ichiga a kesmadan max:"+c+" ta joylash mumkin!");
//        }

//        System.out.print("a kesmani kiriting: ");/////////////// 5
//        int a=sc.nextInt();
//        System.out.print("b kesmani kiriting: ");
//        int b=sc.nextInt();
//        int c=a/b,d=a%b;
//        System.out.println("max: "+c+" ta kesma joylash mumkin va "+d+" o'rin ortib ham qoladi!");

//        int a=sc.nextInt();/////////////// 6
//        int ong=a/10,chap=a%10;
//        System.out.println("o'ng: "+ong+"\nchap: "+chap);

//        long a=sc.nextInt();/////////////// 7
//        int sum=0,kop=1,son=0;
//        do{
//            sum+=a%10;
//            kop*=a%10;
//            a=a/10;
//            son++;
//        }while(a>=10); sum+=a; kop*=a; son++;
//        System.out.println("summa: "+sum+"\nkopaytma: "+kop+"\nraqamlari soni: "+son);

//        int a=sc.nextInt();//////////////// 8
//        int a1=a/10,a2=a%10,a3=a2*10+a1;
//        System.out.println((int)Math.pow(a3,2));

//        int a=sc.nextInt(),b=0;/////////////// 9
//        while(a>=10){
//            String raqamlar=String.valueOf(a);
//            int a1=a%10,ee=raqamlar.length()-1;
//            b+=Math.pow(10,ee)*a1;
//            a=a/10;
//        }b+=a;
//        System.out.println(b*2);

//        int a=sc.nextInt();/////////////// 10
//        int b=(String.valueOf(a)).length()-1,b1=0;
//        b1=a%10;
//        a+=b1*Math.pow(10,b)+a/10-a;
//        System.out.println(a);

//        int a=sc.nextInt();/////////////// 11
//        int b=(String.valueOf(a)).length()-1,b1=0;
//        b1+=a/Math.pow(10,b);
//        a+=(a%Math.pow(10,b))*10+b1-a;
//        System.out.println(a);

//        int a=sc.nextInt();/////////////// 12
//        int b=(String.valueOf(a)).length()-1,b1=0,b2=0;
//        b1+=(a/Math.pow(10,b-1))%10;
//        b2+=(a/Math.pow(10,b-1))/10;
//        a+=b1*Math.pow(10,b)+b2*Math.pow(10,b-1)+a%Math.pow(10,b-1)-a;
//        System.out.println(a);

//        int a=sc.nextInt(),n=(String.valueOf(a).length()),son=0,d=0;/////////////// 13
//        int A[]=new int[n];
//        System.out.print("almashlanuvchi 1-son: ");
//        int b=sc.nextInt();
//        System.out.print("almashlanuvchi 2-son: ");
//        int c=sc.nextInt();
//        for (int i = 0; i<n; i++) {
//            A[i]=a%10;
//            a=a/10;
//        }
//        for (int i = 0; i < n; i++) {
//            if(A[i]==b)
//                A[i]=c;
//            else if(A[i]==c)
//                A[i]=b;
//        }
//        for (int i = 0; i < n; i++) {
//            son+=A[i]*Math.pow(10,d);
//            d++;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(A[i]+" ");
//        }
//        System.out.println("\n"+son);

//        int a=sc.nextInt(),n=(String.valueOf(a)).length(),a1=1;/////////////// 14
//        int A[]=new int[n];
//        for (int i = 0; i < n; i++) {
//            A[i]=a%10;
//            a=a/10;
//        }
//        int qs=sc.nextInt(),index=1;
//        for (int i = n-1; i >= 0; i--) {
//            if(A[i]==qs){
//                break;
//            }
//            else{
//                index++;
//            }
//        }
//        System.out.println("siz qidirgan sonni o'rni: "+index);

        System.out.print("yilni kiriting: ");/////////////// 15
        int yil=sc.nextInt(),oy,kun,qq=2;
        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    qq=1;
                }else qq=2;
            }else qq=1;
        }else qq=2;
        System.out.print("oyni kiriting: ");
        oy=sc.nextInt();
        System.out.print("kunni kiritng: ");
        kun=sc.nextInt();
        switch (oy){
            case 12: kun+=0;//dekabir
            case 11: if(oy!=11) kun+=30;//noyabir
            case 10: if(oy!=10) kun+=31;//oktabir
            case 9: if(oy!=9) kun+=30;//sentabir
            case 8: if(oy!=8) kun+=31;//avgust
            case 7: if(oy!=7) kun+=31;//iyul
            case 6: if(oy!=6) kun+=30;//iyun
            case 5: if(oy!=5) kun+=31;//may
            case 4: if(oy!=4) kun+=30;//aprel
            case 3: if(oy!=3) kun+=31;//mart
            case 2: if(oy!=2) kun+=30-qq;//fevral
            case 1: if(oy!=1) kun+=31;//yanvar
        }
        System.out.print("Aynan o'sha kuni: ");
            switch (kun%7){
                case 1:
                    System.out.println("Shanba"); break;
                case 2:
                    System.out.println("Yakshanba"); break;
                case 3:
                    System.out.println("Dushanba"); break;
                case 4:
                    System.out.println("Seshanba"); break;
                case 5:
                    System.out.println("Chorshanba"); break;
                case 6:
                    System.out.println("Payshanba"); break;
                case 0:
                    System.out.println("Juma"); break;
            }

    }
}
