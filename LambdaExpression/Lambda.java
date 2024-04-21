interface myLambda{
    void display();
}

public class Lambda{
    public static void main(String[] args) {
        myLambda my = new myLambda() {
            public void display(){
                System.out.println("oh oh Janne jan jana ");
            }
        };
        my.display();
    }
}