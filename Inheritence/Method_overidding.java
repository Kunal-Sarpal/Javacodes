class Super {
    public void display() {
        System.out.println("Method of Super class ");
    }
}

class Sub extends Super {

    @Override
    public void display() {
        System.out.println("Method of Sub class ");
    }

}

public class Method_overidding {
    public static void main(String[] args) {
        // Sub s = new Sub();
        Super s = new Sub(); // ref of super and object is of sub 
        s.display(); // will call method of sub class
    }
}
