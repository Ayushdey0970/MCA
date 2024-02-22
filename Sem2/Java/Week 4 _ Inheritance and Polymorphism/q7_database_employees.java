import java.util.*;

class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String toString() {
        return "Code: " + code + ", Name: " + name;
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Publication: " + publication;
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}

class Typist extends Staff {
    private int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    public RegularTypist(String code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public String toString() {
        return super.toString() + ", Remuneration: " + remuneration;
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    public CasualTypist(String code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public String toString() {
        return super.toString() + ", Daily Wages: " + dailyWages;
    }
}

public class q7_database_employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Teacher:");
        System.out.print("Code: ");
        String teacherCode = scanner.nextLine();
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Publication: ");
        String publication = scanner.nextLine();
        Teacher teacher = new Teacher(teacherCode, teacherName, subject, publication);
        System.out.println("Enter details for Officer:");
        System.out.print("Code: ");
        String officerCode = scanner.nextLine();
        System.out.print("Name: ");
        String officerName = scanner.nextLine();
        System.out.print("Grade: ");
        String grade = scanner.nextLine();
        Officer officer = new Officer(officerCode, officerName, grade);
        System.out.println("Enter details for Regular Typist:");
        System.out.print("Code: ");
        String regularTypistCode = scanner.nextLine();
        System.out.print("Name: ");
        String regularTypistName = scanner.nextLine();
        System.out.print("Speed: ");
        int regularTypistSpeed = scanner.nextInt();
        System.out.print("Remuneration: ");
        double remuneration = scanner.nextDouble();
        RegularTypist regularTypist = new RegularTypist(regularTypistCode, regularTypistName, regularTypistSpeed,
                remuneration);
        System.out.println("Enter details for Casual Typist:");
        System.out.print("Code: ");
        String casualTypistCode = scanner.next();
        System.out.print("Name: ");
        String casualTypistName = scanner.next();
        System.out.print("Speed: ");
        int casualTypistSpeed = scanner.nextInt();
        System.out.print("Daily Wages: ");
        double dailyWages = scanner.nextDouble();
        CasualTypist casualTypist = new CasualTypist(casualTypistCode, casualTypistName, casualTypistSpeed, dailyWages);
        System.out.println("Teacher: " + teacher);
        System.out.println("Officer: " + officer);
        System.out.println("Regular Typist: " + regularTypist);
        System.out.println("Casual Typist: " + casualTypist);
        scanner.close();
    }
}
