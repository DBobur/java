class Adder{
    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static double add(double a, double b){
        return a+b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Adder a1=new Adder();
        System.out.println(a1.add(3,8));
        System.out.println(a1.add(34,76,45));
        System.out.println(a1.add(5.7,8.9));
    }
}
