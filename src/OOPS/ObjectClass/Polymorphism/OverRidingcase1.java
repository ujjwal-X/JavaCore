package OOPS.ObjectClass.Polymorphism;
class Parent2{
    public Object m1(){
        return null;
    }
}
class Child1 extends Parent2{//covariant return are allowed in java after 1.4 onwards in which we can change return types
    //covariant must be parent to child not child to parent
    public String m1(){
        return null;
    }

}
public class OverRidingcase1 extends Child1 {
    public static void main(String[] args) {
OverRidingcase1 p=new OverRidingcase1();
p.m1();
    }
}
