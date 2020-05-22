package bankaccountapp;

public abstract class Account implements BaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String SSN;
    private double balance;
    private String accountNumber;
    private double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name) {
        System.out.println("Name: " + name);
        System.out.print("NEW ACCOUNT: ");
    }

    // List common methods

}