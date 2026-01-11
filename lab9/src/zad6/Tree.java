package zad6;

class Plant {
    String name;
    public Plant(String name) { this.name = name; }
}

public class Tree extends Plant implements Comparable<Tree> {
    private int height;

    public Tree(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() { return height; }

    @Override
    public int compareTo(Tree o) {
        return Integer.compare(this.height, o.height);
    }

    @Override
    public String toString() {
        return name + " (" + height + "m)";
    }

    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result) {
        if (trees == null || trees.length == 0) return;
        Tree min = trees[0];
        Tree max = trees[0];

        for (Tree t : trees) {
            if (t.getHeight() < min.getHeight()) min = t;
            if (t.getHeight() > max.getHeight()) max = t;
        }
        result.setFirst(min);
        result.setSecond(max);
    }
}