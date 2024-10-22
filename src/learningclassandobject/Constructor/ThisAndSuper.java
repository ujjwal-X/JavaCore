package learningclassandobject.Constructor;
class P{
    String s="parent variable";
}
class C extends P{
String s="Child Variable";
public void main(){
    System.out.println(s);
    System.out.println(this.s);
    System.out.println(super.s);
}
}
public class ThisAndSuper{
    public static void main(String[] args) {
C c1=new C();
c1.main();
    }
}
