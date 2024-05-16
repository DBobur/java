public class Coder {
    int age;
    String name;
    static String maktab="TATU";

    Coder(int a, String n){
        age=a;
        name=n;
    }

    static void change(){
        maktab="TATU";
    }

    void display(){
        System.out.println(age+" "+name+" "+maktab);
    }

}

class Test1{
    public static void main(String[] args) {
        Coder.change();
        Coder c1=new Coder(23,"Samandar");
        Coder c2=new Coder(24,"Haibullo");
        Coder c3=new Coder(27,"Hayrullo");
        Coder c4=new Coder(26,"Azizbek");

        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}
