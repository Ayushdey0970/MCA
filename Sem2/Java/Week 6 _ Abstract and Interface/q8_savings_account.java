import java.util.*;

abstract class accounts {
    float balance;
    long accountNumber;
    String accountHolderName, address;

    accounts(float balance, long accountNumber, String accountHolderName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    abstract float withdraw(float amount);

    abstract float deposit(float amount);

    void display() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Holder Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }
}

class savingsAccount extends accounts {

    float rateOfInterest;

    savingsAccount(float balance, long accountNumber, String accountHolderName, String address, float rateOfInterest) {
        super(balance, accountNumber, accountHolderName, address);
        this.rateOfInterest=rateOfInterest;
    }

    @Override
    float deposit(float amount) {
        return balance + amount;
    }

    @Override
    float withdraw(float amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
            return -1;
        } else {
            return balance - amount;
        }
    }

    float calculateAmount() {
        return balance*(1+rateOfInterest/100);
    }
}

class q8_savings_account {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        ArrayList<savingsAccount> ar=new ArrayList<>();

    }
}
