package main.Homework6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Product implements Comparable<Product> {
    private final int id;
    private final boolean discount;
    private final LocalDate dateAdded;
    private final String type;
    private double price;

    public Product(String type, double price, int id, boolean discount, LocalDate dateAdded) {
        this.type = type;
        this.setPrice(this.price);
        this.id = id;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setPrice(double price) {
        BigDecimal round = new BigDecimal(price).setScale(1, RoundingMode.HALF_UP);
        this.price = round.doubleValue();
    }

    public void setDiscount() {
        setPrice(this.price * 0.9);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", discount=" + discount +
                ", dateAdded=" + dateAdded +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product n) {
        return Double.compare(this.price,n.price);
        //TODO >>>>> compare prices
    }
}
