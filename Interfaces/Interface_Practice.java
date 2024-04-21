
interface Test1{
    void meth1();
    void meth2();
}

class My implements Test1{

    public void meth1(){
        System.err.println("Meth 1  called");
    }
    public void meth2(){
        System.err.println("Meth 2  called");
    }
    public void meth3(){
        System.err.println("Meth 3  called");
    }

}

public class Interface_Practice{

    public static void main(String[] args) {
        Test1 my = new My();

        my.meth1();
        my.meth2();
        // my.meth3();
    }
}
