
interface printable{
    void print();
}

class A4 implements printable{
    public void print(){
        System.out.println("Bu A4 qog'oz farmati edi!");
    }
}

public class Interfeys {
    public static void main(String[] args) {
        A4 a=new A4();
        a.print();
    }
}
