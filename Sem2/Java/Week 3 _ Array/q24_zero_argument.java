class MyClass {
    public MyClass() {
        System.out.println("This is a 0-argument constructor.");
    }

    public void display() {
        System.out.println("hi, how are you?");
    }
}

public class q24_zero_argument {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
