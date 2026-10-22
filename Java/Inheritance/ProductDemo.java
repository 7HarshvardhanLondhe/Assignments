
class Product {
    protected int productId;
    protected String productName;
    protected double price;

    Product(int id, String name, double price) {
        productId = id;
        productName = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
    }
}

class Grocery extends Product {
    private String expiryDate;

    Grocery(int id, String name, double price, String expiry) {
        super(id, name, price);
        expiryDate = expiry;
    }

    void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

class Clothing extends Product {
    private String size, material;

    Clothing(int id, String name, double price,
             String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    void display() {
        super.display();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Grocery g = new Grocery(
            101, "Milk", 60, "25-12-2026"
        );

        Clothing c = new Clothing(
            102, "T-Shirt", 500, "L", "Cotton"
        );

        g.display();
        System.out.println();
        c.display();
    }
}
