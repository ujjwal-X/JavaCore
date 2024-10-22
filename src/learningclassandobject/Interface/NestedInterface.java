package learningclassandobject.Interface;
//it is possible to declare nested interface and interface inside class
interface It11{
    interface It22{
        void m1();
    }
}
class School{
    interface Iteachers{

        int x=10;//we cant change this value  by default public static final
        void subjects();
    }
}
//public class NestedInterface implements It11.It22 {
//    @Override
//    public void m1() {
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        NestedInterface ni=new NestedInterface();
//        ni.m1();
//    }
//}

//*****to run  nested interface code uncomment the above main code
//if you want to see class nested interface code below
public class NestedInterface implements School.Iteachers {
    @Override
    public void subjects() {
        System.out.println("class nested Interface");
    }

    public static void main(String[] args) {

        NestedInterface ni=new NestedInterface();
        ni.subjects();
 
        System.out.println(ni.x);
    }
}