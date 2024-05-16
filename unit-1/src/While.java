public class While {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=10){
//            int j=1;
//            while(j<=10){
//                System.out.print(j+"*"+i+"="+i*j+"\t\t");
//               j++;
//            }
//            System.out.println();
//            i++;
//        }
        int i=1;
        do{
           int j=1;
           do {
               System.out.print(j+"*"+i+"="+i*j+"\t\t");
               j++;
           }while(j<10);
           System.out.println();
           i++;
        }while (i<10);
    }
}
