// import java.io.*;

// public class FileInputStreams{

//     public static void main(String[] args) {
        
//         try(FileInputStream fis = new FileInputStream("./input.txt")){
//             byte[] b = new byte[fis.available()];
//             fis.read(b);    
//             String str = new String(b);
//             System.out.println(str);
//         }
//         catch(FileNotFoundException e){
//             System.out.println(e);;
//         }
//         catch(IOException e){
//             System.out.println(e);
//         }
//     }
// }


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreams {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            int data;
            while ((data = fis.read()) != -1) {
                
                System.out.println((char)data);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
