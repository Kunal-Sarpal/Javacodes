import java.util.Arrays;

public class gen3 {
    public static void main(String[] args) {
        Object []data = new Object[3];
        
        for(int i = 0; i < data.length; i++){
            data[i] = i*2;
            data[1] = "Kunal";
        }    

        System.out.println(Arrays.toString(data));
    }
}
