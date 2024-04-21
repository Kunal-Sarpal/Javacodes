import java.io.FileReader;
import java.io.IOException;

public class FileReaderss 

 {

    public static void main(String[] args) {
        // Example using FileReader
        try {
            FileReader fr = new FileReader("example.txt");
            int data; // Using int to read character data
            while ((data = fr.read()) != -1) {
                // Converting int to char
                System.out.print((char)data);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
