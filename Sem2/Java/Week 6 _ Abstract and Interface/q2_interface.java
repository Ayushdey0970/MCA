import java.util.*;

interface sample_interface {
    void display();
}

class q2_interface implements sample_interface {
    @Override
    public void display() {
        System.out.println("My Name is Ayush Dey");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        q2_interface obj = new q2_interface();
        obj.display();
    }
}
