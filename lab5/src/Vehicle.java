package vehicles;

public class Vehicle {
    public String brand;
    public String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
