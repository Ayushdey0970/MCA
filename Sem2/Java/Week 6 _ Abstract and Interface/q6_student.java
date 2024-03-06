import java.util.*;

interface department {
    String deptName = "";
    String deptHead = "";

    abstract void show();
}

class hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void show() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class student extends hostel implements department {
    String studentName, electiveSubject, deptName, deptHead;
    int regdNo;
    double avgMarks;

    student(String studentName, String electiveSubject, String deptName, String deptHead, int regdNo, double avgMarks,
            String hostelName, String hostelLocation, int numberOfRooms) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.electiveSubject = electiveSubject;
        this.deptName = deptName;
        this.deptHead = deptHead;
        this.regdNo = regdNo;
        this.avgMarks = avgMarks;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Student Name: " + studentName);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Department Name: " + deptName);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Department Head: " + deptHead);
    }
}

class q6_student {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

    }
}
