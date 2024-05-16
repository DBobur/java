
class Acounts{
    int number;
    String name;
    float balance;
    void kiritish(int i,String j,float k){
        number=i;
        name=j;
        balance=k;
    }
    void chopqilish(){
        System.out.println(number+" "+name+" "+balance);
    }
    void plusbalance(int b){
        balance+=b;
        System.out.println("Sizning hisobingiz "+b+" ga to'ldirildi!");
    }
    void minusbalance(int b){
        if(b<balance)
            balance-=b;
        else
            System.out.println("Uzir aizni balansingiz yetarli emas?");
    }
}

public class Class1 {
    public static void main(String[] args) {
        Acounts obj1=new Acounts();
        obj1.kiritish(3949,"Bobur",1200000);
        obj1.chopqilish();
        obj1.plusbalance(350000);
        obj1.chopqilish();
        obj1.minusbalance(550000);
        obj1.chopqilish();
        System.out.println();
        new Acounts().kiritish(355,"Anonim",250000);
        new Acounts().chopqilish();
    }
}
