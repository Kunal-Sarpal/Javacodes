class Phone{
    public void call(){

    }
    public void sms(){

    }
}
interface ICamera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera, MusicPlayer{

    public void call(){
        System.out.println("hELOO");
    }
    public void sms(){
        System.out.println("hELOO");

    }
    public void click(){
        System.out.println("hELOO");

    }
    public void record(){
        System.out.println("hELOO");

    }
    public void play(){
        System.out.println("hELOO");

    }
    public void pause(){
        System.out.println("hELOO");

    }
    public void stop(){
        System.out.println("hELOO");
    }

}
public class Interface_phone {
    public static void main(String[] args){
     SmartPhone iphone = new SmartPhone();
     iphone.call();
     iphone.sms();
     iphone.click();
     iphone.record();
     iphone.play();
     iphone.pause();
     iphone.stop();
     
    }
}
