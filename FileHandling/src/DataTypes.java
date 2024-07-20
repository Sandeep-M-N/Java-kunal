

//import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class DataTypes {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\DELL\\IdeaProjects\\FileHandling\\src\\Example.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("welcome to my world");
            fw.close();
        }
        catch(Exception E){
            System.out.println(E);
        }


    }
}


