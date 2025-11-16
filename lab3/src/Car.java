public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(){
        brand = "Nieznana marka";
        model = "Nieznany model";
        productionYear = 0;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.productionYear = 0;
    }

    public Car(String brand, String model, int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println("Samochód1: " + c1.brand + ", " + c1.model + ", " + c1.productionYear);

        Car c2 = new Car("Mercedes", "AMG GT");
        System.out.println("Samochód2: " + c2.brand + ", " + c2.model + ", " + c2.productionYear);

        Car c3 = new Car("Porshe", "GT3 RS", 2022);
        System.out.println("Samochód3: " + c3.brand + ", " + c3.model + ", " + c3.productionYear);


    }
}
