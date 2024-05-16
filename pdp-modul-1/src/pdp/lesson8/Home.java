package pdp.lesson8;

public class Home {
    public static void main(String[] args) {
        System.out.println(endsLy("dhbjshrely"));
    }

    public static boolean endsLy(String str) {
        int n=str.length();
        if(n>1){
            String alif=str.substring(7);
            if(alif.equals("ly")){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}
