

public class c_try {
    static int func1(){
        int a = 10/0; //unchecked Exception
        return a;
    }    
    static void func2(){
       func1();
    }    
    static void func3(){
        func2();
    }    
    static void func4(){
        func3();
    }    
    public static void main(String[] args) {
        try{
            func4();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
