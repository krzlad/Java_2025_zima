public class Product {
    public static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 3;
    public Product(){
        if (numberOfProducts < MAX_PRODUCTS) {
            numberOfProducts++;
            System.out.println("Utworzono nowy produkt nr " + numberOfProducts);
        } else {
            System.out.println("Limit produktów osiągnięty.");
        }

    }

    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        System.out.println("Utworzono produktów: " + numberOfProducts + " /" + MAX_PRODUCTS);
    }
}
