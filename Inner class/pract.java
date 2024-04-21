@FunctionalInterface
interface Kunal{
    void display();
}
public class pract{
    public static void main(String[] args) {
        new Kunal(){
            public void display(){
                System.out.println("Hello I am Kunal Sarpal");
            }
        }
        .display();
    }
}