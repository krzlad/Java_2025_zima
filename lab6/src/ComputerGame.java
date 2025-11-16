
public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;
    private int ratingsCount;

    public ComputerGame(String title, String producer) {
        this(title, producer, 4);
    }

    public ComputerGame(String title, String producer, int initialCapacity) {
        this.title = (title == null) ? "" : title;
        this.producer = (producer == null) ? "" : producer;
        if (initialCapacity < 1) initialCapacity = 1;
        this.ratings = new double[initialCapacity];
        this.ratingsCount = 0;
    }

    // --- metody na ocenach ---
    public void addRating(double r) {
        if (ratingsCount == ratings.length) {
            // proste powiększanie tablicy x2 (bez importów)
            double[] bigger = new double[ratings.length * 2];
            for (int i = 0; i < ratingsCount; i++) bigger[i] = ratings[i];
            ratings = bigger;
        }
        ratings[ratingsCount] = r;
        ratingsCount++;
    }

    public void removeRatingAt(int index) {
        if (index < 0 || index >= ratingsCount) return;
        for (int i = index; i < ratingsCount - 1; i++) ratings[i] = ratings[i + 1];
        ratingsCount--;
        ratings[ratingsCount] = 0.0; // opcjonalne wyzerowanie
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public double getAverageRating() {
        if (ratingsCount == 0) return 0.0;
        double sum = 0.0;
        for (int i = 0; i < ratingsCount; i++) sum += ratings[i];
        return sum / ratingsCount;
    }

    // --- gettery/settery (hermetyzacja) ---
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = (title == null) ? "" : title; }

    public String getProducer() { return producer; }
    public void setProducer(String producer) { this.producer = (producer == null) ? "" : producer; }

    // Zwracamy KOPIĘ ocen (bez importów – ręcznie)
    public double[] getRatings() {
        double[] copy = new double[ratingsCount];
        for (int i = 0; i < ratingsCount; i++) copy[i] = ratings[i];
        return copy;
    }

    public void setRatings(double[] newRatings) {
        if (newRatings == null) {
            ratings = new double[4];
            ratingsCount = 0;
            return;
        }
        ratings = new double[Math.max(1, newRatings.length)];
        ratingsCount = newRatings.length;
        for (int i = 0; i < ratingsCount; i++) ratings[i] = newRatings[i];
    }

    @Override
    public String toString() {
        return "ComputerGame{title='" + title + "', producer='" + producer +
                "', ratingsCount=" + ratingsCount + ", avg=" + getAverageRating() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComputerGame other = (ComputerGame) obj;
        if (!title.equals(other.title)) return false;
        if (!producer.equals(other.producer)) return false;
        if (ratingsCount != other.ratingsCount) return false;
        for (int i = 0; i < ratingsCount; i++) {
            if (ratings[i] != other.ratings[i]) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        // prosty, spójny z equals: bazujemy na tytule, producencie, liczbie i sumie ocen
        int h = (title + producer + ratingsCount).hashCode();
        double sum = 0.0;
        for (int i = 0; i < ratingsCount; i++) sum += ratings[i];
        // mieszamy sumę w int bez importów
        long bits = Double.doubleToLongBits(sum);
        h = 31 * h + (int)(bits ^ (bits >>> 32));
        return h;
    }
}
