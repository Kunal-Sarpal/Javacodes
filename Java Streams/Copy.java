import java.io.*;

public class Copy {
    public static void main(String[] args) {
        try{

            FileInputStream fis = new FileInputStream("./File.txt");
            FileOutputStream fos = new FileOutputStream("./Filepaste.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            // String str = new String(b);
            
            for(byte x : b){

                if((x >= 60 && x <= 90))
                {
                    fos.write(x + 32);

                }
                else fos.write(x);
            }

            fis.close();
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
