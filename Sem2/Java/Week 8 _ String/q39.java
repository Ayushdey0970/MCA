import java.util.Scanner;

public class q39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int asciiValue = character;
            System.out.println("Character: " + character + ", ASCII Value: " + asciiValue);
        }
        sc.close();
    }
}
