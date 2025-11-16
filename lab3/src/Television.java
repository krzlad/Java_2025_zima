public class Television {
    private String brand;
    private double screenDiagonal;
    private String resolution;
    private boolean isSmartTV;
    private double price;

    public Television(String brand, double screenDiagonal, String resolution, boolean isSmartTV, double price){
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.resolution = resolution;
        this.isSmartTV = isSmartTV;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSmartTV(boolean smartTV) {
        isSmartTV = smartTV;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInformation(){
        System.out.println("Marka: " + brand);
        System.out.println("Przekątna ekranu: " + screenDiagonal);
        System.out.println("Rozdzielczość: " + resolution);
        System.out.println("Smart TV: " + isSmartTV);
        System.out.println("Cena: " + price + " zł");
    }

    public static void main(String[] args){
        Television tv = new Television("Samsung", 55.0, "4k", true, 2999.99);
        tv.showInformation();
    }
}
