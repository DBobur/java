public class For {
    public static void main(String[] args) {
//        for(int i=0; i<10; i++){
//            for(int j=0; j<10; j++) {
//                System.out.print("*  ");
//            }
//            System.out.print("\n");
//        }
//        int a=0;
//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 11; j++) {
//                System.out.print(j+"*"+i+"="+i*j+"\t\t");
//
//            }
//            System.out.print("\n");
//
//        }
//        System.out.println();
//        for(int i=10; i>=1; i--){
//            for(int j=10; j>=1; j--){
//                System.out.print(i*j+":"+j+"="+j+"\t\t");
//            }
//            System.out.println();
//        }
        int array[] ={9,8,7,6,5};
        for(int b:array){
            System.out.println(b);
        }
        a:
        for(int a=0; a<5; a++){
            System.out.print("1____");
            b:
            for (int i = 0; i < 5; i++) {
                if(a==3 && i==3){
                    break a;
                }
                System.out.print(a+"  -  "+i);
            }
            System.out.println();
        }

    }
}
