public class A1 {
    protected int a=15;
    protected void show(){
        System.out.println("showing...");
    }
}

class B1 extends A1{
    public static void main(String[] args) {
        B1 b=new B1();
        System.out.println(b.a);
        b.show();
    }
}
