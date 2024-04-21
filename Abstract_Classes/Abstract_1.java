abstract class SuperC{
    public void meth1(){
        System.out.println("Meth1 Super Class");
    }
    abstract public void meth2();
}
class SubC extends SuperC{    // Should be concrete
    @Override
    public void meth2(){
        System.out.println("Meth2 Sub Class");

    }
}

public class Abstract_1{
    public static void main(String[] args){
        SuperC s = new SubC();
        s.meth1();
        s.meth2();
    }
}