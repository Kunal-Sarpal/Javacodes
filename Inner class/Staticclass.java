

class OuterOne{

    public int x = 10;
    public static int y = 30;
    static class InnerOne{

        public void display(){
            System.out.println(y);
            //Non Static varible cant be acces in static class; 
        }
    }
}

public class Staticclass{
    public static void main(String[] args) {
        OuterOne.InnerOne obj = new OuterOne.InnerOne();
        obj.display();
    }
}