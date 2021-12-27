package java11.clothing.model;

import java.text.NumberFormat;

@SuppressWarnings("unused")
public class ClothingItem {
    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";
    public static final String HAT = "Hat";

    private String type;
    private ClothingSize size;
    private double price;
    private int quantity;

    public ClothingItem() {
        type = "";
        size = null;
        price = 0;
        quantity = 0;
    }

    public ClothingItem(String type, ClothingSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        var totalPrice = getPrice() * getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("%s %s will cost %s", getSize(), getType(), formatter.format(totalPrice));
        System.out.println(output);
    }
}
