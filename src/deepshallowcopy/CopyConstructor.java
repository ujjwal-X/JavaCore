package deepshallowcopy;
class  Address2{
    String city;
    Address2(String city){
        this.city=city;
    }

}
class Person2{
    String name;
    Address2 address;
    Person2(String name, Address2 address){
        this.name=name;
    this.address=address;

    }
    Person2(Person2 p){
        this.name= p.name;
        this.address=p.address;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Address2 a=new Address2("USA");
        Person2 p=new Person2("James",a);
        Person2 p1=new Person2(p);
        System.out.println("Values of p"+p.name+" "+p.address.city);
        p1.name="Gosling";p1.address.city="Indore";
        System.out.println("Values of p"+p1.name+" "+p1.address.city);
        System.out.println("Values of p1 is changed");
        System.out.println("Values of p"+p.name+" "+p.address.city);
        System.out.println("Values of p"+p1.name+" "+p1
                .address.city);



    }

}
