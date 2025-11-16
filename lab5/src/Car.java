package vehicles;

public class Car extends Vehicle {

    public int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void showInfo() {
        System.out.println("Brand: " + brand +
                ", Model: " + model +
                ", Doors: " + numberOfDoors);
    }
}
