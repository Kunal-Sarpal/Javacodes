
import java.io.*;
class Student2 implements Serializable{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int data = 12;
    public transient int t;

    public Student2(){};
    public Student2(int r,String n, float a,String d){
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        data=500;
        t=5000;
    };
    public String toString(){
        return "\nStudent2 details\n"+
                "\nRollno: "+rollno+
                "\nname: "+name+
                "\navg: "+avg+
                "\ndept: "+dept+
                "\ndata: "+data+
                "\nTransient: "+t+"\n";
    }

}
public class objectoutputstreams {
    public static void main(String[] args)throws Exception{
        FileOutputStream fos = new FileOutputStream("FinalSerial.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student2 s = new Student2(10,"kunal",89.9f,"CSE");

        oos.writeObject(s);

        oos.close();
        fos.close();
    }
}
