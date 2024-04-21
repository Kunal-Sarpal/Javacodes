

// class Rectangle{
//     private double l = 0;
//     private double b = 0;
    
    
//     public void setLen(double l)
//     {
//         if(l < -0 || l > 99999){
//             this.l = 0;
//         }else{
//         this.l = l;
//         }        
//     }
//     public void setB(double b)
//     {
//         if(b < -0 || b > 99999){
//             this.b = 0;
//         }else{
//         this.b = b;
//         }
        
//     }
//     public double getlen(){
//         return l;
//     }
//     public double getbre(){
//         return b;
//     }
//     public double perimeter(){
//         return 2 * (getlen() + getbre());
//     }
//     public double area(){
//         return  getlen() * getbre();
//     }
//     boolean l_b()
//     {
//         return getlen() == getbre();
//     }
    
    
// }
// public class Main
// {
// 	public static void main(String[] args) {
		
// 		Rectangle r = new Rectangle();
		
// 		r.setLen(10.45);
// 		r.setB(90.457);
		
// 		System.out.println(r.perimeter());
// 		System.out.println(r.area());
// 		System.out.println(r.l_b());
		
// 	}
// }
// class Cylinder{
//     public double radius;
//     public double height;
    
//     public double lidArea(){
//         return Math.PI * radius * radius;
        
//     }
//     public double totalSurfaceArea(){
//         return 2 * lidArea() * cicumference() *height;
//     }
//     public double cicumference(){
//         return 2 * Math.PI * radius ;
//     }
   
    
    
// }
// public class Main
// {
// 	public static void main(String[] args) {
		
// 		Cylinder r = new Cylinder();
// 		r.radius = 290;
// 		r.height  = 23;
		
		
// 		System.out.println(r.lidArea());
// 		System.out.println(r.cicumference());
// 		System.out.println(r.totalSurfaceArea());
		
// 	}
// }



// class Student{
//     public int roll_no;
//     public String name;
//     public String course;
//     public double m1;
//     public double m2;
//     public double m3;

    
//     public double total(){
//         return m1 + m2 + m3;
        
//     }
//     public double average(){
//         return (int)(m1 + m2 + m3)/3;
//     }
//     public String grade(){
//         if(average() > 60){
//             return "A";
//         }
//         return "B";
//     }
   
    
    
// }
// public class Main
// {
// 	public static void main(String[] args) {
		
// 		Student r = new Student();
// 		r.roll_no = 1;
// 		r.name  = "Kunal";
// 		r.course  = "Math/java/Web";
// 		r.m1 = 34;
// 		r.m2 = 45;
// 		r.m3 = 90;
		
		
// 		System.out.println(r.total());
// 		System.out.println(r.average());
// 		System.out.println(r.grade());
		
// 	}
// }

class Student {
    private int rollNo;
    private String name;
    private String dept;
    private String[] sub;

    Student(int rollNo, String name, String dept, String[] sub) {
        setRoll(rollNo);    // Call the setter method without assigning its return value
        setName(name);      // Call the setter method without assigning its return value
        setDept(dept);      // Call the setter method without assigning its return value
        setSubject(sub);    // Call the setter method without assigning its return value
    }

    public void setRoll(int rollNo) {
        if (rollNo <= 0) {
            this.rollNo = 0;
        } else {
            this.rollNo = rollNo;
        }
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "Invalid name";
        } else {
            this.name = name;
        }
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubject(String[] sub) {
        this.sub = new String[sub.length];
        for (int i = 0; i < sub.length; i++) {
            this.sub[i] = sub[i];
        }
    }

    public void getDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Subjects:");
        for (String s : sub) {
            System.out.println(s);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] std = new Student[3];
        std[0] = new Student(12, "Kunal", "CSE", new String[]{"Math", "Physics"});
        std[1] = new Student(2, "Sarpal", "MEC", new String[]{"Math", "Physics"});
        std[2] = new Student(1, "Kunal Sarpal", "CSE", new String[]{"Math", "Physics"});
        
        for (Student s : std) {
            s.getDetails();
            System.out.println();
        }
    }
}