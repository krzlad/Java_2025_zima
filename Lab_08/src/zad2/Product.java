package zad2;

import java.time.LocalDate;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + name + '\'' +
                ", cena=" + price +
                ", data ważności=" + expirationDate +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        int dateComparison = other.expirationDate.compareTo(this.expirationDate);

        if (dateComparison != 0) {
            return dateComparison;
        }

        return Double.compare(this.price, other.price);
    }
}