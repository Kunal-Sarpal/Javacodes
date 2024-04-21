public class b_try {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};

        try { 
            int div = arr[3]/arr[1];
            System.out.println(div);
            try{
                System.out.println(arr[9]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index of bound. line - 10");
            }
            

        }
        catch(ArithmeticException e){
            System.out.println("You can't divide number by Zero / line-7");
        }
    }

}
