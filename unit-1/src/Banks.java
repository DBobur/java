public class Banks {
    static int a=500;
    int getRate(){
        return a;
    }
}

class Humo extends Banks{
    int getRate(){

        a+=100;
        return a;
    }
}

class Xalq extends Banks{
    int getRate(){
        a+=300;
        return a;
    }

    public static void main(String[] args) {
        Humo a1=new Humo();
        Xalq a2=new Xalq();
        Banks a3=new Banks();

        System.out.println(a1.getRate());
        System.out.println(a2.getRate());
        System.out.println(a1.getRate());
        System.out.println(a2.getRate());

        System.out.println(a3.getRate());
    }
}
