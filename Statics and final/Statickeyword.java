public class Statickeyword{
    static int price = 100;

    static double onRoadPrice(String city){   //Sattic method only excess static memeber

        // We can't use this or super here
        switch(city){
            case "Delhi":
                return price * (price * 10/100);
            default:
                return price * (price * 0.09);
        }
    }
    public static void main(String[] args){
            System.out.println(Statickeyword.price);
            System.out.println(Statickeyword.onRoadPrice("Delhi"));
            System.out.println(Statickeyword.onRoadPrice("Mumbai"));


    }
}