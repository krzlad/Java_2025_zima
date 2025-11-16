public class Point {
    public double x;
    public double y;

    public double distance(Point otherPoint){
        double dx = x - otherPoint.x;
        double dy = y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy); //jakiś wzór z neta nw czy dobry ale chyba jo
    }

    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        Point p2 = new Point();
        p2.x = 5;
        p2.y = 6;

        double dist = p1.distance(p2);
        System.out.println("Odległość między punktami p1 a p2 to: " + dist);
    }
}
