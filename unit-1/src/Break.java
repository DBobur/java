public class Break {
    public static void main(String[] args) {
        a:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==3 && j==0)
                    break a;
                System.out.print(j+" ");

            }
            System.out.println("==="+i);

        }
    }
}
