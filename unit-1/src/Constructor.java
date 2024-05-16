public class Constructor {
    int num_cons;
    String cons_name;
    Constructor(int n, String c){
        num_cons=n;
        cons_name=c;
    }
    void display(){
        System.out.println(num_cons+"  "+cons_name);
    }

    public static void main(String[] args) {
        Constructor o1=new Constructor(34,"Begin");
        Constructor o2=new Constructor(56,"End");
        o1.display();
        o2.display();

    }
}
