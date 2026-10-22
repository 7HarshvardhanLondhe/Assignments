
class BankAccount {
    protected int accountNumber;
    protected String holderName;
    protected double balance;

    BankAccount(int number, String name, double balance) {
        accountNumber = number;
        holderName = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(int number, String name,
                   double balance, double rate) {
        super(number, name, balance);
        interestRate = rate;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(int number, String name,
                   double balance, double limit) {
        super(number, name, balance);
        overdraftLimit = limit;
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(
            101, "Rahul", 50000, 4.5
        );

        CurrentAccount c = new CurrentAccount(
            102, "Amit", 80000, 20000
        );

        s.display();
        System.out.println();
        c.display();
    }
}
