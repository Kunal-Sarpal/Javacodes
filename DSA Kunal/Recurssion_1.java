public class Recurssion_1{
     
    static int fibbonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int ans = fibbonacci(n-1) + fibbonacci(n-2);
        return ans;
        // System.out.print(n + " ");
    }
    public static void main(String[] args) {
        
        System.out.println(fibbonacci(10));
    }
}