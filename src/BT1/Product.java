package BT1;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String brand;
    private int price;
    private String year;

    public Product() {
    }

    public Product(String id, String name,
                   String brand, int price, String year) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }
}
