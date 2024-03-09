import java.util.*;

abstract class abstractProduct {
    int product_id;
    String name, description;
}

class product extends abstractProduct {
    float price;

    product(int product_id, String name, String description, float price) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    void display() {
        System.out.println("\n*** Product Class is Called ***\n");
        System.out.println("Product Id: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

class compactDisk extends product {
    String artist, title;

    compactDisk(int product_id, String name, String description, float price, String artist, String title) {
        super(product_id, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("\n*** Compact Disk Class is Called ***\n");
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

class book extends product {
    long isbn;
    String author, title;

    book(int product_id, String name, String description, float price, long isbn, String author, String title) {
        super(product_id, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("\n*** Book Class is Called ***\n");
        System.out.println("ISBN Number: " + isbn);
        System.out.println("Author Name: " + author);
        System.out.println("Book Title: " + title);
    }
}

class travelGuide extends book {
    String country;

    travelGuide(int product_id, String name, String description, float price, long isbn, String author, String title,
            String country) {
        super(product_id, name, description, price, isbn, author, title);
        this.country = country;
    }

    void display() {
        super.display();
        System.out.println("\n*** Travel Guide Class is Called ***\n");
        System.out.println("Country: " + country);
    }
}

class q11_product_details {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("\n1. Product\n2. Book\n3. Travel Guide\n4. Compact Disk");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter Product Id: ");
                int product_id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Description: ");
                String description = sc.next();
                System.out.print("Enter Price: ");
                float price = sc.nextFloat();
                product o1 = new product(product_id, name, description, price);
                o1.display();
                break;
            case 2:
                System.out.print("Enter Product Id: ");
                product_id = sc.nextInt();
                System.out.print("Enter Name: ");
                name = sc.next();
                System.out.print("Enter Description: ");
                description = sc.next();
                System.out.print("Enter Price: ");
                price = sc.nextFloat();
                System.out.print("Enter ISBN Number: ");
                long isbn = sc.nextLong();
                System.out.print("Enter Artist Name: ");
                String artist = sc.next();
                System.out.print("Enter Book Name: ");
                String title = sc.next();
                book o2 = new book(product_id, name, description, price, isbn, artist, title);
                o2.display();
                break;
            case 3:
                System.out.print("Enter Product Id: ");
                product_id = sc.nextInt();
                System.out.print("Enter Name: ");
                name = sc.next();
                System.out.print("Enter Description: ");
                description = sc.next();
                System.out.print("Enter Price: ");
                price = sc.nextFloat();
                System.out.print("Enter ISBN Number: ");
                isbn = sc.nextLong();
                System.out.print("Enter Artist Name: ");
                artist = sc.next();
                System.out.print("Enter Book Name: ");
                title = sc.next();
                System.out.print("Enter Country: ");
                String country = sc.next();
                travelGuide o3 = new travelGuide(product_id, name, description, price, isbn, artist, title, country);
                o3.display();
                break;
            case 4:
                System.out.print("Enter Product Id: ");
                product_id = sc.nextInt();
                System.out.print("Enter Name: ");
                name = sc.next();
                System.out.print("Enter Description: ");
                description = sc.next();
                System.out.print("Enter Price: ");
                price = sc.nextFloat();
                System.out.print("Enter Artist Name: ");
                artist = sc.next();
                System.out.print("Enter Book Name: ");
                title = sc.next();
                compactDisk o4 = new compactDisk(product_id, name, description, price, artist, title);
                o4.display();
                break;
        }
    }
}
