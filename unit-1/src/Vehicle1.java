public class Vehicle1 {
    // upcasting
    int speed=15;
    void run(){
        System.out.println("Bu mashina 15km/s bn yuradi!");
    }
}

class  Carrr extends Vehicle1{
    int speed=60;
    void run(){
        System.out.println("Bu mashina 60 km/s da yuradi!");
    }

    public static void main(String[] args) {
        Vehicle1 c=new Carrr();
        c.run();
    }
}
