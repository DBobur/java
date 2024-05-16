import modul1.classlar.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        Car objects[]=new Car[255];
        System.out.print("Salonga nechta mashina kiritmoqchisiz: ");
        int n=scInt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Moshina "+(i+1)+" =====");
            Car obj1=new Car();
            obj1.setInformation();
            objects[i]=obj1;
        }
        String id;
        while (true){
            System.out.println("0=> exit()\t\t1=> toliqMalumotOlish()\n" +
                    "2=> o'zgartirish()\t\t3=>xaridQilish()");
            System.out.print("amal tanlang: ");
            switch (scInt.nextInt()){
                case 0->{
                    return;
                }
                case 1->{
                    System.out.print("qidirayotgan mashinayizzi Id: ");
                    id=scStr.nextLine();
                    for (int i = 0; i < n; i++) {
                        if(id.equals(objects[i].getId())){
                            objects[i].toString();
                        }else if(i == n-1){
                            System.out.println("bunda idga ega mashina salonimizda yo'q!");
                        }
                    }
                }
                case 2->{
                    System.out.print("O'zgartirmoqchi obyektiz id: ");
                    id=scStr.nextLine();
                    for (int i = 0; i < n; i++) {
                        if(id.equals(objects[i].getId())){
                            objects[i].setChange();
                        }else if(i == n-1){
                            System.out.println("bunday idga ega mashina salonimizda yo'q!");
                        }
                    }

                }
            }
        }

    }
}