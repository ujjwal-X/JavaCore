package learningclassandobject.InnerClasses;
class Outer{
    //it is not static method thats why we first need to create an object of outer class and then object of inner
    // class
//    what if inner class is private?? answer= we have to make an object in a method which is present outside the inner class
     class Inner{
        public void innerDisplay(){
            System.out.println("I am Inner Function");
        }
    }
    public void outerDisplay(){

            System.out.println("I am Outer Function");
        Inner i=new Inner();
        i.innerDisplay();
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
       Outer o= new Outer();
        o.outerDisplay();



//        Outer.Inner o1=new Outer().new Inner();
//        o1.innerDisplay();


    }
}
