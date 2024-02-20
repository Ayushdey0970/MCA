import java.util.*;

class Item {
    int code, price;

    Item(int code, int price) {
        this.code = code;
        this.price = price;
    }

    void print() {
        System.out.format("%4d  %5d\n", code, price);
    }
}

class q8_item_and_price {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int code[] = new int[5];
        int price[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Code " + (i + 1) + ": ");
            code[i] = sc.nextInt();
            System.out.print("Enter Price " + (i + 1) + ": ");
            price[i] = sc.nextInt();
        }
        Item obj1 = new Item(code[0], price[0]);
        Item obj2 = new Item(code[1], price[1]);
        Item obj3 = new Item(code[2], price[2]);
        Item obj4 = new Item(code[3], price[3]);
        Item obj5 = new Item(code[4], price[4]);
        System.out.println("Code  Price");
        obj1.print();
        obj2.print();
        obj3.print();
        obj4.print();
        obj5.print();
    }
}
