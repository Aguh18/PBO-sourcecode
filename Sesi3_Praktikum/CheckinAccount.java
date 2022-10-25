package Sesi3_Praktikum;

public class CheckinAccount extends Account{
    private double overdraftProtection;

    public CheckinAccount(double balance){
        this(balance, balance);
        overdraftProtection = -1.0;


    }
    public CheckinAccount(double balance, double protect){
        super(balance);
        overdraftProtection = protect;
    }
}
