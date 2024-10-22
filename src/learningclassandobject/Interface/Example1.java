package learningclassandobject.Interface;

class Phone{
    void call(){
        System.out.println("Phone Call");
    }
    void  sms(){
        System.out.println("Phone Sending SMS.....");
    }
}
interface  Icamera{
     int x=10;
    void click();
    void record();
}
interface IMusicPlayer{
     int x=11;
    void play();
    void stop();
}
class SmartPhone extends Phone implements Icamera,IMusicPlayer{

    public  void  videoCall(){
        System.out.println("Smart Phone Video Calling");
    }
    public void click(){
        System.out.println("Smart phone clicking Photo");
    }
    public  void record(){
        System.out.println("Smart phone is recording video");
    }
    public void play(){
        System.out.println("smart phone playing music");
    }
    public void stop(){
        System.out.println("Smart Phone is stopped playing music");
    }



}
public class Example1 {
    public static void main(String[] args) {

        SmartPhone smartPhone=new SmartPhone();

        smartPhone.call();
        smartPhone.videoCall();
        IMusicPlayer smartPhone1=new SmartPhone();
        smartPhone1.play();
        smartPhone1.stop();

    }
}

