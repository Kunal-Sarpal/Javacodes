import java.io.*;

public class practice {
    public static void main(String[] args) throws Exception {
        Float list[] = {12.4f, 23.6f,65.3f, 34.6f};
        FileOutputStream fos = new FileOutputStream("./practice.txt");
        DataOutputStream dos = new DataOutputStream(fos);


        dos.writeInt(list.length);
        for(Float x:list){
            dos.writeFloat(x);
        }
        System.out.println("Writing done.");

        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("./practice.txt");
        DataInputStream dis = new DataInputStream(fis);

        int len = dis.readInt();
        for(int i = 0 ;i < len; i++){
            Float data = dis.readFloat();
            System.out.println(data);
        }
        System.out.println("readin done..");

        fis.close();
        dis.close();
    }
}
