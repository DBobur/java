public class MiniProyect1 {

    public static void main(String[] args) {
        int a=10;
        System.out.println("Shifrlash kodi. Aslini bilmadim, o'zing topib ol");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i%2!=0){
                    if(j%2!=0){
                        if(j!=a-1)
                            System.out.print("|"+i+""+j+"=");
                        else System.out.print("\t");
                    }
                    else{
                        if(j!=0)
                            System.out.print(i*j+"|\t");
                        else System.out.print("\t");
                    }
                }
                else
                    if(j%2==0){
                        if(j!=a-1)
                            System.out.print("|"+i+""+j+"=");
                        else System.out.print("\t");
                    }
                    else{
                        if(j!=0)
                            System.out.print(i*j+"|\t");
                        else System.out.print("\t");
                    }
            }
            System.out.println();
        }
    }
}
