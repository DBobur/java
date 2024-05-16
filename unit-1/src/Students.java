public class Students {
    int id;
    String name;
    int age;
    Students(int i, String n){
        id=i;
        name=n;
    }
    Students(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Students s1=new Students(45,"Komila");
        Students s2=new Students(34,"Diyora",18);
        s1.display();
        s2.display();
    }
}
