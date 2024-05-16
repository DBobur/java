import java.util.*;

public class Fayllar{
    public static void main(String[] args) {
        Formatter myFile;
        try{
            myFile=new Formatter("src/fayllar/fayl1.txt");
            System.out.println("Fayl ochildi!");
        }catch(Exception e){
            System.out.println("Hatolik sodir etildi?");
        }
    }
}