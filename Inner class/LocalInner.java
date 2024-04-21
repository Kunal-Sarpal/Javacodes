class Outerclass{

    public void display(){
        class Innerclass{
            public void displayIn(){
                System.out.println("Hello From Inner class!");
            }
        }
        Innerclass obj = new Innerclass();
        obj.displayIn();
    }
}

public class LocalInner {
    // class Inside the method
    
    public static void main(String[] args) {
        Outerclass obj = new Outerclass();
        obj.display();
    }
    
}
