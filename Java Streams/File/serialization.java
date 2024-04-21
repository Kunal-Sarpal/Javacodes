// This is solution for problem
import java.io.*;
// Problem -> Write object of class in file
// data should we store in as a same datatype

class Student1{
    int rollNumber;
    String name;
    float avg;
    String dept;
}
public class serialization {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("seraialFile.txt");

        DataOutputStream dos = new DataOutputStream(fos);
        Student1 s = new Student1();
        
        s.rollNumber = 13;
        s.name = "Kunal";
        s.avg = 80.5f;
        s.dept = "CSE";
        dos.writeInt(s.rollNumber);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);
        
        dos.close();
        fos.close();
        
        
    }
}


// reading pupose we have file input stream