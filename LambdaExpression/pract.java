interface Mylambda_Sin{
    void display(String s);
}

public class pract{
    public  static void forEach(int arr[]){
     for(int i : arr){
        System.out.println(" Element: " + i);
     }
    }
    public static void EachChar(String str){
        for(int i = 0 ; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        // int arr[] = {1,3,4,5,9};
        // Mylambda_Sin m = () -> forEach(arr);
        Mylambda_Sin m = pract::EachChar;
        m.display("Kunal Sarpal");
    
}

}