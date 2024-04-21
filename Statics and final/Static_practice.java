public class Static_practice {
    static int x = 20;        // have single copy
    int y = 10;
    public void show(){
        System.out.println(x + " " + y);
    }
    public static void main(String[ ] args){
        Static_practice obj1 = new Static_practice();
        Static_practice obj2 = new Static_practice();
        obj1.show();
        // obj1.x = 100;
        obj1.y = 200;
        obj2.show();
        obj1.show();
    }
}

// ONly innner class can be static