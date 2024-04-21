// Static block-> ones the class loaded then static block will execute

class Test{
    static{
        System.out.println("BLock from Test class");
    }
}
public class Static_Block {
    static int x = 90;
    static{
        System.out.println("Block1");
    }
    static{
        System.out.println("Block2");
    }

    public static void main(String[] args){
        // Test obj = new Test();
        System.out.println("Blockfrom main class");
    }

    static{
        System.out.println("Block3");
    }

}
