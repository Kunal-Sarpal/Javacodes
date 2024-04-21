class Outer {
    public int x = 10;
    public static int z = 20;

    // Inner I = new Inner();
    class Inner {
        public int y = 20;

        public void display_In() {
            System.out.println(x + " x _ y " + y);
            System.out.println("z is a Static variable: " + z);
            Outer.jatt();
        }
    }

    public void outerdisplay() {
        // Inner I = new Inner();
        // I.display_In();x
        // System.out.println(I.y);

    }

    public static void jatt() {
        System.out.println("Static method of Outer class");
    }
}

public class Code1 {
    public static void main(String[] args) {
        // Outer obj = new Outer();
        Outer.Inner oi = new Outer().new Inner();

        oi.display_In();
    }
}
