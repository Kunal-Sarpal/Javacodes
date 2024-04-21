
import java.io.DataInputStream;
import java.io.FileInputStream;
class Student1{
    int rollNumber;
    String name;
    float avg;
    String dept;
}

public class seralizefileInputstream {
    public static void main(String[] args) throws Exception {
        
        FileInputStream fis = new FileInputStream("./seraialFile.txt");
        DataInputStream dis = new DataInputStream(fis);


        Student1 s = new Student1();
        // if you change order it will cause exception
        s.rollNumber = dis.readInt();
        s.name = dis.readUTF();
        s.avg = dis.readFloat();
        s.dept = dis.readUTF();
        
        System.out.println("Rollno "  + s.rollNumber);
        System.out.println("Name "  + s.name);
        System.out.println("Avg "  + s.avg);
        System.out.println("dept "  + s.dept);
        dis.close();
        fis.close();
    }
}
