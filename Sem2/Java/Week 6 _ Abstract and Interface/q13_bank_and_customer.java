import java.util.*;

interface bank {
    float deposit(float amount);

    float withdraw(float amount);
}

class account implements bank {
    String name;
    long accountId;
    float balance;

    account(String name, long accountId, float balance) {
        this.name = name;
        this.accountId = accountId;
        this.balance = balance;
    }

    @Override
    public float deposit(float amount) {
        return balance + amount;
    }

    @Override
    public float withdraw(float amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
            return balance;
        } else {
            return balance - amount;
        }
    }
}

class customer extends account {

    customer(String name, long accountId, float balance) {
        super(name, accountId, balance);
    }

    void display() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountId);
        System.out.println("Account Balance: " + balance);
    }

    void create() {
        System.out.println("Account Created!!");
    }

    void close() {
        System.out.println("Account Closed!!");
    }
}

class q13_bank_and_customer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        ArrayList<customer> ar = new ArrayList<>();
        while (true) {
            System.out.println(
                    "1. Create Account\n2. Deposit Amount\n3. Withdraw Amount\n4. Display Details\n5. Close Account\n6. Exit: ");
            int ch = sc.nextInt();
            System.out.print("Enter Account Number: ");
            long accountId = sc.nextLong();
            boolean flag = false;
            switch (ch) {
                case 1:
                    flag = false;
                    for (customer c : ar) {
                        if (c.accountId == accountId) {
                            System.out.println("Account Already Exists!!");
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    } else {
                        System.out.print("Enter Account Name: ");
                        String name = sc.next();
                        System.out.print("Enter Balance: ");
                        float balance = sc.nextFloat();
                        customer o = new customer(name, accountId, balance);
                        ar.add(o);
                        break;
                    }
                case 2:
                    flag = false;
                    for (customer c : ar) {
                        if (c.accountId == accountId) {
                            System.out.print("Enter Amount to be Deposited: ");
                            float amount = sc.nextFloat();
                            c.balance = c.deposit(amount);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    } else {
                        System.out.println("This Account Doesn't Exist");
                        break;
                    }
                case 3:
                    flag = false;
                    for (customer c : ar) {
                        if (c.accountId == accountId) {
                            System.out.print("Enter Amount to Withdraw: ");
                            float amount = sc.nextFloat();
                            c.withdraw(amount);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    } else {
                        System.out.println("This Account Doesn't Exist");
                        break;
                    }
                case 4:
                    flag = false;
                    for (customer c : ar) {

                    }
            }
        }
    }
}
