public class Car {
    String brand;
    String model;
    int productionYear;

    // 1. Konstruktor domyślny
    public Car() {
        brand = "Nieznana marka";
        model = "Nieznany model";
        productionYear = 0;
    }

    // 2. Konstruktor z dwoma argumentami
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.productionYear = 0;  // bo nie podano roku
    }

    // 3. Konstruktor z trzema argumentami
    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public void printInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + productionYear);
    }
}
