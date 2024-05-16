public class Bike {
    /*
    Javada abstraction va classlar
    1. abstract class
    2. interface
     */
}

abstract class Moto{
    abstract void run();
}

class Honda extends Moto{
    void run(){
        System.out.println("Bu honda edi!");
    }

    public static void main(String[] args) {
        Moto m=new Honda();
        m.run();
    }
}