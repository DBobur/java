class Studentss{
    int id;
    String name;
    static String college="TATU";
    Studentss(int i, String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name+" "+college);
    }
}

public class Static {
    public static void main(String[] args) {
       Studentss s1=new Studentss(23,"Samandar");
       Studentss s2=new Studentss(28,"Tohir");
       s1.display();
       s2.display();
    }
}
