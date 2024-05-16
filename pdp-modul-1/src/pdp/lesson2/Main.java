package pdp.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scInt=new Scanner(System.in);

        //todo: example one
//        int a=123;
//        System.out.println(a/10%10%10/10);

        //todo: example two
//        System.out.println("8|   #   #   #   #");
//        System.out.println("7| #   #   #   #  ");
//        System.out.println("6|   #   #   #   #");
//        System.out.println("5| #   #   #   #  ");
//        System.out.println("4|   #   #   #   #");
//        System.out.println("3| #   #   #   #  ");
//        System.out.println("2|   #   #   #   #");
//        System.out.println("1| #   #   #   #  ");
//        System.out.println("00 1 2 3 4 5 6 7 8");
//        System.out.println();
//        System.out.print("x: ");
//        int x=scInt.nextInt();
//        System.out.print("y: ");
//        int y=scInt.nextInt();
//        System.out.println((x%2==0 && y%2==0) || (x%2==1 & y%2==1)); // kataklarni oq yoki qoraligi
//        System.out.print("x1: ");
//        int x1=scInt.nextInt();
//        System.out.print("y1: ");
//        int y1=scInt.nextInt();
//        System.out.print("x2: ");
//        int x2=scInt.nextInt();
//        System.out.print("y2: ");
//        int y2=scInt.nextInt();
//        System.out.print("Yurish: ");
//        System.out.println((x2-x1==1 || y2-y1==1) || (x2-x1==1 && y2-y1==1)); // shoxni yurishi
//        System.out.print("Yurish: ");
//        System.out.println(x2-x1!=0 && y2-y1!=0); // filni yurishi
//        System.out.print("Yurish: ");
//        System.out.println(((x2-x1==2 || x2-x1==-2) && (y2-y1==1 || y2-y1==-1)) || ((y2-y1==2 || y2-y1==-2) && (x2-x1==1 || x2-x1==-1))); // otni yurishi

        //todo: example three
//        System.out.print("a1: ");
//        int a1=scInt.nextInt();
//        System.out.print("a2: ");
//        int a2=scInt.nextInt();
//        System.out.print("a3: ");
//        int a3=scInt.nextInt();
//        System.out.println((float)(a1+a2+a3)/3);

        //todo: example four
//        System.out.print("a: ");
//        int a=scInt.nextInt();
//        System.out.println("Yuzasi: "+a*a);
//        System.out.println("Peremetri: "+4*a);

        //todo: example five
//        System.out.print("Konfet narxi: ");
//        int sumKonfet=scInt.nextInt();
//        System.out.print("Pecheni narxi: ");
//        int sumPecheni=scInt.nextInt();
//        System.out.println(sumKonfet*0.3);
//        System.out.println(sumPecheni*0.4);
//        System.out.println(sumKonfet*2.0);
//        System.out.println(sumPecheni*1.8);

        //todo: example six
//        System.out.print("Vaqt minutta: ");
//        int vaqt=scInt.nextInt();
//        System.out.print("Kilometr: ");
//        int km=scInt.nextInt();
//        System.out.println(km/(vaqt/60));

        //todo: example seven
//        System.out.print("katet1: ");
//        int a=scInt.nextInt();
//        System.out.print("katet2: ");
//        int b=scInt.nextInt();
//        System.out.println("gipatenuza: "+Math.sqrt(a*a+b*b));

        //todo: example eight
//        System.out.print("year: ");
//        int year=scInt.nextInt();
//        System.out.print("maonth: ");
//        int maonth=scInt.nextInt();
//        System.out.print("day: ");
//        int day=scInt.nextInt();
//        maonth+=(year-1)*12;
//        day+=(maonth-1)*30;
//        System.out.println(day);

        //todo: example nine
//        System.out.print("number one: ");
//        int numberOne=scInt.nextInt();
//        System.out.print("number two: ");
//        int numberTwo=scInt.nextInt();
//        numberOne+=numberTwo;
//        numberTwo=numberOne-numberTwo;
//        numberOne=numberOne-numberTwo;
//        System.out.println(numberOne);
//        System.out.println(numberTwo);

        //todo: example ten
//        System.out.print("a: ");
//        int a=scInt.nextInt();
//        System.out.println((a*a)*(a*a));
//        System.out.println((a*a*a)*(a*a*a));
//        System.out.println((a*a*a)*(a*a*a)*(a*a*a)*(a*a*a)*(a*a*a));

        //todo: example eleven
        System.out.print("USD balance:");
        int usd=scInt.nextInt();
        System.out.print("USS balance: ");
        int uss=scInt.nextInt();
        System.out.println(usd*11000+" uss");
        System.out.println((float)uss/11000+" usd"); 

    }
}
