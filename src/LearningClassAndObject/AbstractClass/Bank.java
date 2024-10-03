package LearningClassAndObject.AbstractClass;




abstract class BankAccount {
    double accountNumber;
    double Balance;
    abstract void deposit(double num);
    abstract void withdraw(double num);
    abstract  void getBalance();


}
class SavingAccounts extends BankAccount {
    double amount;

    public void deposit(double num) {
        this.amount+=num;
    }


    public void withdraw(double num) {
        this.amount-=num;
    }
    public void getBalance() {
        System.out.println(amount);
    }

}


public class Bank extends SavingAccounts {
    public static void main(String[] args) {

        SavingAccounts anuj=new SavingAccounts();
        anuj.deposit(1500);
        anuj.getBalance();
        anuj.deposit(1500);
        anuj.getBalance();
        anuj.deposit(1500);
        anuj.getBalance();
        anuj.withdraw(10000);
        anuj.getBalance();

    }
}
