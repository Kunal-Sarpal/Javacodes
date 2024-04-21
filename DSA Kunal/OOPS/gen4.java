class A{

}
class B extends A{}
class C extends A{}
// BOund Tyoes

public class gen4<T extends A>{
    public static void main(String[] args) {
        // gen4<String> obj = new gen4<>();  It will allow the classes which extends Number
        gen4<B> obj = new gen4<>();

        

    }
}
// NUMBER -> wrraper class
// Byte short int long  float double (Number )

// Generics in programming languages refer to the ability to write code that can work with different types of data. The term "generic" comes from the idea of writing code in a way that it's not tied to a specific data type but rather can be used with any data type.


In Java, <T> is a placeholder representing a type parameter in a generic class