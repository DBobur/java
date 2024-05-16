public class Address {
    String city, state, country;
    public Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

class Emp{
    int id;
    String name;
    Address ad;

    Emp(int id, String name, Address ad){
        this.id=id;
        this.name=name;
        this.ad=ad;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(ad.city+" "+ad.state+" "+ad.country);
    }
}

class TestAd{
    public static void main(String[] args) {
        Address address=new Address("pop","namangan","Viloyat");
        Emp c1=new Emp(19,"Bobur",address);

        c1.display();
    }
}
