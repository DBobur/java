public class Overriding {
    void show(){
        System.out.println("Overridding is running!");
    }
}

class Over extends Overriding{
    void show(){
        System.out.println("Over class function!");
    }

    public static void main(String[] args) {
        Over a1=new Over();
        Overriding a2=new Overriding();
        a1.show();
        a2.show();
    }
}

