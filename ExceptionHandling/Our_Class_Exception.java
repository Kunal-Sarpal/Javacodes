class NegativeValueException extends Exception{
    public String toString(){
        return "Negative Value Exception";
    }
}

public class Our_Class_Exception {

    static int area(int l, int b) throws NegativeValueException {
        if (l <= 0 || b <= 0) {
            throw new NegativeValueException();
        }
        int area = l * b;
        return area;
    }

    static void meth1() throws NegativeValueException {

        System.out.println("Area of Rectangle is: " + area(-10, 23));
    }

    public static void main(String[] args) {
        try {
            meth1();

        } catch (NegativeValueException e) {
            System.out.println(e);
        }
    }
}
