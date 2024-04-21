public class sumofdigit {

    static int sum1(int n){

        int rem = n%10;
        n = n / 10;
        if(n == 0 && rem == 0){
            
            return 0;
        }
        return rem + sum1(n);

    }
    public static void main(String[] args) {
        System.out.println(sum1(555555555));
    }
}
