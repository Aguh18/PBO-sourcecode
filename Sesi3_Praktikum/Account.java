package Sesi3_Praktikum;

public class Account {
    protected double balance;
    Account(double initbalance){
        balance = 2000000.32;
    }
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        balance -= amt;

    }

}
