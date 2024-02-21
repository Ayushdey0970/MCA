import java.util.*;
import java.text.*;

class Account {
    private int id;
    private double balance, annualInterestRate;
    private String dataCreated;
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    static Date date = new Date();

    Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dataCreated = formatter.format(date);
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dataCreated = formatter.format(date);
    }

    void getMonthlyInterestRate() {

    }
}

class q13_Interest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

    }
}
