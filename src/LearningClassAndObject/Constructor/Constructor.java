package LearningClassAndObject.Constructor;
class  Reactangles{
    private  double length;
    private  double breadth;
     Reactangles(){
        length=1;
        breadth=1;
        System.out.println("non para const");
    }
    Reactangles(double length){
        System.out.println("single para const");
    }
    Reactangles(double l,double b){
        length=1;
        breadth=1;
        System.out.println("double para const");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Reactangles r=new Reactangles();
    }
}
