package LearningClassAndObject.Interface;
interface Test{
    void meth1();
    void meth2();
}
class My implements Test{
public void meth1(){
        System.out.println("meth1 of class MY");
    }
    public void meth2(){
        System.out.println("meth2 of class MY");
    }
   public void meth3(){
        System.out.println("meth3 of class MY");
    }
}
public class InterfacePractice {
    public static void main(String[] args) {
        Test t=new My();
        t.meth1();
        t.meth2();
    }
}
