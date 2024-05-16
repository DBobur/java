public class Student1 {
    int id;
    String name;
    Student1(int i, String n){
        id=i;
        name=n;
    }
    Student1(Student1 s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+"  "+name);
    }

    public static void main(String[] args) {
        Student1 a1=new Student1(34,"Habibullo");
        Student1 a2=new Student1(a1);

        a1.display();
        a2.display();
    }
}
