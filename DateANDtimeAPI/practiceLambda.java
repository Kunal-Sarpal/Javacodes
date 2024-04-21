
@FunctionalInterface
interface Addit {
    void add(int x, int y);
}

public class practiceLambda {
    public static void main(String[] args) {
        Addit a = (x, y) -> {System.out.println("A + B  = " + (x + y));};
        a.add(12, 34);
    }
}