import java.util.*;

class q11_miles_to_kilometers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        double miles = sc.nextInt();
        double kilometers = miles * 1.60934;
        System.out.println(miles + " Miles is equal to: " + kilometers + " Kilometers");
    }
}
