

abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}
class MyHospital extends Hospital{
    MyHospital(){
        System.err.println("Sarpal Hospital");
    }
    public void emergency(){
        System.out.println("Emegency ward: 155 room  77 floor");
    }
    public void appointment(){
        System.out.println("Reception");
    }
    public void admit(){
        System.out.println("Admit ward : 102 room 10 floor");
    }
    public void billing(){
        System.out.println("Pay : Credit card Ruppay Cash Patam");
    }
}

public class Abstract_Example {
    public static void main(String[] args){
        Hospital h = new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
    }
}
