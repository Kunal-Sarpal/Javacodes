import java.util.Arrays;

public class gen2<T> {

    // Creating an array of Object and casting it to type T[]
    @SuppressWarnings("unchecked")
    T[] data = (T[]) new Object[4];
    int length = 0;

    public void add(T value) {
        data[length++] = value;
    }

    public void show() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        gen2<String> gd = new gen2<>();
       gd.add("Kunal");
       gd.add("Sarapl");
       gd.add("Is great");

       gd.show();
        // You cannot assign an integer to a String array
        // gd.data[3] = 23; // This line will cause a compilation error
    }
}


// Type Safety: Generics provide compile-time type checking, which helps catch type-related errors early in the development process. This means that if you try to use a data type that is not compatible with the one expected by the generic code, the compiler will give you an error before you run the program.