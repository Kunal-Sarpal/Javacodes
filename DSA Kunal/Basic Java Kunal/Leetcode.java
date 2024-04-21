
// public class Leetcode {

   
//         static int findNumbers(int[] nums) {
//             int count = 0;
            
//            for(int i:nums) {
//                String n = Integer.toString(i);
//                if(((n.length()) % 2) == 0){
               
//                    count++;
//                }
              
            
//            }x
//            return count;
//         }
    
//     public static void main(String[] args) {
//         int arr[] = {123,4,5,678,2223,5555,5555};
//         System.out.println(findNumbers(arr));
//     }
// }

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Solution {

    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> list =  new ArrayList<>();
        int count;
        for(int arr[]:accounts)
            count = 0;
            for(int elem: arr){
                count+=elem;
            }
            list.add(count);
    }
    int max = Collections.max(list);
    return max;
}