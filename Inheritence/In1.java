

class Circle{
    
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return Math.PI * radius;
    }
}

class Cylinder extends Circle{

    public double height;

    public double volume(){
        return area() * height;
    }
}
public class In1{
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Cylinder cyl = new Cylinder();
        cyl.radius = 56;
        cyl.height = 34;
        // Circle cir = new Circle();
        System.out.println(cyl.volume());
        System.out.println(cyl.area());
        

        
    }

}
