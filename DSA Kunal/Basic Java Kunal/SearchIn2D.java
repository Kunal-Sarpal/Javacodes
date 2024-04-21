import java.util.Arrays;

public class SearchIn2D {

    static boolean Search2D(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] Search2Dindex(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int min2Delem(int arr[][]) {
        int min = arr[0][0];
        for (int row[] : arr) {
            for (int elem : row) {
                if (elem < min) {
                    min = elem;
                }
            }
        }
        return min;
    }

    static int max2Delem(int arr[][]) {
        int max = arr[0][0];
        for (int row[] : arr) {
            for (int elem : row) {
                if (elem > max) {
                    max = elem;
                }
            }
        }
        return max;
    }

    static int Duplicates(int arr[][], int i, int j) {
        int dup = arr[i][j];
        int count = 0;
        if (arr[i][j] == -1) {
            return 1;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                    
                
                    if (dup == arr[row][col]) {
                        System.out.println(count);
                        count++;
                        i++;
                        j = i + 1;
                        Duplicates(arr, i, j);
                    } else {
                        j++;
                    }
                
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 5 }, { 2, 3, 4, 5 }, { 90, 5, 6, 7, -1} };

        // System.out.println( "Search Results: " + Search2D(arr,90));
        // System.out.println( "Search Results: " +
        // Arrays.toString(Search2Dindex(arr,90)));
        // System.out.println( "Max Results: " + max2Delem(arr));
        // System.out.println( "Min Results: " + min2Delem(arr));
        System.out.println("Dupicates: " + Duplicates(arr, 0, 0));
    }
}
