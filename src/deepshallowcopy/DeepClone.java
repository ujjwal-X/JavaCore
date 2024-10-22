
package deepshallowcopy;
class Address implements Cloneable{
    String city;
    Address(String city){
        this.city=city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    String name;
    Address address;
    Person(String name,Address address){
        this.name=name;
        this.address=address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p1=(Person) super.clone();
        p1.address=(Address) address.clone() ;
        return p1;
    }
}

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a=new Address("indore");
        Person p=new Person("R",a);
        Person p1=(Person) p.clone();
        System.out.println("==============Original===================");
        System.out.println(p.name);
        System.out.println(p.address.city);
        System.out.println(p1.name);
        System.out.println(p1.address.city);
        System.out.println("==============Changed==============");
        System.out.println(p.name="H");
        System.out.println(p.address.city="Ujjain");
        System.out.println(p1.name);
        System.out.println(p.address.city);
        System.out.println(p1.address.city);
        System.out.println("==============Changed2==============");
        System.out.println(p.name="James Gosling");
        System.out.println(p.address.city="America");
        System.out.println(p1.name);
        System.out.println(p.address.city);
        System.out.println(p1.address.city);




    }
}

