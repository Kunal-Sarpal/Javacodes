import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Value for a: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter Value for b: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Sum of a and b is: " + (a + b));
    }
}
