public class MiniProyect2 {
    public static void main(String[] args) {
        int a=6,b=7;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
