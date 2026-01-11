package zad4;

import java.time.LocalDate;

public class Order {
    private int id;
    private String customerName;
    private LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", klient='" + customerName + '\'' +
                ", data=" + orderDate +
                '}';
    }
}