package java8.methodreference;
interface Intref{
    public void add(int a,int b);

}
public class ReferenceAdd {
    public static void sum(int x,int y){
        System.out.println("The sum :"+(x+y));
    }

    public static void main(String[] args) {
        Intref i=ReferenceAdd::sum;
        i.add(10,20);
    }
}
