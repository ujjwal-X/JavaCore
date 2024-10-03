package StringPractice;
class  Test{
    private int i;
    Test(int i){
        this.i=i;
    }

    public Test modify(int i){
        if(this.i==i){
            return this;
        }
        else {
            return  new Test(i);
        }
    }



}
public class ImmutableClass {
//what is immutable class => Once we create object we are not allowed to change the content if anyone change the content
// with those changes new object will be create if there is not change in content repeating object will be reused
public static void main(String[] args) {
    Test t1=new Test(10);
    Test t2=t1.modify(100);
    Test t3=t1.modify(10);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t1==t2);
    System.out.println(t1==t3);
}
}
