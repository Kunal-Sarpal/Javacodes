// package buffer_Streams;
import java.io.*;
import java.io.BufferedInputStream;
public class Program1 {
    public static void main(String[] args) {
        try{


            FileInputStream fis = new FileInputStream("./File1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
    
            // byte[] b = new byte[bis.available()];
            // bis.read(b);
            // for(byte x: b){
            //     System.out.print((char)x);
            // }
            System.out.println("");

            // System.out.println("File: "+ fis.markSupported());
            // System.out.println("Buffer: "+ bis.markSupported());

            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            bis.mark(10);
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            bis.reset(); // next it will read frmo same point 
            // System.out.print((char)bis.read()); //it will read from 3 read
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            // System.out.println("String" + bis.readLine()); // only work for buffer reader we read lines from buffer reader

            fis.close();
            bis.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }


    }
}
