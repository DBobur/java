public class NewStudent {
    int id;
    String name;
    float free;
    NewStudent(int id, String name, float free){
        this.id=id;
        this.name=name;
        this.free=free;
    }
    void display(){
        System.out.println(id+" "+name+" "+free);
    }

}

class NewTest{
    public static void main(String[] args) {
        NewStudent s1=new NewStudent(12,"Jamolliddin",34f);
        NewStudent s2=new NewStudent(21,"Jamol",364f);

        s1.display();
        s2.display();
    }
}
