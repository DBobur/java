public class Inheritance {
    int age=17;
    String name="Tohir";
}

class Inheritance1 extends Inheritance{
    public static void main(String[] args) {
        Inheritance1 i1=new Inheritance1();
        System.out.println(i1.age+" "+i1.name);
    }
}