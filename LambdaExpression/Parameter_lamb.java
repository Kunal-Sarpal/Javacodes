

@FunctionalInterface
interface MyLambda{
    int display(int a,int b);
}

public class Parameter_lamb {
    public static void main(String[] args) {
        
        MyLambda obj = (a, b) -> a + b;
    
        System.out.print(obj.display(20,30));
    }
}
