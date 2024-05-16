
interface Printable1{
    void print();
}

interface Showable{
    void show();
}

class A6 implements Printable1, Showable{
    public void print(){
        System.out.println("this is print method!");
    }
    public void show(){
        System.out.println("this is show method!");
    }
}

public class Test5 {
    public static void main(String[] args) {
        A6 a1=new A6();
        a1.print();
    }
}
