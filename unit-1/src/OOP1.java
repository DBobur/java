public class OOP1 {
    /*
    1.Uppercase letters
    2.It must be a noun
    3.Don't use acronyms
     */

}

class Student{
    int id;
    String name;
    void getInfo(int i, String n){
        id=i;
        name=n;
    }
    void displayInfo(){
        System.out.println(id+"  "+name);
    }
}

class ObjectOrientedProgramming{
    static final float PI=3.14f;
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.getInfo(24,"jon");
        s2.getInfo(19,"Joana");
        s1.displayInfo();
        s2.displayInfo();
    }

}

interface Printable{

}
