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

    float rateOfInterest, time;

    savingsAccount(float balance, long accountNumber, String accountHolderName, String address, float rateOfInterest,
            float time) {
        super(balance, accountNumber, accountHolderName, address);
        this.rateOfInterest = rateOfInterest;
        this.time = time;
    }

    @Override
    float deposit(float amount) {
        return balance + amount;
    }

    @Override
    float withdraw(float amount) {
        if (balance < amount) {
            System.out.println("*** Insufficient Balance ***");
            return balance;
        } else {
            return balance - amount;
        }
    }

    float calculateAmount() {
        return balance + balance * rateOfInterest * time / 100;
    }

    void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println("Balance after " + time + " years: " + calculateAmount());
    }
}

class q8_savings_account {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        ArrayList<savingsAccount> ar = new ArrayList<>();
        while (true) {
            System.out.println(
                    "\n1. Add a New Account Holder\n2. Update a Existing Account\n3. Display Account Details\n4. Exit:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Name of the Account Holder: ");
                    String name = sc.next();
                    System.out.print("Enter Address of the Account Holder: ");
                    String address = sc.next();
                    System.out.print("Enter Account Number: ");
                    long number = sc.nextLong();
                    boolean flag = false;
                    for (savingsAccount i : ar) {
                        if (number == i.accountNumber) {
                            System.out.println("This Account Already Exists");
                            flag = true;
                            break;
                        }
                    }
                    if (flag == true) {
                        break;
                    }
                    System.out.print("Enter Balance: ");
                    float balance = sc.nextFloat();
                    System.out.print("Enter Rate of Interest: ");
                    float rate = sc.nextFloat();
                    System.out.print("Enter Time: ");
                    float time = sc.nextFloat();
                    savingsAccount ac = new savingsAccount(balance, number, name, address, rate, time);
                    ar.add(ac);
                    System.out.println("*** Account Added Successfully ***");
                    break;
                case 2:
                    System.out.println(
                            "\na. Update Name\nb. Update Address\nc. Deposit into Account\nd. Withdraw from Account:");
                    char c = sc.next().charAt(0);
                    System.out.print("Enter Account Number: ");
                    long accountNumber = sc.nextLong();
                    flag = false;
                    for (savingsAccount x : ar) {
                        if (x.accountNumber == accountNumber) {
                            flag = true;
                            switch (c) {
                                case 'a':
                                    System.out.print("Enter New Name: ");
                                    x.accountHolderName = sc.next();
                                    break;
                                case 'b':
                                    System.out.print("Enter New Address: ");
                                    x.address = sc.next();
                                    break;
                                case 'c':
                                    System.out.print("Enter Amount: ");
                                    float deposit = sc.nextFloat();
                                    x.balance = x.deposit(deposit);
                                    x.display();
                                    break;
                                case 'd':
                                    System.out.print("Enter Amount: ");
                                    float withdraw = sc.nextFloat();
                                    x.balance = x.withdraw(withdraw);
                                    x.display();
                                    break;
                            }
                            break;
                        }
                    }
                    if (flag == false) {
                        System.out.println("*** No Account with this Account Number exists ***");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    long num = sc.nextLong();
                    flag = false;
                    for (savingsAccount i : ar) {
                        if (i.accountNumber == num) {
                            flag = true;
                            i.display();
                            break;
                        }
                    }
                    if (flag == false) {
                        System.out.println("*** No Account with this Account Number exists ***");
                    }
                    break;
                case 4:
                    System.out.println("*** Exiting ***");
                    System.exit(0);
            }
        }
    }
}
