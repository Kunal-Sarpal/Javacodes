import java.util.Arrays;

public class StringLinearSearch {

    static boolean Search(String arr, char target) {
        if (arr.length() == 0)
            return false;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean Search2(String arr, char target) {
        if (arr.length() == 0)
            return false;
        for (char ch : arr.toCharArray()) {
            if (ch == target) {
                return true;
            }

        }
        return false;

    }
 

    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'f';

        // boolean found = Search(name,target);
        System.out.println("Search 1 " + Search2(name, target));
        System.out.println("Search 2 " + Search(name, target));
        // System.out.println(found);

    }
}
