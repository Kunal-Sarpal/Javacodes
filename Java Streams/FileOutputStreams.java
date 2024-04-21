import java.io.*;

public class FileOutputStreams{

    public static void main(String[] args) {
        try{

            FileOutputStream fos = new FileOutputStream("./output1.txt");
            String str = "Learn java prograaming";
            // fos.write(str.getBytes();
            byte b[] = str.getBytes();
            // for(byte x: b){
            //     fos.write(x);
            // }
            fos.write(b,0,str.length()-1);

            // getBytes returns array of bytes
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println("error: " + e.toString());
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}