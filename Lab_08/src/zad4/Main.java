package zad4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; // Ważny import
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Zabka", LocalDate.of(2025, 12, 24)));
        orders.add(new Order(2, "Biedronka", LocalDate.of(2025, 11, 1)));
        orders.add(new Order(3, "Auchan", LocalDate.of(2025, 11, 1)));
        orders.add(new Order(4, "Lidl", LocalDate.of(2026, 1, 15)));
        orders.add(new Order(5, "Dino", LocalDate.of(2025, 10, 10)));

        System.out.println("Przed posortowaniem:");
        for (Order o : orders) {
            System.out.println(o);
        }

        Comparator<Order> complexComparator = new OrderDateComparator()
                .thenComparing(new CustomerNameComparator());

        Collections.sort(orders, complexComparator);

        System.out.println("\nPo posortowaniu (Data rosnąco, przy remisie nazwa a-z):");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}