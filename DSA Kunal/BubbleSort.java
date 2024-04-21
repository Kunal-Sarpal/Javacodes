import java.util.Arrays;

public class BubbleSort{

    static void bubble(int arr[]){
        boolean swa = false;
        for(int  i = 0; i < arr.length;  i++){
            for(int j = 1 ; j < arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swa = true;
                }
            }
            if(!swa){
                System.out.println("Not swap");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}