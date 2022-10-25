package Sesi3_Praktikum;

public class Saving_Account extends Account {
    private double interestRate;

    Saving_Account(double balance, double interest_Rate){
        super(balance);
        interestRate = interest_Rate;
    }
    
}
