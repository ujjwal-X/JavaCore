package java8.methodreference;
import java.util.function.Supplier;

class Company
{
    String name;
    Company(){
        System.out.println("Object is created");
    }


    public Company(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}

public class ReferenceInstance
{
    public static void main(String[] args)
    {
        //Using reference of an object
        Company c=new Company("Microsoft");
        Supplier<String> getNames=c::getName;
        System.out.println(getNames.get());
        //Using constructor reference
        Supplier<Company> newCompany=Company::new;
        Company c2=newCompany.get();
        System.out.println(c2.getName());






    }
}
