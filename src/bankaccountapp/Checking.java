package bankaccountapp;

public class Checking extends Account {
    // List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    // List any methods specific to the checking account
    // Create debit card fields
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    // Override showInfo
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("\nYour Checking Account Features" +
                "\n  Debit Card Number: " + debitCardNumber +
                "\n  Debit Card PIN: " + debitCardPIN);
    }
}