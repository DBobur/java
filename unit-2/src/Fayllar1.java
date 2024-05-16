import java.io.File;
import java.io.*;

public class Fayllar1 {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("src/fayllar/fayl2.txt");
            obj.write("Files in Java might be tricky, but it is fun enough!");
            obj.close();
            System.out.println("Successfully wrote to the file.");
//            if(obj.createNewFile()){
//                System.out.println("File created: "+obj.getName());
//            }else{
//                System.out.println("File already exists.");
//            }
        }catch(IOException e){
            System.out.println("An errors occurred.");
            e.printStackTrace();
//            System.out.println("Fayl ochilmadi?");
        }
    }
}
