package modul1.classlar;

import java.util.Scanner;

public class Car {
    private String id;
    private String name;//mashinaning kampaniyasi
    private String color;//uning rangi
    private int speed;//uning tezligi
    private int year;//chiqqan yili
    private float spend;//mashinaning 1km uchun benzin sarfi
    private int walking;//umumiy qancha yurilgani

    public Car() {
    }

    public Car(String name, String color, int speed, int year, float spend, int walking) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.year = year;
        this.spend = spend;
        this.walking = walking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getSpend() {
        return spend;
    }

    public void setSpend(float spend) {
        this.spend = spend;
    }

    public int getWalking() {
        return walking;
    }

    public void setWalking(int walking) {
        this.walking = walking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String
    toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", year=" + year +
                ", spend=" + spend +
                ", walking=" + walking +
                '}';
    }

    public void setInformation(){
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        System.out.print("      car isId: ");
        setId(scStr.nextLine());
        System.out.print("      car isName: ");
        setName(scStr.nextLine());
//        System.out.print("      car isColor: ");
//        setColor(scStr.nextLine());
//        System.out.print("      car isSpeed: ");
//        setSpeed(scInt.nextInt());
//        System.out.print("      car isSpend: ");
//        setSpend(scInt.nextFloat());
//        System.out.print("      car isYear: ");
//        setYear(scInt.nextInt());
//        System.out.print("      car isWalking: ");
//        setWalking(scInt.nextInt());
    }

    public void setChange(){
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

            System.out.println("0=> exit\t\t1=> setId\n" +
                    "2=> setNmae\t\t3=> setColor\n" +
                    "4=> setSpeed\t\t5=> setSpend\n" +
                    "6=> setYear\t\t7=> setWalking");
            switch (scInt.nextInt()){
                case 0-> {return;}
                case 1-> {setId(scStr.nextLine());}
                case 2-> {setName(scStr.nextLine());}
                case 4-> {setSpeed(scInt.nextInt());}
                case 5-> {setSpend(scInt.nextFloat());}
                case 6-> {setYear(scInt.nextInt());}
                case 7-> {setWalking(scInt.nextInt());}
                case 3-> {setColor(scStr.nextLine());}
            }
    }
}
