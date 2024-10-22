package doubts;

class Address{
    String city;
    Address(String city){
        this.city=city;
    }
    Address(Address a){
        this.city=a.city;
    }


}
class Person{
    String name;
    Address address;
    Person(String name, Address address){
        this.name=name;
        this.address=address;
    }
    Person(Person p){
        this.name=p.name;
        this.address = new Address(p.address);
    }

}

public class Person1 {
    public static void main(String[] args) {
        Address a=new Address("Indore");
        Person p=new Person("yash",a);
        Person p1=new Person(p);
        System.out.println(p.name);
        System.out.println(p.address.city);
        System.out.println("=====");
        p1.address.city="Ujjain";
        System.out.println(p1.address.city);
        System.out.println(p1.name);
        System.out.println("=====");
        System.out.println(p.name);
        System.out.println(p.address.city);




    }
}
