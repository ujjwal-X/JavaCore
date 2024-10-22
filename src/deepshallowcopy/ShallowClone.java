package deepshallowcopy;
class Address1 {
    String city;
    Address1(String city){
        this.city=city;
    }


}
class Person1 implements Cloneable{
    String name;
    Address1 address;
    Person1(String name,Address1 address){
        this.name=name;
        this.address=address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 a=new Address1("indore");
        Person1 p=new Person1("R",a);
        System.out.println(p.name+" "+p.address.city);
        Person1 p1=(Person1)p.clone();
        System.out.println("Changed");
        p1.address.city="Ujjain";
        System.out.println(p1.name="java"+" "+p1.address.city);
        System.out.println(p.name+" "+p.address.city);
        System.out.println(p1.name+" "+p1.address.city);

    }
}
