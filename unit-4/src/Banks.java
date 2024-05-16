import java.util.Scanner;
public class Banks {
    private String name;
    private String id;
    private String password;
    private String expireDate;
    private String bank;
    private double balance;
    public Banks() {
        balance=0;
    }
    public Banks(String name, String id, String password, String expireDate, String bank, double balance) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.expireDate = expireDate;
        this.bank = bank;
        this.balance = balance;
    }
    public void setMain(){
        Scanner sc=new Scanner(System.in);
        setName(sc.nextLine());
        setId(sc.nextLine());
        setPassword(sc.nextLine());
        setExpireDate(sc.nextLine());
        setBank(sc.nextLine());
        sc=new Scanner(System.in);
        setBalance(sc.nextDouble());
    }
    @Override
    public String toString() {
        return "Banks{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", bank='" + bank + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==name.toUpperCase()) {
            this.name = name;
        }
        else {
            System.out.print("SetName Error!\nnew Name: ");
            Scanner sc=new Scanner(System.in);
            String newName=sc.nextLine();
            setName(newName);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>0)
            this.balance = balance;
        else
            System.out.println("balance error!");
    }
}
