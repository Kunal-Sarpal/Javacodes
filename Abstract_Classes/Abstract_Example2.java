abstract class KFC{
    KFC(){
        System.out.print("KFC  ");
    }
    public void makeItem(){
        System.out.println("Rules");
    }
    abstract public void billing();
    abstract public void offer();
}
class MyKFC extends KFC{
    MyKFC(){
        System.out.println("Welcome to MyKFC");
    }
    public void offer(){
        System.out.println("Buy 2 get 3 free");
    }
    public void festoffer(){
        System.out.println("Langar laga ta KFC da");
    }
    public void billing(){
        System.out.println("pay: 1000$");
    }
}

public class Abstract_Example2 {
    public static void main(String[] args) {
        KFC mykfc = new MyKFC();
        mykfc.billing();
        mykfc.offer();
        // mykfc.festoffer(); // Only methods present in refrence van be overide and call not any other
    }
}
