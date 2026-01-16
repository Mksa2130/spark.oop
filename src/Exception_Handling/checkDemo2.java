package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader file = new FileReader("mJ.txt");
        } catch (IOException e) {
            System.out.println("error reading file");
        }
        finally{

        }
    }
}