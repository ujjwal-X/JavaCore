package doubts;

public class ObjectMethod implements Cloneable {
    int x=10;
    int y=100;
    public static void main(String[] args)  throws CloneNotSupportedException  {


        ObjectMethod o=new ObjectMethod();
            ObjectMethod o1 = (ObjectMethod) o.clone();
            System.out.println("original"+o.x);
            System.out.println("deep "+o1.x);
            o.x=10000000;
            System.out.println("original"+o.x);
            System.out.println("deep"+o1.x);
    }
}
