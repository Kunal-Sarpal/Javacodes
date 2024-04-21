// // import java.util.Arrays;
// import java.util.*;

// public class Arraylist{
//     private static int[] arr = null;
//     private static int DEFAULT_SIZE = 10;
//     public int size = 0;

//     public Arraylist(){
//         this.arr = new int[DEFAULT_SIZE];
//     }
//     public void add(int element) {
//         if(isFull()){
//             resize();
//         }
//         arr[size++] = element;
//     }
//     public boolean isFull(){
//         return size == arr.length;
//     }
//     public void resize(){
//         int [] temp = new int[size*2];
//         for(int i = 0; i < arr.length; i++){
//             temp[i] = arr[i];

//         }
//         arr = temp;
//     }
//     public int remove(){
//         int val = arr[size--];
//         return val;
//     }
//     public int get(int index){
//         return  arr[index];
//     }
//     public int size(){
//         return size;

//     }
//     public int set(int index, int value){
//         arr[index] = value;
//         return arr[index];
//     }




//     public static void main(String[] args) {
//         Arraylist list = new Arraylist();
//         list.add(10);
//         list.add(10);
//         list.add(10);
//         list.add(10);
//         list.add(10);
//         list.add(10);
//          list.add(10);
     
     
     
     
        
//         System.out.println("Removed Element: " + list.remove());
//         System.out.println("Removed Element: " + list.remove());
//         System.out.println("Removed Element: " + list.remove());
//         System.out.println("Size of Element: " + list.size());
//         System.out.println("Set at index:  " + list.set(3,3000));
//         System.out.println("Element at index:  " + list.get(3));
     
//        System.out.println(Arrays.toString(Arraylist.arr));

//     }
// }