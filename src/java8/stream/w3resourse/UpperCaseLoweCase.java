package java8.stream.w3resourse;//package java8.stream.w3resourse;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class UpperCaseLoweCase {
//    public static void main(String[] args) {
////        List<String> al= List.of("java","c++","c#","ruby"); This are immutable  means we cant changed it after its initialized
////        List<String> al1= Arrays.asList("java","c++","c#","ruby");  This is
//
////        System.out.println(al);
//        List<String> al1= Arrays.asList("java","c++","c#","ruby");
//
//
//    }
//}

import java.util.Optional;

class Person
{
    //house declared as an Optional

    House house;

    public House getHouse()
    {
        return house;
    }
}

class House
{
    //houseLoan declared as an Optional

    Optional<HouseLoan> houseLoan;

    public Optional<HouseLoan> getHouseLoan()
    {
        return houseLoan;
    }
}

class HouseLoan
{
    String houseLoanDetails;

    public String getHouseLoanDetails()
    {
        return houseLoanDetails;
    }
}
public class UpperCaseLoweCase {
    public static void main(String[] args) {
        Person p= new Person();
        System.out.println(p.getHouse());
    }
}