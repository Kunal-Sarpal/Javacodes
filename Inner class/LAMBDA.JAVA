interface Sum{
    void display(int x, int y);
}

public class LAMBDA{
    public static void main(String[] args){
        Sum s = (x,y) -> System.out.println(x+y);
        
        s.display(10,20)

    }
}