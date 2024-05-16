abstract class Bikee{
    Bikee(){
        System.out.println("Bike is created!");
    }
    abstract void run();
    void color(){
        System.out.println("This is blue");
    }
}

class Hondaa extends Bikee{
    void run(){
        System.out.println("This is Hondaa!");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Bikee b=new Hondaa();
        b.run();
        b.color();
    }
}
