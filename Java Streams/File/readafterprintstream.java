
import java.io.*;
class Student{
    int roll_no;
    String name;
    String dept;
}


public class readafterprintstream {
    public static void main(String[] args) throws Exception  {
        FileInputStream fis = new FileInputStream("./student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student s = new Student();

        s.roll_no = Integer.parseInt(br.readLine());
        s.name= br.readLine();
        s.dept= br.readLine();

        System.out.println(s.roll_no);
        System.out.println(s.name);
        System.out.println(s.dept);

        br.close();
        fis.close();
        
    }
}
