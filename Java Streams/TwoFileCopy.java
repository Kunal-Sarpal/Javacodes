import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TwoFileCopy {
    public static void main(String[] args) {
        try{

            FileInputStream fis1 = new FileInputStream("./File.txt");
            FileInputStream fis2 = new FileInputStream("./Filepaste.txt");
            FileOutputStream fos = new FileOutputStream("./Destination.txt");
            SequenceInputStream sis = new SequenceInputStream(fis2,fis1);

            int b;
            while((b = sis.read()) != -1){
                fos.write((char)b);
            }

            sis.close();
            fis1.close();
            fis2.close();
            fos.close();
        }
        catch(FileNotFoundException e){
           
            System.out.println(e);
        }
        catch(IOException e){
            // IOException
            System.out.println(e);
        }
        finally{
            System.out.println("Code Runs ... .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. .. ..");
        }
    
    }
}
