
abstract class Shape {
    abstract public void perimeter();

    abstract public void area();
}

class Circle extends Shape {
    public int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        System.err.println(2 * Math.PI * radius);
    }

    @Override
    public void area() {
        System.err.println(Math.PI * radius * radius);

    }
}

class Rectangle extends Shape {
    public int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void perimeter() {
        System.out.println(2 * (l + b));
    }

    @Override
    public void area() {
        System.out.println(l * b);

    }
}

public class Abstract_Challenge {
    public static void main(String[] args) {
        Shape circle = new Circle(45);
        Shape rectangle = new Rectangle(34, 56);

        System.err.println("Circle: ");
        circle.perimeter();
        circle.area();
        System.err.println("Rectangle: ");
        rectangle.perimeter();
        rectangle.area();
    }
}
