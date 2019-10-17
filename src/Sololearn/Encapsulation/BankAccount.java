package Sololearn.Encapsulation;

class BankAccount {
    private double balance = 0; //Balance variable is hidden

    public void deposit(double x) { //Gives access to balance variable
        if (x > 0) { //Validates value to be deposited before modifying balance
            balance += x; //Deposits value to balance variable
        }
    }
}
