import java.util.Scanner;

interface Employee {
    void getEmployeeDetails();

    double calculateSalary();
}

interface TaxPayer {
    double calculateTax();
}

class FullTimeEmployee implements Employee, TaxPayer {
    @SuppressWarnings("unused")
    private String name;
    private double salary;

    static Scanner sc = new Scanner(System.in);

    public void getEmployeeDetails() {
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        salary = sc.nextDouble();
    }

    public double calculateSalary() {
        return salary;
    }

    public double calculateTax() {
        return 0.2 * salary;
    }
}

class Contractor implements Employee {
    @SuppressWarnings("unused")
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    static Scanner sc = new Scanner(System.in);

    public void getEmployeeDetails() {
        System.out.print("Enter contractor name: ");
        name = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        hourlyRate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        hoursWorked = sc.nextInt();
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class q18_multiple_inheritance_payroll_emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for a Full-time Employee:");
        FullTimeEmployee ob1 = new FullTimeEmployee();
        ob1.getEmployeeDetails();

        System.out.println("\nEnter details for a Contractor:");
        Contractor ob2 = new Contractor();
        ob2.getEmployeeDetails();
        System.out.println("\nFull-time Employee Details:");
        System.out.println("Name: " + ob1.calculateSalary());
        System.out.println("Tax: " + ob1.calculateTax());
        System.out.println("\nContractor Details:");
        System.out.println("Name: " + ob2.calculateSalary());

        sc.close();
    }
}
