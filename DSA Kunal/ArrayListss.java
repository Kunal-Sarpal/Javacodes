
import java.util.ArrayList;

public class ArrayListss{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //   int [][] arr = new int[3][3]; 
        //   System.out.println("Enter Input to array : ");
        //   for(int i  = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        //   }
        // //   for(int i  = 0; i < arr.length; i++){
        // //     for(int j = 0; j < arr[i].length;j++){
        // //         System.out.print(arr[i][j] + " ");
        // //     }
        // //     System.out.print("\n");
        // //   }

        //   for(int[] a: arr){
        //     System.out.println(Arrays.toString(a));
        //   }
          
          
        //   System.out.println(Arrays.toString(arr));
        //   sc.close();
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.set(3,99999);
        list.add(2);

        list.remove(3);
        System.out.println("Elelment at index : 2 : : : -> " + list.size() + " " + list.get(2)) ;
   
      
        System.out.println(list.contains(23));
        System.out.println(list);
    } 

}