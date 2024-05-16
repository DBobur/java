public class Hello {
    public enum Days { sun, mon, tue, wed, thu, fri, sat }
    public static void main(String[] args){
        Days[] a = Days.values();
        for(Days b: a){
            switch(b){
                case sun: System.out.println("Dushanba"); break;
                case mon: System.out.println("Seshanba"); break;
                case tue: System.out.println("Chorshanba"); break;
                case wed: System.out.println("Payshanba"); break;
                case thu: System.out.println("Juma"); break;
                case fri: System.out.println("Shanba"); break;
                case sat: System.out.println("Yakshanba"); break;
                default: System.out.println("Bunday hafta yo'q!");
            }
        }

//        int a=30;
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(a--);
//        System.out.println(-- a);
//        int b=6;
//        boolean c=true;
//        boolean d=false;
//        System.out.println(a>b);
//        System.out.println(!c);
//        System.out.println(!d);
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        int a = 4;
//        int b = 7;
//         if(a>b){
//             System.out.println(true);
//         }
//         else{
//             System.out.println(false);
//         }
//         if (a%2==0) {
//             System.out.println(a);
//         } else if (b%2==0) {
//             System.out.println(b);
//         } else {
//             System.out.println(false);
//         }

//        int num=67;
//        String result = (num % 2 == 0) ? "bu juft son" : "bu toq son";
//        System.out.println(result);

//        int n=2;
//        switch(n){
//            case 1: System.out.println("Salom Duny! 1"); break;
//            case 2: System.out.println("Salom Duny! 2"); break;
//            default: System.out.println("Error?");
//        }

//        System.out.println("""
//                Hello!
//                World!""");
//        System.out.println("Salom Dunyo!");

//        int a=45;
//        int b=90;
//        int c=34;
//        System.out.println(a+b+c);
//        float a1=a;
//        float b1=23.45f;
//        int c1=(int)b1;
//        System.out.println(c1);
//        int a2=15;
//        byte b2=(byte)a2;
//        byte c2=10;
//        byte d=(byte) (b2+c2);
//        System.out.println(a2);
//        System.out.println(b2);
//        System.out.println(d);


    }
}
