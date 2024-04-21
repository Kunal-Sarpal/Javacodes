class Object11{
    public Object11(String value){
        System.err.println("Object11: " + value);
    }
}
class String11 extends Object11{
    public String11(String value){
        super(value);
        System.out.println("String11: " + value);
    }
}

public class genpractice {
    public static void main(String[] args) {
        Object obj = new String("H1"); //Refrence of object class can hold any class but when u use u need to type cast
        // Arr obj  = new Arr();
        // String obj1 = new String("Hello");
        // Object11 obj2 = new String11("Hello");
        String str = (String) obj;
        
        
        // System.out.println(obj);
        // System.out.println(obj1);
        
    }
}
