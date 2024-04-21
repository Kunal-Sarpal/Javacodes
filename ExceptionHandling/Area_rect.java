

public class Area_rect {
    static int area(int l,int b) throws Exception{
        if(l <=0 || b <=0){
            throw new Exception();
        }
        int area = l * b;
        return area;
    }
    static void meth1() throws Exception{
        
        System.out.println("Area of Rectangle is: " + area(10,23));
    }
    public static void main(String[] args) {
        try{
            meth1();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
