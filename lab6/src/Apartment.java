public class Apartment extends Property {
    private int floorNumber;

    public Apartment(String address, double size, double price, int floorNumber) {
        super(address, size, price);
        if (floorNumber < 0) {
            this.floorNumber = 0;
        } else {
            this.floorNumber = floorNumber;
        }
    }

    @Override
    public String toString() {
        return "Apartment -> " + super.toString() + ", floor: " + floorNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Apartment other = (Apartment) obj;
        return floorNumber == other.floorNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + floorNumber;
    }
}
