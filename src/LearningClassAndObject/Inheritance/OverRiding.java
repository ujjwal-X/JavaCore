//Name and arguments or parameters is always same to archive overriding
package LearningClassAndObject.Inheritance;

class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}
class  Sub extends  Super{
    public void display(){
        super.display();
        System.out.println("Sub class Display");
    }
}
public class OverRiding {
    public static void main(String[] args){
        Super obj = new Super();
        obj.display();
        Sub sub1=new Sub();
        sub1.display();
//        Dynamic method dispatch
        Super obj1=new Sub();
        obj1.display();
//        Sub obj5 =new Super();
//        obj5.display();
//        you cant create instance o
    }
}
