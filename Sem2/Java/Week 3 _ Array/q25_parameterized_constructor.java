class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class q25_parameterized_constructor {
    public static void main(String[] args) {
        
        Student stu1 = new Student("Arpan", 21);
        System.out.println("Student 1 Details:");
        stu1.displayDetails();

        Student stu2 = new Student("Frank", 21);
        System.out.println("\nStudent 2 Details:");
        stu2.displayDetails();
    }
}
