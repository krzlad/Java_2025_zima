public class Property {
    private String address;
    private double size;
    private double price;

    public Property(String address, double size, double price) {
        if (address == null || address.isEmpty()) {
            this.address = "";
        } else {
            this.address = address;
        }

        if (size < 0) {
            this.size = 0;
        } else {
            this.size = size;
        }

        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Property at " + address + ", size: " + size + "m^2, price: " + price + " PLN";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Property other = (Property) obj;
        return size == other.size &&
                price == other.price &&
                address.equals(other.address);
    }

    @Override
    public int hashCode() {
        return (address + size + price).hashCode();
    }
}
