public class NewAnimal {
    String color="black";

    void eat(){
        System.out.println("eating...");
    }
}

class Dogs extends NewAnimal{
    String color="Gray";
    void showColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat(){
        System.out.println("eating bread...");
    }
    void display(){
        eat();
        super.eat();
    }
}

class Test3{
    public static void main(String[] args) {
        Dogs d=new Dogs();
        d.showColor();
        d.display();
    }
}