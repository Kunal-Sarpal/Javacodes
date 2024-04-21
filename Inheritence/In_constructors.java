

class Rectangle{
    public double l;
    public double b;
    public Rectangle(){
        l=b=2;
        System.out.println("Non - param Rectangle");
    }
    public Rectangle(double l, double b){
        this.l=l;
        this.b=b;
        System.out.println("param Rectangle");
    }
    
}
class Cuboid extends Rectangle{
    public double h;
    public Cuboid(){
        h = 2;
        System.out.println("Non - param Cuboid");
    }
    public Cuboid(double l, double b, double h){
        super(l,b);
        this.h = h;
        System.out.println("param Cuboid");
    }

    public void volume(){
        System.out.println("Volume : " + l * b * h);
    }

}

public class In_constructors {
    public static void main(String args[]){
        Cuboid c = new Cuboid(2,3,4);
        c.volume();
    }
}
