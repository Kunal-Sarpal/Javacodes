import java.io.*;


public class BYTE_ARRAY {
    public static void main(String[] args) throws Exception {
        byte[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        String str = new String(bis.readAllBytes());
        // System.out.println(str);
        System.out.println(bis.markSupported());
        bis.close();
    }
} 
