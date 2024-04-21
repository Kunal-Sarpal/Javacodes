class SuperC{
    public void meth1(){
        System.out.println("Meth1 of super class");
    }
    public void meth2(){
        System.out.println("Meth2 of super class");
    }
}
class SubC extends SuperC{
    @Override
    public void meth1(){
        System.out.println("Meth1 of SUBC class");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2 of SUBC class");
    }
    public void meth3(){
        System.out.println("Meth3 of super class");
    }
}

public class Dynamic_Dispatch {
   
    public static void main(String[] args){
        SuperC s1 = new SubC();

        s1.meth1();
        s1.meth2();

    }
}
