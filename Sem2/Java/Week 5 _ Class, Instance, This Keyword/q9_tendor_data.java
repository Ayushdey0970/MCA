import java.util.*;

class Tendor {
    int cost;
    String name;

    Tendor(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }
}

class q9_tendor_data {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int cost[] = new int[5];
        String name[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Cost " + (i + 1) + ": ");
            cost[i] = sc.nextInt();
            System.out.print("Enter Name " + (i + 1) + ": ");
            name[i] = sc.next();
        }
        Tendor obj1 = new Tendor(cost[0], name[0]);
        Tendor obj2 = new Tendor(cost[1], name[1]);
        Tendor obj3 = new Tendor(cost[2], name[2]);
        Tendor obj4 = new Tendor(cost[3], name[3]);
        Tendor obj5 = new Tendor(cost[4], name[4]);
        int min = Integer.MAX_VALUE;
        String s = "";
        if (min > obj1.cost) {
            min = obj1.cost;
            s = obj1.name;
        }
        if (min > obj2.cost) {
            min = obj2.cost;
            s = obj2.name;
        }
        if (min > obj3.cost) {
            min = obj3.cost;
            s = obj3.name;
        }
        if (min > obj4.cost) {
            min = obj4.cost;
            s = obj4.name;
        }
        if (min > obj5.cost) {
            min = obj5.cost;
            s = obj5.name;
        }
        System.out.println("The Company with Minimum Cost is: " + s);
    }
}
