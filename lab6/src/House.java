public class House extends Property {
    private int numberOfFloors;

    public House(String address, double size, double price, int numberOfFloors) {
        super(address, size, price);
        if (numberOfFloors < 0) {
            this.numberOfFloors = 0;
        } else {
            this.numberOfFloors = numberOfFloors;
        }
    }

    @Override
    public String toString() {
        return "House -> " + super.toString() + ", floors: " + numberOfFloors;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        House other = (House) obj;
        return numberOfFloors == other.numberOfFloors;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + numberOfFloors;
    }
}
