import java.io.*;
import java.util.*;


public class try_resources {
    static FileInputStream f1;
    static void Divide() throws Exception{
       
        try(FileInputStream f1 = new FileInputStream("./file.txt");Scanner sc = new Scanner(f1)){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }
        finally{
            
            f1.close();
            
            sc.close();
        }
        
    }
      public static void main(String[] args) throws Exception {
            Divide();
    }
}
