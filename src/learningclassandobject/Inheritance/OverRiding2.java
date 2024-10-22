package learningclassandobject.Inheritance;
class TV{
    void switchOn(){
        System.out.println("Tv is Switched on");
    }
    void changeChannel(){
        System.out.println("Tv channel is Changed");
    }

}
class SmartTV extends TV{
    void switchOn(){
        System.out.println("smartTV is Switched on");
    }
    void changeChannel(){
        System.out.println("SmartTV channel is Changed");
    }
    void browse(){
        System.out.println("SmartTV Browsing");
    }
}
public class OverRiding2 {
    public static void main(String[] args) {
        TV t=new TV();
        t.switchOn();
        SmartTV s=new SmartTV();
        s.changeChannel();
        s.browse();
//     Dynamic method dispatch
        TV p=new SmartTV();
        p.changeChannel();

    }
}
