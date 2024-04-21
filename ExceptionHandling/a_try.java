import java.util.Scanner;

public class a_try{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter First Number: ");

        int b = sc.nextInt();
        try {
            int div = a / b;

            System.out.println("Answer " + div);
        }
        catch(ArithmeticException e){
            System.out.println(" Divison by 0 is not valid");
        }
    }
}