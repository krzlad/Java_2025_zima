package zad2;

// Zadanie 1
public class Triple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }

    public static void main(String[] args) {
        System.out.println("Zadanie 1");

        Triple<String, Integer, Double> triple = new Triple<>("Test", 1, 2.5);
        System.out.println(triple.getFirst() + " " + triple.getSecond() + " " + triple.getThird());
    }
}