import java.io.OutputStream;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os = o;
    }
    public void run(){
        int count = 1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer " + count);
                count++;
            }
            catch(Exception e){

            }
        }
    }
}
public class Pipedinputstreams {
    public static void main(String[] args) {
        
    }
}

