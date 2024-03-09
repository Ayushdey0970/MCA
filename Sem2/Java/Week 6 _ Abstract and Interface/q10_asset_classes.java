import java.util.*;

abstract class asset {

    String descriptor;
    Date date;
    float currentValue;

    abstract void displayDetails();
}

class stock extends asset {
    int num_shares;
    float share_price;

    stock(String descriptor, Date date, float currentValue, int num_shares, float share_price) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
        this.num_shares = num_shares;
        this.share_price = share_price;
    }

    @Override
    void displayDetails() {
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
    }
}

class bond extends asset {
    float interest_rate;

    bond(String descriptor, Date date, float currentValue, float interest_rate) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
        this.interest_rate = interest_rate;
    }

    @Override
    void displayDetails() {
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interest_rate);
    }
}

class savings extends asset {
    float interest_rate;

    savings(String descriptor, Date date, float currentValue, float interest_rate) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
        this.interest_rate = interest_rate;
    }

    @Override
    void displayDetails() {
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interest_rate);
    }
}

class q10_asset_classes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("\n*** Stock Method ***\n");
        System.out.print("Enter Descriptor Name: ");
        String descriptor = sc.next();
        Date date = new Date();
        System.out.println("Today's Date: " + date.toString());
        System.out.print("Enter Current Value: ");
        float currentValue = sc.nextFloat();
        System.out.print("Price of a Single Share: ");
        float share_price = sc.nextFloat();
        System.out.print("Enter Number of Shares: ");
        int num_shares = sc.nextInt();
        stock o1 = new stock(descriptor, date, currentValue, num_shares, share_price);
        System.out.println();
        o1.displayDetails();
        System.out.println("\n*** Bond Method ***\n");
        System.out.print("Enter Interest Rate: ");
        float interest_rate = sc.nextFloat();
        bond o2 = new bond(descriptor, date, currentValue, interest_rate);
        System.out.println();
        o2.displayDetails();
        System.out.println("\n*** Savings Method ***\n");
        System.out.print("Enter Interest Rate: ");
        interest_rate = sc.nextFloat();
        savings o3 = new savings(descriptor, date, currentValue, interest_rate);
        System.out.println();
        o3.displayDetails();
    }
}
