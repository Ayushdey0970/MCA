interface MyInterface {
    void display();
}

interface MyExtendedInterface extends MyInterface {
    void show();
}

public class q33 implements MyExtendedInterface {
    public void display() {
        System.out.println("Display method implementation");
    }

    public void show() {
        System.out.println("Show method implementation");
    }

    public static void main(String[] args) {
        q33 example = new q33();
        example.display();
        example.show();
    }
}
