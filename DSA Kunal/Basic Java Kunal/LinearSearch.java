

public class LinearSearch{
    static int linearSerach(int arr[],int target){
        if(arr.length == 0) return -1;
      
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] == target) return index;
        }
        return -1;

    }
    static int min_mum(int arr[]){
        int m = arr[0];

        for(int  i = 0; i < arr.length; i++){
            if(arr[i] < m){
                m = arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,3,40,50,6,23,2304,234,234,234,344,-1};
        // int target = 03;
        // System.out.println(linearSerach(arr,target));
        System.out.println(min_mum(arr));
    }
}