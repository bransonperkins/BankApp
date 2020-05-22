package BankApplication;

public class BankApp {

    public static void main(String[] args) {
        // Set up project file structure
        System.out.println("Set up");

        Bank testBank = new Bank("test");
        System.out.println(testBank.test);
    }
}