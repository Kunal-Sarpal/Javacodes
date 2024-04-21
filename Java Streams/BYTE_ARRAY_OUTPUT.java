import java.io.ByteArrayOutputStream;

public class BYTE_ARRAY_OUTPUT {
    public static void main(String[] args) {
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('k');
        bos.write('u');
        bos.write('n');
        bos.write('a');
        bos.write('l');

        byte[] b = bos.toByteArray();
        for(byte x: b)
            System.out.println((char)x); 
    }
}
