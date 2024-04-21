import java.util.*;

class func{

    public void funct(int [] nums){
        List<Integer> list3 = new ArrayList<>(List.of(nums));
        
    }
}
public class Array_list_code{
  
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        List<Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        // list.add(20);
        // list.add(20);
        // list.add(20);
        // list.add(20);
        list.add(7,300);
        list.addAll(list2);

        for(int i: list){
            System.err.print(i + " ");
        }
    }
}