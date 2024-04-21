import java.io.*;
class Student{
    int roll_no;
    String name;
    String dept;
}

public class printstream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("student.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        Student s1 = new Student();
        s.roll_no = 1;
        s.name = "Kunal";
        s.dept = "CSE";
        s1.roll_no = 2;
        s1.name = "Jowan";
        s1.dept = "Mechanics";
        ps.println("--------");
        ps.println(s.roll_no);
        ps.println(s.name);
        ps.println(s.dept);
        ps.println("--------");
        ps.println("--------");
        ps.println(s1.roll_no);
        ps.println(s1.name);
        ps.println(s1.dept);
        ps.println("--------");
        ps.close();
        fos.close();
         
    }
}
