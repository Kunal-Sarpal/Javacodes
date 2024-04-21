class Parent{
    public int x = 20;

    Parent(){
        System.out.println("Hey Hello I am Parent Kunal constructor");
    } 
    public void meth1(){
        System.out.println("Hey This is meth1");
    }
}
class Child extends Parent{ 
    public int x = 100;
    Child(){
        System.out.println("Hey Hello I am child Kunal Constructor");
    }
    public void meth2(){
        super.meth1();
        System.out.println(x + " " + super.x);
        System.out.println("Hey I am metho of child class");
    }
}
public class Inheritence{
    public static void main(String[] args) {
        Parent obj = new Child();
        // obj.meth2();
    }
}