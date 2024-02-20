import java.util.*;

class Employee {
    int id, basicSalary;
    String name;

    Employee(int id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void print() {
        System.out.format("%10s  %5d  %12d\n", name, id, basicSalary);
    }
}

class q10_employee_details_again {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String name[] = new String[5];
        int id[] = new int[5];
        int basicSalary[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Employee Name: ");
            name[i] = sc.next();
            System.out.print("Enter Employee Id: ");
            id[i] = sc.nextInt();
            System.out.print("Enter Employee Basic Salary: ");
            basicSalary[i] = sc.nextInt();
        }
        Employee obj1 = new Employee(id[0], name[0], basicSalary[0]);
        Employee obj2 = new Employee(id[1], name[1], basicSalary[1]);
        Employee obj3 = new Employee(id[2], name[2], basicSalary[2]);
        Employee obj4 = new Employee(id[3], name[3], basicSalary[3]);
        Employee obj5 = new Employee(id[4], name[4], basicSalary[4]);
        System.out.println("  Employee     Id  Basic Salary");
        obj1.print();
        obj2.print();
        obj3.print();
        obj4.print();
        obj5.print();
    }
}
