package bankaccountapp;

public class Savings extends Account {
    // List properties specific to a checking account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name) {
        super(name);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to the savings account

}