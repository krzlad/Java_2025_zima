package zad2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Mleko", 4.50, LocalDate.of(2025, 12, 10)));
        products.add(new Product("Chleb", 3.20, LocalDate.of(2025, 12, 5)));
        products.add(new Product("Masło", 7.00, LocalDate.of(2025, 12, 10)));
        products.add(new Product("Ser", 15.99, LocalDate.of(2026, 1, 15)));
        products.add(new Product("Jogurt", 2.50, LocalDate.of(2025, 11, 20)));

        System.out.println("Przed posortowaniem: ");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products);

        System.out.println("\nPo posortowaniu (Data malejąco, przy takich samych, cena rosnąco) :");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}