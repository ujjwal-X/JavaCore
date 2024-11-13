package oops.Constructor.w3resource;
//Write a Java program to create a class called Account with instance variables accountNumber and balance.
// Implement a parameterized constructor that initializes these variables with validation:
//
//accountNumber should be non-null and non-empty.
//balance should be non-negative.
//Print an error message if the validation fails.
class Account{
    String accountNumber;
    double balance;

    Account(String accountNumber,double balance){
        if(!accountNumber.isEmpty()&&accountNumber.equals("")&&balance>=0){
            this.accountNumber=accountNumber;
            this.balance=balance;
        }else{
            System.out.println("Please enter valid details");
        }

    }

}
public class Quest6 {
    public static void main(String[] args) {
        Account a=new Account("90",-9);
    }
}
