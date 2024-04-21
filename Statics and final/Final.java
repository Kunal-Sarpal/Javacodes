public class Final {
    final int MIN = 1;
    final int MAX;
    final int NORMAL;
    static class New{

        static {
            MAX = 23;
        }

    }

    Final() {
        NORMAL = 233;
    }

    public static void main(String[] args) {
        System.out.println("Chalo Bhai...");
    }
}


// Final method cannot be overide 