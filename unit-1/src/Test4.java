abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Bu yo'rtburchak!");
    }

}

class Circle1 extends Shape{
    void draw(){
        System.out.println("Bu aylana!");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Shape a1=new Rectangle();
        Shape a2=new Circle1();

        a1.draw();
        a2.draw();
    }
}
