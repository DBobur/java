public class Encapsulation {
    private String name="TATU";
    public String getName(){
        return name;
    }
    public void getName(String name){
        this.name=name;
    }
}

class Test7{
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.getName("Bobur!");
        System.out.println(e.getName());
    }
}
